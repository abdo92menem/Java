import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class NewWindow {
	
	JFrame frame = new JFrame();
	JLabel label = new JLabel("HELLo!!");
	
	public NewWindow() {
				
		label.setBounds(150, 150, 100, 100);
		label.setFont(new Font("MV Boli", Font.BOLD, 20));
		label.setForeground(Color.darkGray);
		label.setBackground(Color.magenta);
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(label);
		frame.setSize(420, 420);
		frame.setLayout(null);
		frame.setVisible(true);
		

	}
}
