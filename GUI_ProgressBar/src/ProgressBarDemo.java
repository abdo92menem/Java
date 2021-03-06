import java.awt.Color;
import java.awt.Font;

import javax.swing.*;

public class ProgressBarDemo {
	
	JFrame frame = new JFrame();
	JProgressBar bar = new JProgressBar(0, 500);
	
	public ProgressBarDemo() {
		
		/* Bar */
		bar.setValue(0);
		bar.setBounds(0, 0, 420, 50);
		bar.setStringPainted(true);;
		bar.setFont(new Font("Arial", Font.BOLD, 25));
		bar.setForeground(Color.red);
		bar.setBackground(Color.black);
		
		frame.add(bar);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 420);
		frame.setLayout(null);
		frame.setVisible(true);
		
		fill();
		
	
	}
	
	public void fill() {
		
		int i = 0;
		while (i <= 500 ) {
			bar.setValue(i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			i+=10;
		}
		bar.setForeground(Color.green);
		bar.setString("Done");
		
	}
	
}
