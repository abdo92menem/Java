import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Main {

	public static void main(String[] args) {

		/* JLabel = a GUI display area for a string of text, an image, or both */
		
		/* Border object*/
		Border border = BorderFactory.createLineBorder(Color.green, 3); // CREATE BORDER
		
		/* Icon object */
		ImageIcon image = new ImageIcon("logo1.png"); // CREATE IMAGEICON FOR LABEL
		
		/* Label object */
		JLabel label = new JLabel();				 // CREATE LABEL INSTANCE
		label.setText("YOU ARE CODING"); 			 // SET TEXT TO LABEL
		label.setIcon(image); 						 // SET ICON TO LABEL
		label.setHorizontalTextPosition(JLabel.CENTER); // SET TEXT RIGHT, CENTER, LEFT OF IMAGE 
		label.setVerticalTextPosition(JLabel.TOP);   // SET TEXT TOP, CENTER, BOTTOM OF THE IMAGE
		label.setForeground(new Color(0X03FFA2));  	 // SET LABEL FOREGROUND COLOR
		label.setFont(new Font("MV BOLI", Font.PLAIN, 50)); // SET FONT STYLE AND SIZE
		label.setIconTextGap(10); // MAKE GAP BETWEEN IMAGE AND LABEL
		label.setBackground(Color.BLACK);    // SET BACKGROUND
		label.setOpaque(true);               // DISPLAY BACKGROUND COLOR
		label.setBorder(border);             // add BORDER to label
		label.setHorizontalAlignment(JLabel.CENTER);  // SET HORIZONTAL POSITION OF TEXT & ICON
		label.setVerticalAlignment(JLabel.CENTER);	  // SET VERTICAL POSITION OF TEXT & ICON
		//label.setBounds(75, 60, 250, 250);			 // SET BOUNDARIES OF LABEL 
		
		/* Frame Object */
		JFrame frame = new JFrame();				 // CREATE FRAME INSTANCE
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setSize(420, 420); 					 // Frame size
		//frame.setLayout(null); 						 // SET FRAME layout
		frame.setVisible(true); 					 // SET FRAME TO VISIBLE
		frame.add(label); 							 // ADD LABEL TO FRAME
		frame.pack();                                // RESIZE FRAME TO CONTENTS OF THE FRAME every thing before pack()

	}

}
