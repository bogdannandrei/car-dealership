

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JLayeredPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;

import net.proteanit.sql.DbUtils;

import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class addEditData extends JFrame{

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addEditData window = new addEditData();
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
	public addEditData() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	static final String DB_URL = "jdbc:mysql://localhost/reprezentanta";
	static final String USER = "root";
	static final String PASS = "Bogdan80";
	private JTextField IDrepr_delete;
	private JTable table;
	private JTextField txtfldIDRepr_edit;
	private JTextField txtfldAdrRepr_edit;
	private JTextField txtfldLoc_edit;
	private JTextField txtfldNrTlf_edit;
	private JTextField txtfldAdrRepr_add;
	private JTextField txtfldLoc_add;
	private JTextField txtfldNrTlf_add;
	
	private void initialize() {
		String[] actiuni = {"adaugare","editare","stergere"};
		String[] tabele = {"reprezentanta"};
		setBounds(100, 100, 569, 482);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 555, 455);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblActiune = new JLabel("Selectati actiunea:");
		lblActiune.setBounds(10, 20, 114, 24);
		panel.add(lblActiune);
		
		JLabel lblTabel = new JLabel("Selectati tabelul:");
		lblTabel.setBounds(10, 64, 94, 13);
		panel.add(lblTabel);
		
		JComboBox actiuniComboBox = new JComboBox(actiuni);
		actiuniComboBox.setBounds(152, 22, 140, 21);
		panel.add(actiuniComboBox);
		
		JComboBox tabeleComboBox = new JComboBox(tabele);
		tabeleComboBox.setBounds(152, 60, 140, 21);
		panel.add(tabeleComboBox);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 123, 254, 322);
		panel.add(layeredPane);
		
		JPanel panel_delete = new JPanel();
		panel_delete.setBounds(0, 0, 254, 322);
		layeredPane.add(panel_delete);
		panel_delete.setLayout(null);
		
		JLabel lblAddIDRepr_add = new JLabel("ID Reprezentanta");
		lblAddIDRepr_add.setBounds(10, 22, 132, 23);
		panel_delete.add(lblAddIDRepr_add);
		
		JButton deleteBtn = new JButton("STERGE");
		deleteBtn.setBounds(10, 61, 105, 21);
		panel_delete.add(deleteBtn);
		
		IDrepr_delete = new JTextField();
		IDrepr_delete.setBounds(152, 24, 96, 19);
		panel_delete.add(IDrepr_delete);
		IDrepr_delete.setColumns(10);
		
		JPanel panel_edit = new JPanel();
		panel_edit.setLayout(null);
		panel_edit.setBounds(0, 0, 254, 322);
		layeredPane.add(panel_edit);
		
		JLabel lblEditIDRepr_add_1 = new JLabel("ID Reprezentanta");
		lblEditIDRepr_add_1.setBounds(10, 22, 113, 23);
		panel_edit.add(lblEditIDRepr_add_1);
		
		JLabel lblAdresaReprezentanta_edit = new JLabel("Adresa reprezentanta");
		lblAdresaReprezentanta_edit.setBounds(10, 55, 132, 23);
		panel_edit.add(lblAdresaReprezentanta_edit);
		
		JLabel lblLocalitate_edit = new JLabel("Localitate");
		lblLocalitate_edit.setBounds(10, 88, 132, 23);
		panel_edit.add(lblLocalitate_edit);
		
		JLabel lblNumarTelefon_edit = new JLabel("Numar telefon");
		lblNumarTelefon_edit.setBounds(10, 121, 132, 23);
		panel_edit.add(lblNumarTelefon_edit);
		
		JButton editBtn = new JButton("EDITEAZA");
		editBtn.setBounds(10, 172, 105, 21);
		panel_edit.add(editBtn);
		
		txtfldIDRepr_edit = new JTextField();
		txtfldIDRepr_edit.setColumns(10);
		txtfldIDRepr_edit.setBounds(127, 24, 37, 19);
		panel_edit.add(txtfldIDRepr_edit);
		
		txtfldAdrRepr_edit = new JTextField();
		txtfldAdrRepr_edit.setColumns(10);
		txtfldAdrRepr_edit.setBounds(152, 57, 96, 19);
		panel_edit.add(txtfldAdrRepr_edit);
		
		txtfldLoc_edit = new JTextField();
		txtfldLoc_edit.setColumns(10);
		txtfldLoc_edit.setBounds(152, 90, 96, 19);
		panel_edit.add(txtfldLoc_edit);
		
		txtfldNrTlf_edit = new JTextField();
		txtfldNrTlf_edit.setColumns(10);
		txtfldNrTlf_edit.setBounds(152, 123, 96, 19);
		panel_edit.add(txtfldNrTlf_edit);
		
		JButton btnCheckEdit = new JButton("Check");
		btnCheckEdit.setBounds(174, 23, 73, 21);
		panel_edit.add(btnCheckEdit);
		
		JPanel panel_add = new JPanel();
		panel_add.setLayout(null);
		panel_add.setBounds(0, 0, 254, 322);
		layeredPane.add(panel_add);
		
		JLabel lblAdresaReprezentanta_add_1 = new JLabel("Adresa reprezentanta");
		lblAdresaReprezentanta_add_1.setBounds(10, 22, 132, 23);
		panel_add.add(lblAdresaReprezentanta_add_1);
		
		JLabel lblLocalitate_add_1 = new JLabel("Localitate");
		lblLocalitate_add_1.setBounds(10, 55, 132, 23);
		panel_add.add(lblLocalitate_add_1);
		
		JLabel lblNumarTelefon_add_1 = new JLabel("Numar telefon");
		lblNumarTelefon_add_1.setBounds(10, 88, 132, 23);
		panel_add.add(lblNumarTelefon_add_1);
		
		JButton addBtn_1 = new JButton("ADAUGA");
		addBtn_1.setBounds(10, 121, 105, 21);
		panel_add.add(addBtn_1);
		
		txtfldAdrRepr_add = new JTextField();
		txtfldAdrRepr_add.setColumns(10);
		txtfldAdrRepr_add.setBounds(152, 24, 96, 19);
		panel_add.add(txtfldAdrRepr_add);
		
		txtfldLoc_add = new JTextField();
		txtfldLoc_add.setColumns(10);
		txtfldLoc_add.setBounds(152, 53, 96, 19);
		panel_add.add(txtfldLoc_add);
		
		txtfldNrTlf_add = new JTextField();
		txtfldNrTlf_add.setColumns(10);
		txtfldNrTlf_add.setBounds(152, 90, 96, 19);
		panel_add.add(txtfldNrTlf_add);
		
		JButton btnSave = new JButton("Salveaza");
		btnSave.setBounds(332, 22, 85, 21);
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String actiuniCB = (String) actiuniComboBox.getSelectedItem();
				String tabeleCB = (String) tabeleComboBox.getSelectedItem();
				if(actiuniCB.equals("adaugare")) {
					layeredPane.removeAll();
					layeredPane.add(panel_add);
				}
				else if(actiuniCB.equals("editare")) {
					layeredPane.removeAll();
					layeredPane.add(panel_edit);
				}
				else if(actiuniCB.equals("stergere")) {
					layeredPane.removeAll();
					layeredPane.add(panel_delete);
				}
			}
		});
		panel.add(btnSave);
		
		table = new JTable();
		table.setBounds(264, 123, 281, 188);
		panel.add(table);
		
		JButton showTable = new JButton("Arata tabel");
		showTable.setBounds(439, 92, 106, 21);
		showTable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				{
					try {
						Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
						String query="select * from "+tabeleComboBox.getSelectedItem()+";";
						PreparedStatement pst=conn.prepareStatement(query);
						ResultSet rs=pst.executeQuery();
						table.setModel(DbUtils.resultSetToTableModel(rs));
						pst.close();
						rs.close();
					} catch (Exception x) {
						// TODO: handle exception
					}
				}
			}
		});
		panel.add(showTable);
		
		addBtn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				{
					try {
						String adrRepr = txtfldAdrRepr_add.getText();
						String localitate = txtfldLoc_add.getText();
						String nrTlf = txtfldNrTlf_add.getText();
						Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
						String query="insert into reprezentanta(adresa_reprezentanta,localitate,numar_telefon) "
								+ "values ('"+adrRepr+"','"+localitate+"','"+nrTlf+"')";
						PreparedStatement pst=conn.prepareStatement(query);
						pst.executeUpdate();
						pst.close();
					} catch (Exception x) {
						// TODO: handle exception
					}
				}
			}
		});
		btnCheckEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				{
					try {
						Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
						String query="select * from reprezentanta where id_reprezentanta="+txtfldIDRepr_edit.getText()+";";
						PreparedStatement pst=conn.prepareStatement(query);
						ResultSet rs=pst.executeQuery();
						while(rs.next()) {
							txtfldAdrRepr_edit.setText(rs.getString(2));
							txtfldLoc_edit.setText(rs.getString(3));
							txtfldNrTlf_edit.setText(rs.getString(4));
						}
						pst.close();
					} catch (Exception x) {
						// TODO: handle exception
					}
				}
			}
		});
		editBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String ID_edit = txtfldIDRepr_edit.getText();
					Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
					String updateQuery = "update reprezentanta set adresa_reprezentanta='"+txtfldAdrRepr_edit.getText()+"'"
							+ ",localitate='"+txtfldLoc_edit.getText()+"',numar_telefon='"+txtfldNrTlf_edit.getText()+"' where id_reprezentanta="+
							ID_edit+";";
					System.out.println(updateQuery);
					PreparedStatement pst=conn.prepareStatement(updateQuery);
					pst.executeUpdate();
					pst.close();
				} catch (Exception x) {
					// TODO: handle exception
				}
			}
		});
		deleteBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
					String query="delete from reprezentanta where id_reprezentanta="+IDrepr_delete.getText()+";";
					PreparedStatement pst=conn.prepareStatement(query);
					pst.executeUpdate();
					pst.close();
				} catch (Exception x) {
					// TODO: handle exception
				}
			}
		});
	}
}
