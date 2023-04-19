import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Window1 extends JFrame implements ActionListener{
	public Window1() {
	}
	
	private static JFrame frame;
	private static JPanel panel;
	private static JLabel utilizatorLabel;
	private static JTextField utilizator;
	private static JLabel parolaLabel;
	private static JPasswordField parola;
	private static JButton login;
	
	protected static int rol=0;
	private static Window2 w2;
	
	public int getRol() {
	    return rol;
	}
	
	public static void main(String[] args) {
		showWindow();
	}
	
	public static void showWindow() {
			
		 	frame = new JFrame("REPREZENTANTA AUTO");
		 	panel = new JPanel();
			frame.setSize(400, 200);
			frame.setLocationRelativeTo(null);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.getContentPane().add(panel);
			panel.setLayout(null);
			
			utilizatorLabel = new JLabel("Utilizator");
			utilizatorLabel.setBounds(76,20,57,25);
			panel.add(utilizatorLabel);

			utilizator = new JTextField(40);
			utilizator.setBounds(145,20,165,25);
			panel.add(utilizator);
			
			parolaLabel = new JLabel("Parola");
			parolaLabel.setBounds(76,50,57,25);
			panel.add(parolaLabel);
			
			parola = new JPasswordField(40);
			parola.setBounds(145,50,165,25);
			panel.add(parola);
			
			login = new JButton("Logare");
			login.setBounds(155,87,80,25);
			panel.add(login);
			login.addActionListener(new Window1());
			
			success = new JLabel(" ");
			success.setHorizontalAlignment(SwingConstants.CENTER);
			success.setBounds(12,115,358,25);	
			panel.add(success);
			frame.setVisible(true);
	}

	private static JLabel success;
	public void actionPerformed(ActionEvent e){
		
		String user = utilizator.getText();
		String password = parola.getText();
		Window2 w2 = new Window2();
		
		if (user.equals("admin") && password.equals("admin")) {
			rol = 1;
			success.setText("Logat ca admin.");
			frame.setVisible(false);
			w2.showWindow();
		}
		else if (user.equals("manager") && password.equals("manager")) {
			rol = 2;
			success.setText("Logat ca manager.");
			frame.setVisible(false);
			w2.showWindow();
		}
		else if (user.equals("consi") && password.equals("consi")) {
			rol = 3;
			success.setText("Logat ca si consilier de vanzari.");
			frame.setVisible(false);
			w2.showWindow();
		}
		else if (user.equals("mecanic") && password.equals("mecanic")) {
			rol = 4;
			success.setText("Logat ca mecanic.");
			frame.setVisible(false);
			w2.showWindow();
		}
		else if (user.equals("client") && password.equals("client")) {
			rol = 5;
			success.setText("Logat ca si client.");
			frame.setVisible(false);
			w2.showWindow();
		}
		else
			success.setText("User sau parola gresite.");
	
		
	}
}
