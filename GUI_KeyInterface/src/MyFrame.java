import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame implements KeyListener{
	
	JLabel label;
	ImageIcon icon;
	
	/* Constructor */
	public MyFrame() {

		/* Frame */
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(700, 700);
		this.addKeyListener(this);
		this.setLayout(null);
		this.getContentPane().setBackground(Color.black);
		
		
		/* Icon */
		icon = new ImageIcon("rocket.png");
		
		
		/* Label */
		label = new JLabel();
		label.setBounds(0, 0, 200, 200);
		//label.setBackground(Color.red);
		//label.setOpaque(true);
		label.setIcon(icon);
		
		this.add(label);
		this.setVisible(true);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		switch(e.getKeyChar()) {
			case 'a':
				label.setLocation(label.getX()-10, label.getY());
				break;
			case 'w':
				label.setLocation(label.getX(), label.getY()-10);
				break;
			case 'd':
				label.setLocation(label.getX()+10, label.getY());
				break;
			case 'x':
				label.setLocation(label.getX(), label.getY()+10);
				break;
		}
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		switch(e.getKeyCode()) {
		case 37:
			label.setLocation(label.getX()-10, label.getY());
			break;
		case 38:
			label.setLocation(label.getX(), label.getY()-10);
			break;
		case 39:
			label.setLocation(label.getX()+10, label.getY());
			break;
		case 40:
			label.setLocation(label.getX(), label.getY()+10);
			break;
	}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
