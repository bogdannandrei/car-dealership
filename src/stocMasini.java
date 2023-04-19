import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mysql.cj.xdevapi.PreparableStatement;

import net.proteanit.sql.DbUtils;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Window;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class stocMasini extends JFrame {
	
	private JPanel contentPane;
	private JTable table;
	private JComboBox comboBoxFiltru;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					stocMasini window = new stocMasini();
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public stocMasini(){
		initialize();
	}

	/**
	 * Create the frame.
	 */
	static final String DB_URL = "jdbc:mysql://localhost/reprezentanta";
	static final String USER = "root";
	static final String PASS = "Bogdan80";
	private JTextField textField;
	
	private void initialize() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1036, 580);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JButton incarcaTabel = new JButton("Incarca tabel");
		incarcaTabel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
					String query="select * from masina;";
					PreparedStatement pst=conn.prepareStatement(query);
					ResultSet rs=pst.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
					pst.close();
					rs.close();
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		});
		incarcaTabel.setBounds(826, 21, 170, 25);
		panel.add(incarcaTabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 59, 984, 451);
		panel.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JButton inapoi = new JButton("Iesire");
		inapoi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		inapoi.setBounds(12, 21, 170, 25);
		panel.add(inapoi);
		
		JButton testDrive = new JButton("Programeaza Test-Drive");
		testDrive.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				programeazaTestDrive pT = new programeazaTestDrive();
				pT.setVisible(true);
			}
		});
		testDrive.setFont(new Font("Tahoma", Font.PLAIN, 12));
		testDrive.setBounds(462, 21, 170, 25);
		panel.add(testDrive);
		
		JButton configurator = new JButton("Configureaza o masina");
		configurator.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				creazaMasina cM = new creazaMasina();
				cM.setVisible(true);
			}
		});
		configurator.setBounds(644, 21, 170, 25);
		panel.add(configurator);
		
		comboBoxFiltru = new JComboBox();
		comboBoxFiltru.setModel(new DefaultComboBoxModel(new String[] {"Marca", "Model", "An _fabricatie", "Capacitate_cilindrica", "Combustibil", "Cod_motor", "Tip_masina", "Pret", "Kilometraj", "Eligibil_RABLA"}));
		comboBoxFiltru.setBounds(194, 22, 127, 22);
		panel.add(comboBoxFiltru);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				try {
					Connection conn;
					conn = DriverManager.getConnection(DB_URL, USER, PASS);
					String selection=(String)comboBoxFiltru.getSelectedItem();
					String query="select * from masina where "+selection+"=?;";
					PreparedStatement pst=conn.prepareStatement(query);
					pst.setString(1,textField.getText());
					ResultSet rs=pst.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
					pst.close();
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}
		});
		textField.setBounds(334, 22, 116, 22);
		panel.add(textField);
		textField.setColumns(10);
	}
}
