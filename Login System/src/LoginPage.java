import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import java.util.HashMap;
import javax.swing.*;

public class LoginPage implements ActionListener{
	
	HashMap<String, String> loginInfo = new HashMap<String, String>();
	
	JFrame frame = new JFrame();
	JButton loginButton = new JButton();
	JButton resetButton = new JButton();
	JTextField userIDField = new JTextField();
	JPasswordField userPasswordField = new JPasswordField();
	JLabel userIDLabel = new JLabel();
	JLabel userPasswordLabel = new JLabel();
	JLabel message = new JLabel();
	
	
	/* Constructor */
	public LoginPage(HashMap<String, String> loginInfoOriginal) {
		
		loginInfo = loginInfoOriginal;
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 420);
		frame.setLayout(null);
		
		userIDLabel.setText("User Name:");
		userIDLabel.setBounds(10, 100, 90, 30);
		userIDLabel.setFont(new Font("Arial", Font.BOLD, 15));
		userIDLabel.setOpaque(true);
		
		userPasswordLabel.setText("Password:");
		userPasswordLabel.setBounds(10, 140, 80, 30);
		userPasswordLabel.setFont(new Font("Arial", Font.BOLD, 15));
		userPasswordLabel.setOpaque(true);
		
		userIDField.setBounds(100, 100, 250, 30);
		userPasswordField.setBounds(100, 140, 250, 30);
		
		loginButton.setText("Login");
		loginButton.setFont(new Font(null, Font.PLAIN, 15));
		loginButton.setBounds(115, 220, 100, 40);
		loginButton.addActionListener(this);
		loginButton.setFocusable(false);
		
		resetButton.setText("Reset");
		resetButton.setFont(new Font(null, Font.PLAIN, 15));
		resetButton.setBounds(225, 220, 100, 40);
		resetButton.addActionListener(this);
		resetButton.setFocusable(false);
		
		message.setFont(new Font("Time New Roman", Font.ITALIC, 30));
		message.setBounds(70, 300, 300, 60);
		
		frame.add(userIDField);
		frame.add(userPasswordField);
		frame.add(userIDLabel);
		frame.add(userPasswordLabel);
		frame.add(loginButton);
		frame.add(resetButton);
		frame.add(message);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == resetButton) {
			userIDField.setText("");
			userPasswordField.setText("");
		}
		if (e.getSource() == loginButton) {
			String userName = userIDField.getText();
			String Password = String.valueOf(userPasswordField.getPassword());
			
			if (loginInfo.containsKey(userName)) {
				if (loginInfo.get(userName).equals(Password)) {
					message.setForeground(Color.green);
					message.setText("Login Successful");
					frame.dispose();
					WelcomePage welcomePage = new WelcomePage();
				}
				else {
					message.setForeground(Color.red);
					message.setText("Invalid Password");
				}
			}
			else {
				message.setForeground(Color.red);
				message.setText("Username not found");
			}
		}
		
	}
}
