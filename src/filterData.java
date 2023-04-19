import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;

import net.proteanit.sql.DbUtils;

import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class filterData extends JFrame{

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					filterData window = new filterData();
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	static final String DB_URL = "jdbc:mysql://localhost/reprezentanta";
	static final String USER = "root";
	static final String PASS = "Bogdan80";
	private JTextField keyTxtfld;
	private JTable table;
	private String query;
	/**
	 * Create the application.
	 */
	public filterData() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		String[] tabele = {"angajat","asigurare","client","dotare","functie","masina","piesa","reprezentanta"}; 
		setBounds(100, 100, 848, 486);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 834, 449);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblTable = new JLabel("Selecteaza tabelul: ");
		lblTable.setBounds(10, 10, 134, 23);
		panel.add(lblTable);
		
		JComboBox cmbTabele = new JComboBox(tabele);
		cmbTabele.setBounds(154, 11, 188, 21);
		panel.add(cmbTabele);
		
		JLabel lblCheie = new JLabel("Cuvantul cheie:");
		lblCheie.setBounds(10, 43, 134, 23);
		panel.add(lblCheie);
		
		keyTxtfld = new JTextField();
		keyTxtfld.setBounds(154, 45, 188, 19);
		panel.add(keyTxtfld);
		keyTxtfld.setColumns(10);
		
		JButton btnSave = new JButton("Salveaza");
		btnSave.setBounds(10, 76, 85, 21);
		panel.add(btnSave);
		
		table = new JTable();
		table.setBounds(10, 111, 824, 261);
		panel.add(table);
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				String key = keyTxtfld.getText();
				String cmb = (String)cmbTabele.getSelectedItem();
				Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
				if(cmb.equals("angajat")) {
					query = "select * from angajat where id_angajat like '%"+key+"%' or  id_functie like '%"+key+"%' or nume_angajat like '%"+key+"%' or  prenume_angajat like '%"+key+"%'  or "
							+ "data_nasterii like STR_TO_DATE('"+key+"','%d-%m-%Y') or  ore_lucrate like '"+key+"';";
				}
				else if (cmb.equals("asigurare")) {
					query = "select * from asigurare where id_asigurare like '%"+key+"%' or id_client like '%"+key+"%' or  id_masina like'%"+key+"%' or  firma_asigurare like'%"+key+"%' or"
							+ " tip_asigurare like '%"+key+"%' or  durata_asigurare like '%"+key+"%' or pret_asigurare like'%"+key+"%';";
				}
				else if (cmb.equals("client")) {
					query = "select * from client where  id_client like '%"+key+"%' or nume_client like '%"+key+"%' or prenume_client like '%"+key+"%' or  data_nasterii like STR_TO_DATE('%"+key+"%','%d-%m-%Y') or  adresa_client like '%"+key+"%';";
					
				}
				else if(cmb.equals("dotare")) {
					query = "select * from dotare where id_dotare like'%"+key+"%' or nume_dotare like '%"+key+"%' or descriere_dotare like '%"+key+"%' or pret_dotare like '%"+key+"%';";
				}
				else if(cmb.equals("functie")) {
					query = "select * from dotare where id_functie like'%"+key+"%' or nume_functie like '%"+key+"%' or salariu_pe_ora like '%"+key+"%';";
				}
				else if(cmb.equals("masina")) {
					query = "select * from masina where id_masina like '%"+key+"%' or id_reprezentanta like '%"+key+"%' or  marca like '%"+key+"%'"
							+ " or model like '%"+key+"%' or an_fabricatie like '%"+key+"%' or capacitate_cilindrica like '%"+key+"%' "
							+ " or combustibil like '%"+key+"%' or cod_motor like '%"+key+"%' or  tip_masina like '%"+key+"%' "
							+ " or pret like '%"+key+"%' or  kilometraj like '%"+key+"%' or  eligibil_rabla like '%"+key+"%';";
				}
				else if(cmb.equals("piesa")){
					query = "select * from piesa where cod_motor like '%"+key+"%' or nume_piesa like '%"+key+"%' or pret_piesa like '%"+key+"%';";
				}
				else if(cmb.equals("reprezentanta")) {
					query = "select * from reprezentanta where id_reprezentanta like '%"+key+"%' or adresa_reprezentanta like '%"+key+"%' or localitate like '%"+key+"%' or numar_telefonlike '%"+key+"%';";
				}
				else if(cmb.equals("test_drive")) {
					
				}
				System.out.println(query);
				PreparedStatement pst=conn.prepareStatement(query);
				ResultSet rs=pst.executeQuery();
				table.setModel(DbUtils.resultSetToTableModel(rs));
				pst.close();
				rs.close();
				} catch (Exception x) {
					// TODO: handle exception
				}
			}
		});
	}
}
