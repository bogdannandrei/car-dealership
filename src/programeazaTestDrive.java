import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class programeazaTestDrive extends JFrame{

	private JFrame frame;
	private JComboBox masinaComboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					programeazaTestDrive window = new programeazaTestDrive();
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
	static final String DB_URL = "jdbc:mysql://localhost/testdb";
	static final String USER = "root";
	static final String PASS = "bogdan";
	
	public programeazaTestDrive() {
		initialize();
	}
	
	public void fillComboBox() {
		try {
			Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
			String query="select * from masina where tip_masina='test-drive';";
			PreparedStatement pst=conn.prepareStatement(query);
			ResultSet rs=pst.executeQuery();
			while(rs.next()) {
				String marca = rs.getString("Marca");
				String model = rs.getString("Model");
				masinaComboBox.addItem(marca+" "+model);
			}
			pst.close();
			rs.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 631, 282);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Alege masina");
		lblNewLabel.setBounds(12, 32, 100, 16);
		frame.getContentPane().add(lblNewLabel);
		
		masinaComboBox = new JComboBox();
		masinaComboBox.setBounds(280, 29, 164, 22);
		frame.getContentPane().add(masinaComboBox);
		fillComboBox();
		
		JLabel dataLabel = new JLabel("Alegeti data");
		dataLabel.setBounds(12, 75, 100, 16);
		frame.getContentPane().add(dataLabel);
		
		JComboBox anCombo = new JComboBox();
		anCombo.setModel(new DefaultComboBoxModel(new String[] {"2021"}));
		anCombo.setBounds(482, 72, 89, 22);
		frame.getContentPane().add(anCombo);
		
		JComboBox ziCombo = new JComboBox();
		ziCombo.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		ziCombo.setBounds(280, 72, 89, 22);
		frame.getContentPane().add(ziCombo);
		
		JComboBox lunaCombo = new JComboBox();
		lunaCombo.setModel(new DefaultComboBoxModel(new String[] {"ian", "feb", "mar", "apr", "mai", "iun", "iul", "aug", "sept", "oct", "noi", "dec"}));
		lunaCombo.setBounds(381, 72, 89, 22);
		frame.getContentPane().add(lunaCombo);
		
		JLabel lblNewLabel_1 = new JLabel("Pentru cate zile \r\ndoriti sa testati masina?");
		lblNewLabel_1.setBounds(12, 118, 261, 22);
		frame.getContentPane().add(lblNewLabel_1);
		
		JComboBox durataCombo = new JComboBox();
		durataCombo.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		durataCombo.setBounds(280, 118, 89, 22);
		frame.getContentPane().add(durataCombo);
		
		JButton btnNewButton = new JButton("Rezervati");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, "Masina a fost rezervata. Veti fi contactat de un consilier de vanzari in curand.");
			}
		});
		btnNewButton.setBounds(504, 197, 97, 25);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnIesire = new JButton("Iesire");
		btnIesire.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnIesire.setBounds(12, 197, 97, 25);
		frame.getContentPane().add(btnIesire);
	}

}
