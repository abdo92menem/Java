import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class MyFrame extends JFrame implements ActionListener {

	JRadioButton pizzaButton;
	JRadioButton hamburgerButton;
	JRadioButton hotdogButton;
	ImageIcon pizzaIcon;
	ImageIcon hamburgerIcon;
	ImageIcon hotdogIcon;
	
	public MyFrame() {
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		/* Icons */
		pizzaIcon = new ImageIcon("pizza.png");
		hamburgerIcon = new ImageIcon("hamb.png");
		hotdogIcon = new ImageIcon("hotdog.jpg");
		
		/* Radio Button */
		pizzaButton = new JRadioButton("Pizza");
		hamburgerButton = new JRadioButton("Hamburger");
		hotdogButton = new JRadioButton("Hotdog");
		
		pizzaButton.setIcon(pizzaIcon);
		hamburgerButton.setIcon(hamburgerIcon);
		hotdogButton.setIcon(hotdogIcon);

		/* Button Group */
		ButtonGroup group = new ButtonGroup();
		group.add(pizzaButton);
		group.add(hamburgerButton);
		group.add(hotdogButton);
		
		pizzaButton.addActionListener(this);
		hamburgerButton.addActionListener(this);
		hotdogButton.addActionListener(this);
		
		this.add(pizzaButton);
		this.add(hamburgerButton);
		this.add(hotdogButton);
		
		this.pack();
		this.setVisible(true);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==pizzaButton) {
			System.out.println("You ordered Pizza !!!");
		} else if(e.getSource()==hamburgerButton) {
			System.out.println("You ordered Hamburger !!!");
		} else if(e.getSource()==hotdogButton) {
			System.out.println("You ordered Hotdog !!!");
		}
		
	}

}
