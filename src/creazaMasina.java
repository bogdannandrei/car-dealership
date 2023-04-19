
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.border.EmptyBorder;

public class creazaMasina extends JFrame{

	private JPanel contentPane;
	private JPanel panel;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					creazaMasina window = new creazaMasina();
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
	public creazaMasina() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 490, 771);
		final String[] marci = {"Volkswagen", "Skoda", "SEAT", "Lamborghini", "Audi","Porsche","Mazda","Hyundai","KIA"};
		final String[] modele ={"Golf","Taycan","Huracan","Aventador","Bayon","Tucson","Leon","Sportage","Cayenne","Octavia","Karoq"};
		final String[] combustibili={"benzina","diesel","electric"};
		final String[] coduri_motor={"AZMB","HAUB","MIAU","IAAA"};
		
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel labelMarca = new JLabel("Marca");
		labelMarca.setFont(new Font("Tahoma", Font.PLAIN, 13));
		labelMarca.setBounds(12, 24, 138, 24);
		panel.add(labelMarca);
		
		JComboBox marcaCombo = new JComboBox(marci);
		marcaCombo.setBounds(196, 26, 200, 22);
		panel.add(marcaCombo);
		String marcaC = new  String((String)marcaCombo.getSelectedItem());
		
		
		JLabel labelModel = new JLabel("Model");
		labelModel.setBounds(12, 61, 138, 24);
		panel.add(labelModel);
		
		
		JComboBox modelCombo = new JComboBox(modele);
		modelCombo.setBounds(196, 58, 200, 22);
		panel.add(modelCombo);
		String modelC = new  String((String)modelCombo.getSelectedItem());
		
		JLabel labelCapacitateCilindrica = new JLabel("Capacitate cilindrica");
		labelCapacitateCilindrica.setBounds(33, 590, 138, 24);
		panel.add(labelCapacitateCilindrica);
		
		JSlider sliderCC = new JSlider(2000,4000,3000);
		sliderCC.setBounds(183, 575, 267, 70);
		sliderCC.setPaintTicks(true);
		sliderCC.setMinorTickSpacing(250);
		sliderCC.setPaintTrack(true);
		sliderCC.setMajorTickSpacing(500);
		sliderCC.setPaintLabels(true);
		panel.add(sliderCC);
		
		JLabel labelCombustibil = new JLabel("Combustibil");
		labelCombustibil.setBounds(12, 98, 138, 24);
		panel.add(labelCombustibil);
		
		JComboBox combustibilCombo = new JComboBox(combustibili);
		combustibilCombo.setBounds(196, 93, 200, 22);
		panel.add(combustibilCombo);
		String comb = new  String((String)combustibilCombo.getSelectedItem());
		
		JLabel labelCodMotor = new JLabel("Cod motor");
		labelCodMotor.setBounds(12, 135, 138, 24);
		panel.add(labelCodMotor);
		
		JComboBox comboCodMotor = new JComboBox(coduri_motor);
		comboCodMotor.setBounds(196, 137, 200, 22);
		panel.add(comboCodMotor);
		String codM = new  String((String)comboCodMotor.getSelectedItem());
		
		JLabel tichetRabla = new JLabel("Detineti tichet RABLA?");
		tichetRabla.setBounds(12, 172, 138, 24);
		panel.add(tichetRabla);
		
		JRadioButton rablaDA = new JRadioButton("Da");
		rablaDA.setBounds(196, 172, 56, 25);
		panel.add(rablaDA);
		
		JRadioButton rablaNU = new JRadioButton("Nu");
		rablaNU.setBounds(256, 172, 56, 25);
		panel.add(rablaNU);
		
		ButtonGroup rabla= new ButtonGroup();
		rabla.add(rablaDA);
		rabla.add(rablaNU);
		
		JLabel labelDotari = new JLabel("Dotari");
		labelDotari.setFont(new Font("Tahoma", Font.BOLD, 17));
		labelDotari.setBounds(12, 234, 159, 41);
		panel.add(labelDotari);
		
		JCheckBox clima2zoneCheckBox = new JCheckBox("Clima pe doua zone");
		clima2zoneCheckBox.setBounds(8, 284, 142, 25);
		panel.add(clima2zoneCheckBox);
		
		JCheckBox incalzireScauneCheckBox = new JCheckBox("Incalzire in scaune");
		incalzireScauneCheckBox.setBounds(8, 314, 142, 25);
		panel.add(incalzireScauneCheckBox);
		
		JCheckBox senzoriParcareCheckBox = new JCheckBox("Senzori de parcare");
		senzoriParcareCheckBox.setBounds(8, 344, 142, 25);
		panel.add(senzoriParcareCheckBox);
		
		JLabel pretDotare1 = new JLabel("500");
		pretDotare1.setBounds(158, 288, 56, 16);
		panel.add(pretDotare1);
		
		JLabel pretDotare2 = new JLabel("200");
		pretDotare2.setBounds(158, 318, 56, 16);
		panel.add(pretDotare2);
		
		JLabel pretDotare3 = new JLabel("150");
		pretDotare3.setBounds(158, 348, 56, 16);
		panel.add(pretDotare3);
		
		JCheckBox trapaCheckBox = new JCheckBox("Trapa panoramica");
		trapaCheckBox.setBounds(8, 374, 142, 25);
		panel.add(trapaCheckBox);
		
		JCheckBox cutieAutoCheckBox = new JCheckBox("Cutie automata");
		cutieAutoCheckBox.setBounds(8, 404, 142, 25);
		panel.add(cutieAutoCheckBox);
		
		JCheckBox chckbxPilotAutomatAdaptiv = new JCheckBox("Pilot adaptiv");
		chckbxPilotAutomatAdaptiv.setBounds(8, 434, 142, 25);
		panel.add(chckbxPilotAutomatAdaptiv);
		
		JCheckBox chckbxFaruriLed = new JCheckBox("Faruri LED");
		chckbxFaruriLed.setBounds(8, 465, 142, 25);
		panel.add(chckbxFaruriLed);
		
		JLabel pretDotare4 = new JLabel("1956");
		pretDotare4.setBounds(158, 377, 56, 16);
		panel.add(pretDotare4);
		
		JLabel pretDotare5 = new JLabel("150");
		pretDotare5.setBounds(158, 408, 56, 16);
		panel.add(pretDotare5);
		
		JLabel pretDotare6 = new JLabel("150");
		pretDotare6.setBounds(158, 438, 56, 16);
		panel.add(pretDotare6);
		
		JLabel pretDotare7 = new JLabel("150");
		pretDotare7.setBounds(158, 469, 56, 16);
		panel.add(pretDotare7);
		
		JCheckBox chckbxComenziPeVolan = new JCheckBox("Comenzi pe volan");
		chckbxComenziPeVolan.setBounds(222, 284, 142, 25);
		panel.add(chckbxComenziPeVolan);
		
		JCheckBox chckbxNavigatie = new JCheckBox("Navigatie");
		chckbxNavigatie.setBounds(222, 314, 142, 25);
		panel.add(chckbxNavigatie);
		
		JCheckBox chckbxTapiterieDinPiele = new JCheckBox("Tapiterie din piele");
		chckbxTapiterieDinPiele.setBounds(222, 344, 142, 25);
		panel.add(chckbxTapiterieDinPiele);
		
		JCheckBox chckbxJanteForjate = new JCheckBox("Jante forjate");
		chckbxJanteForjate.setBounds(222, 374, 142, 25);
		panel.add(chckbxJanteForjate);
		
		JCheckBox chckbxGeamuriFumurii = new JCheckBox("Geamuri fumurii");
		chckbxGeamuriFumurii.setBounds(222, 404, 142, 25);
		panel.add(chckbxGeamuriFumurii);
		
		JCheckBox chckbxFranareAutomata = new JCheckBox("Franare automata");
		chckbxFranareAutomata.setBounds(222, 434, 142, 25);
		panel.add(chckbxFranareAutomata);
		
		JCheckBox chckbxHeadsupDisplay = new JCheckBox("Heads-up display");
		chckbxHeadsupDisplay.setBounds(222, 465, 142, 25);
		panel.add(chckbxHeadsupDisplay);
		
		JLabel label = new JLabel("200");
		label.setBounds(372, 288, 56, 16);
		panel.add(label);
		
		JLabel label_1 = new JLabel("1000");
		label_1.setBounds(372, 318, 56, 16);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("1300");
		label_2.setBounds(372, 348, 56, 16);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("3000");
		label_3.setBounds(372, 378, 56, 16);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("150");
		label_4.setBounds(372, 408, 56, 16);
		panel.add(label_4);
		
		JLabel label_5 = new JLabel("500");
		label_5.setBounds(372, 438, 56, 16);
		panel.add(label_5);
		
		JLabel label_6 = new JLabel("600");
		label_6.setBounds(372, 469, 56, 16);
		panel.add(label_6);
		
		JCheckBox chckbxSuspensieAdaptiva = new JCheckBox("Suspensie adaptiva");
		chckbxSuspensieAdaptiva.setBounds(8, 495, 142, 25);
		panel.add(chckbxSuspensieAdaptiva);
		
		JLabel label_7 = new JLabel("560");
		label_7.setBounds(158, 498, 56, 16);
		panel.add(label_7);
		
		
		JButton btnNewButton = new JButton("Calculeaza pret");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int pret=0;
				Component frame = null;
				//marca
				if ((marcaC.equals("Volkswagen")) || (marcaC.equals("Hyundai")))
					pret+=20000;
				if (marcaC.equals("Skoda"))
					pret+=13000;
				if ((marcaC.equals("SEAT")) || (marcaC.equals("KIA")))
					pret+=15000;
				if (marcaC.equals("Lamborghini"))
					pret+=70000;
				if (marcaC.equals("Audi"))
					pret+=30000;
				if (marcaC.equals("Porsche"))
					pret+=40000;
				if (marcaC.equals("Mazda"))
					pret+=18000;
				//model
				if (modelC.equals("Golf"))
					pret+=2000;
				if (modelC.equals("Taycan"))
					pret+=7000;
				if ((modelC.equals("Huracan")) || (modelC.equals("Aventador")) || (modelC.equals("Cayenne")))
					pret+=10000;
				if ((modelC.equals("Bayon") || (modelC.equals("Tucson"))))
					pret+=4000;
				if (modelC.equals("Leon"))
					pret+=1500;
				if ((modelC.equals("Sportage")) || ((modelC.equals("Octavia")) || (modelC.equals("Karoq"))))
					pret+=3000;
				if(clima2zoneCheckBox.isSelected())
					pret+=500;
				if (incalzireScauneCheckBox.isSelected())
					pret+=200;
				if (senzoriParcareCheckBox.isSelected())
					pret+=150;
				if (trapaCheckBox.isSelected())
					pret+=1200;
				if (cutieAutoCheckBox.isSelected())
					pret+=1500;
				if (chckbxPilotAutomatAdaptiv.isSelected())
					pret+=560;
				if (chckbxFaruriLed.isSelected())
					pret+=1954;
				if (chckbxComenziPeVolan.isSelected())
					pret+=200;
				if (chckbxNavigatie.isSelected())
					pret+=1000;
				if(chckbxTapiterieDinPiele.isSelected())
					pret+=1300;
				if(chckbxJanteForjate.isSelected())
					pret+=3000;
				if(chckbxFranareAutomata.isSelected())
					pret+=150;
				if(chckbxHeadsupDisplay.isSelected())
					pret+=400;
				if(chckbxSuspensieAdaptiva.isSelected())
					pret+=560;
				if(chckbxGeamuriFumurii.isSelected())
					pret+=150;
				//combustibili
				if(comb.equals("benzina"))
					pret+=1000;
				if(comb.equals("diesel"))
					pret+=2000;
				if(comb.equals("electric"))
					pret+=5000;
				//cod motor
				if(codM.equals("AZMB"))
					pret+=500;
				if(codM.equals("HAUB"))
					pret+=300;
				if(codM.equals("MIAU"))
					pret+=200;
				if(codM.equals("IAAA"))
					pret+=250;
				//tichet rabla
				if(rablaDA.isSelected())
					pret-=1300;
				pret+=(sliderCC.getValue()*1.5);
				
				JOptionPane.showMessageDialog(frame, "Masina configurata de dumneavoastra costa "+pret+" euro si are capacitatea cilindrica de "+sliderCC.getValue()+".");
			}
			});
		
		btnNewButton.setBounds(334, 676, 128, 25);
		panel.add(btnNewButton);
		
		JButton btnInapoi = new JButton("Iesire");
		btnInapoi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnInapoi.setBounds(12, 676, 128, 25);
		panel.add(btnInapoi);
	}
	}
