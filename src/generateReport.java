import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.log.Logger;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.toedter.calendar.JCalendar;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;
import com.toedter.calendar.JDateChooser;

import net.proteanit.sql.DbUtils;

public class generateReport extends JFrame{

	private JFrame frame;
	private JTable table;
	private Date dataFinal;
	private Date dataInceput;
	static final String DB_URL = "jdbc:mysql://localhost/reprezentanta";
	static final String USER = "root";
	static final String PASS = "Bogdan80";
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					generateReport window = new generateReport();
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public generateReport() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setBounds(100, 100, 795, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 781, 463);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lbl1 = new JLabel("Selecteaza data de inceput:");
		lbl1.setBounds(10, 10, 164, 28);
		panel.add(lbl1);
		
		JLabel lbl2 = new JLabel("Selecteaza data de final:");
		lbl2.setBounds(230, 10, 178, 28);
		panel.add(lbl2);
		
		table = new JTable();
		table.setBounds(10, 203, 761, 250);
		panel.add(table);
		
		JButton generateBtn = new JButton("Genereaza");
		generateBtn.setBounds(617, 172, 154, 21);
		panel.add(generateBtn);
		
		JDateChooser calendarInceput = new JDateChooser();
		calendarInceput.setBounds(10, 36, 127, 19);
		panel.add(calendarInceput);
		
		JDateChooser calendarFinal = new JDateChooser();
		calendarFinal.setBounds(230, 36, 136, 19);
		panel.add(calendarFinal);
		
		JButton btnExport = new JButton("Export in PDF");
		btnExport.setBounds(617, 141, 154, 21);
		panel.add(btnExport);
		generateBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			try {
				Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
				dataInceput = calendarInceput.getDate();
				String strDataInceput = DateFormat.getDateInstance().format(dataInceput);
				dataFinal = calendarFinal.getDate();
				String strDataFinal = DateFormat.getDateInstance().format(dataFinal);
				String query = "select concat(nume_client,' ',prenume_client) as client, concat(angajat.nume_angajat,' ',angajat.prenume_angajat) as angajat, concat(masina.marca,' ',masina.model) "
						+ "as masina,vanzare_masina.data_vanzare_masina,vanzare_masina.pret_final_masina,vanzare_masina.modalitate_plata_masina from client,angajat,masina,vanzare_masina where vanzare_masina.id_client=client.id_client "
						+ "and vanzare_masina.id_angajat=angajat.id_angajat and vanzare_masina.id_masina=masina.id_masina and vanzare_masina.data_vanzare_masina between STR_TO_DATE('"+strDataInceput+"','%b %e, %Y') and STR_TO_DATE('"+strDataFinal+"','%b %e, %Y') order by vanzare_masina.data_vanzare_masina asc;";
				PreparedStatement pst=conn.prepareStatement(query);
				ResultSet rs=pst.executeQuery();
				table.setModel(DbUtils.resultSetToTableModel(rs));
				pst.close();
				rs.close();
			} catch (SQLException x) {
				// TODO Auto-generated catch block
				x.printStackTrace();
			}
			}
		});
		btnExport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
		            Document doc = new Document();
		            PdfWriter.getInstance(doc, new FileOutputStream("table.pdf"));
		            doc.open();
		            PdfPTable pdfTable = new PdfPTable(table.getColumnCount());
		            //adding table headers
		            for (int i = 0; i < table.getColumnCount(); i++) {
		                pdfTable.addCell(table.getColumnName(i));
		            }
		            //extracting data from the JTable and inserting it to PdfPTable
		            for (int rows = 0; rows < table.getRowCount() - 1; rows++) {
		                for (int cols = 0; cols < table.getColumnCount(); cols++) {
		                    pdfTable.addCell(table.getModel().getValueAt(rows, cols).toString());

		                }
		            }
		            doc.add(pdfTable);
		            doc.close();
		            System.out.println("done");
		        } catch (DocumentException ex) {
		            
		        } catch (FileNotFoundException ex) {
		        }
		    }
		});
}
}
