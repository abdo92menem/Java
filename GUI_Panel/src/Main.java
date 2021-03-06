import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) {
		
		/* JPanel = a GUI component that functions as a container to hold other components */
		
		
		/* ImageIcon */
		ImageIcon icon = new ImageIcon("hi.jpg");
		
		/* Label */
		JLabel label = new JLabel();            // create label object
		label.setText("Hello"); 				// set text to label
		label.setIcon(icon);					//set icon to label
//		label.setHorizontalAlignment(JLabel.RIGHT);
//		label.setVerticalAlignment(JLabel.BOTTOM);
		label.setBounds(0, 0, 75, 75);
		
		/* Red panel */
		JPanel redPanel = new JPanel();         // create panel object
		redPanel.setBackground(Color.red);      // set panel background to red
		redPanel.setBounds(0, 0, 250, 250);   // set boundaries of panel
		redPanel.setLayout(null);
		
		/* Blue panel */
		JPanel bluePanel = new JPanel();         // create panel object
		bluePanel.setBackground(Color.blue);      // set panel background to red
		bluePanel.setBounds(250, 0, 250, 250);   // set boundaries of panel
		bluePanel.setLayout(null);
		
		/* Green panel */
		JPanel greenPanel = new JPanel();         // create panel object
		greenPanel.setBackground(Color.green);      // set panel background to red
		greenPanel.setBounds(0, 250, 500, 250);   // set boundaries of panel
		greenPanel.setLayout(null);
		
		JFrame frame = new JFrame();     // create frame object
		frame.setSize(750, 750);         // size of frame
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE); // exit on close button
		frame.setLayout(null);            // layout of frame
		frame.setVisible(true); 		  // frame is visible
		greenPanel.add(label);			   // add label to red panel
		frame.add(redPanel);               // add panel to frame
		frame.add(bluePanel);               // add panel to frame
		frame.add(greenPanel);				// add panel to frame

	}

}
