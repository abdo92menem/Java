import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame implements MouseListener{
	
	JLabel label;
	
	ImageIcon smile;
	ImageIcon nervous;
	ImageIcon dizzy;
	ImageIcon pain;
	
	/* Constructor */
	public MyFrame() {

		/* Frame */
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 500);
		//this.addMouseListener(this);
		this.setLayout(new FlowLayout());
		//this.getContentPane().setBackground(Color.black);
		
		
		/* Icon */
		smile = new ImageIcon("smile.jpg");
		nervous = new ImageIcon("nervous.jpg");
		dizzy = new ImageIcon("dizzy.jpg");
		pain = new ImageIcon("pain.png");
		
		
		/* Label */
		label = new JLabel();
		//label.setBounds(0, 0, 200, 200);
		label.addMouseListener(this);
		label.setBackground(Color.red);
		label.setOpaque(true);
		
		label.setIcon(smile);
		
		this.add(label);
		
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		//System.out.println("You clicked the mouse");
		
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		label.setIcon(pain);
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		label.setIcon(dizzy);
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		label.setIcon(nervous);
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		label.setIcon(smile);
		
	}
}
