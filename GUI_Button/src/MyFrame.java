import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements ActionListener{
	
	// make global variable
	JButton button;
	JLabel label;
	
	public MyFrame() {
		
		/* Icon instance */
		ImageIcon buttonIcon = new ImageIcon("BUTTON.jpg");
		ImageIcon labelIcon = new ImageIcon("emoji-header.jpg");
		
		/* Label instance */
		label = new JLabel();
		label.setIcon(labelIcon);
		label.setBounds(145, 200, 250, 250);
		label.setVisible(false);
		
		button = new JButton();       // create button instance inside frame class
		button.setBounds(120, 100, 250, 100);  // set bounds of button
		button.addActionListener(this);       // button make action
		button.setText("Submit");             // text to button
		button.setFocusable(false);			  // remove inner border
		button.setIcon(buttonIcon);			  // add icon to button
		button.setHorizontalTextPosition(JButton.CENTER);
		button.setVerticalTextPosition(JButton.BOTTOM);
		button.setFont(new Font("Comic Sans", Font.BOLD, 25));
		button.setIconTextGap(-10);
		button.setForeground(Color.cyan);
		button.setBackground(Color.white);
		button.setBorder(BorderFactory.createEtchedBorder());
		
		 
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500, 500);
		this.setVisible(true);
		this.add(button);
		this.add(label);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button) {
			//System.out.println("Poooo");
			label.setVisible(true);
		}
		
	}

}
