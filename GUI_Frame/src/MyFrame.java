import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame{
	
	public MyFrame() {
		// set title for the frame
		this.setTitle("MY FRAME");
		// set close operation mode (default: HIDE_ON_CLOSE)
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE); // close app
		// make frame resizable or fixed
//		frame.setResizable(false);
		// set dimensions of frame (x, y)
		this.setSize(420, 420);
		// make frame visible
		this.setVisible(true);
		
		// create imageIcon instance to hold icon
		ImageIcon image = new ImageIcon("logo.png");
		// change icon of the frame
		this.setIconImage(image.getImage());
		// change background color
		this.getContentPane().setBackground(new Color(0xEF3FFE));
	}
}
