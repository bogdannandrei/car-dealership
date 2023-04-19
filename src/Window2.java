import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.CardLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Window2 extends JFrame{

	/**
	 * @wbp.parser.entryPoint
	 */
	public static void showWindow() {
		Window1 win1 = new Window1();
		JFrame frame= new JFrame("REPREZENTANTA AUTO");
		frame.setSize(800, 427);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setVisible(true);
		
		JButton stocPiese = new JButton("Verifica stocul de piese");
		stocPiese.setVisible(true);
		stocPiese.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stocPiese stocP = new stocPiese();
				frame.setVisible(false);
				stocP.setVisible(true);
			}
		});
		stocPiese.setForeground(Color.LIGHT_GRAY);
		stocPiese.setBackground(Color.BLACK);
		
		JButton tabelDotari = new JButton("Verifica tabelul cu dotari");
		tabelDotari.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabelDotari tD = new tabelDotari();
				frame.setVisible(false);
				tD.setVisible(true);
			}
		});
		tabelDotari.setForeground(Color.LIGHT_GRAY);
		tabelDotari.setBackground(Color.BLACK);
		tabelDotari.setVisible(true);
		
		JButton tabelAsigurari = new JButton("Verifica tabelul cu asigurari");
		tabelAsigurari.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabelAsigurari tabelA = new tabelAsigurari();
				frame.setVisible(false);
				tabelA.setVisible(true);
			}
		});
		tabelAsigurari.setForeground(Color.LIGHT_GRAY);
		tabelAsigurari.setBackground(Color.BLACK);
		tabelAsigurari.setVisible(true);
		
		JButton tabelMasina = new JButton("Verifica stocul de masini");
		tabelMasina.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stocMasini stocM = new stocMasini();
				frame.setVisible(false);
				stocM.setVisible(true);
			}
		});
		tabelMasina.setForeground(Color.LIGHT_GRAY);
		tabelMasina.setBackground(Color.BLACK);
		tabelMasina.setVisible(true);
		
		JButton tabelAngajat = new JButton("Verifica tabelul cu angajati");
		tabelAngajat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(win1.getRol()==5 || win1.getRol()==4 || win1.getRol()==3)
					JOptionPane.showMessageDialog(frame, "Rolul nu iti permite sa accesezi aceasta sectiune.");
				else
				{
				tabelAngajati tabelA = new tabelAngajati();
				frame.setVisible(false);
				tabelA.setVisible(true);
				}
				
			}
		});
		tabelAngajat.setForeground(Color.LIGHT_GRAY);
		tabelAngajat.setBackground(Color.BLACK);
		tabelAngajat.setVisible(true);
		
		JButton tabelService = new JButton("Verifica programarile la service");
		tabelService.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if((win1.getRol()==4) || (win1.getRol()==1)  || (win1.getRol()==5)) {
					tabelService tabelS = new tabelService();
					frame.setVisible(false);
					tabelS.setVisible(true);
				}
				else
					JOptionPane.showMessageDialog(frame, "Rolul nu iti permite sa accesezi aceasta sectiune.");
			}
		});
		tabelService.setForeground(Color.LIGHT_GRAY);
		tabelService.setBackground(Color.BLACK);
		tabelService.setVisible(true);
		
		JButton tabelClienti = new JButton("Verifica tabelul cu clienti");
		tabelClienti.setForeground(Color.LIGHT_GRAY);
		tabelClienti.setVisible(true);
		tabelClienti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(win1.getRol()==5)
					JOptionPane.showMessageDialog(frame, "Rolul nu iti permite sa accesezi aceasta sectiune.");
				else {
					tabelClienti tabelC = new tabelClienti();
					frame.setVisible(false);
					tabelC.setVisible(true);
				}

			}
		});
		tabelClienti.setBackground(Color.BLACK);
		
		JButton tabeleTranzactii = new JButton("Verifica tabelele cu tranzactii");
		tabeleTranzactii.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(win1.getRol()==5 || win1.getRol()==4)
					JOptionPane.showMessageDialog(frame, "Rolul nu iti permite sa accesezi aceasta sectiune.");
				else {
					tabelTranzactii tabelT = new tabelTranzactii();
					frame.setVisible(false);
					tabelT.setVisible(true);
				}
				
			}
		});
		tabeleTranzactii.setForeground(Color.LIGHT_GRAY);
		tabeleTranzactii.setBackground(Color.BLACK);
		
		
		JLabel logatCaSi = new JLabel("");
			if(win1.getRol()==1)
				logatCaSi.setText("LOGAT CA SI ADMIN.");
			else if(win1.getRol()==2)
				logatCaSi.setText("LOGAT CA SI MANAGER.");
			else if(win1.getRol()==3) 
				logatCaSi.setText("LOGAT CA SI CONSILIER DE VANZARI.");
			else if(win1.getRol()==4) 
				logatCaSi.setText("LOGAT CA SI MECANIC.");
			else if (win1.getRol()==5)
				logatCaSi.setText("LOGAT CA SI CLIENT.");
			else 
				logatCaSi.setText("INITIALIZATI DIN WINDOW1!");
		
		JButton adaugaEditeazaDate = new JButton("Adauga / editeaza date");
		adaugaEditeazaDate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addEditData aed = new addEditData();
				frame.setVisible(false);
				aed.setVisible(true);
			}
		});
		adaugaEditeazaDate.setForeground(Color.LIGHT_GRAY);
		adaugaEditeazaDate.setBackground(Color.BLACK);
		
		JButton filtreazaDate = new JButton("Filtreaza date");
		filtreazaDate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				filterData fd = new filterData();
				frame.setVisible(false);
				fd.setVisible(true);
			}
		});
		filtreazaDate.setForeground(Color.LIGHT_GRAY);
		filtreazaDate.setBackground(Color.BLACK);
		
		JButton genereazaRaport = new JButton("Raport la vanzarea de masini");
		genereazaRaport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				generateReport gr = new generateReport();
				frame.setVisible(false);
				gr.setVisible(true);
			}
		});
		genereazaRaport.setForeground(Color.LIGHT_GRAY);
		genereazaRaport.setBackground(Color.BLACK);

			
	 
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(tabelClienti, GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
								.addComponent(tabelService, GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
								.addComponent(tabelMasina, GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
								.addComponent(stocPiese, GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE))
							.addGap(60)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(adaugaEditeazaDate, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE)
								.addComponent(filtreazaDate, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE)
								.addComponent(genereazaRaport, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE))
							.addGap(64)
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addComponent(tabeleTranzactii, GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
								.addGroup(gl_panel.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(tabelDotari, GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE))
								.addComponent(tabelAngajat, GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
								.addComponent(tabelAsigurari, GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)))
						.addComponent(logatCaSi, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(tabelMasina, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
						.addComponent(tabelAsigurari, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
						.addComponent(adaugaEditeazaDate, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(stocPiese, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
						.addComponent(tabelAngajat, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
						.addComponent(filtreazaDate, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(tabeleTranzactii, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
								.addComponent(tabelService, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE))
							.addGap(25)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(tabelDotari, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
								.addComponent(tabelClienti, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)))
						.addComponent(genereazaRaport, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(logatCaSi, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(27, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
			}

	public static void main(String[] args) {
		showWindow();
	}
}
