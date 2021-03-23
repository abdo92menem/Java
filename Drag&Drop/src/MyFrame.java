import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame{
	
	
	DragPanel dragPanel = new DragPanel();
	
	/* Constructor */
	public MyFrame() { 

		/* Frame */
		this.add(dragPanel);
		this.setTitle("Drag & Drop demo");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 600);		
		
		this.setVisible(true);
	}
}

