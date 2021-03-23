import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class WelcomePage extends JFrame{
	
	public WelcomePage() {
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(420, 420);
		this.setLayout(null);
		
		JLabel welcomeMessage = new JLabel();
		welcomeMessage.setBounds(130, 130, 200, 100);
		welcomeMessage.setText("Welcome");
		welcomeMessage.setForeground(Color.magenta);
		welcomeMessage.setFont(new Font("Vedrana", Font.BOLD, 30));
		welcomeMessage.setOpaque(true);
		
		this.add(welcomeMessage);
		this.setVisible(true);
	}
	
}
