import javax.swing.JFrame;

public class MyFrame extends JFrame{
	
	MyPanel panel;
	
	/* Constructor */
	public MyFrame() {
		
		panel = new MyPanel();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.add(panel);
		
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		
	}
}
