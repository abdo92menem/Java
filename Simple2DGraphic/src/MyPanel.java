import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyPanel extends JPanel implements ActionListener{
	
	/* Image image = new ImageIcon("sky.png").getImage();
	
	
	/* Constructor */
	/*
	public MyPanel() {
		
		this.setPreferredSize(new Dimension(500, 320));
		
	}
	
	public void paint(Graphics g) {
		
		Graphics2D g2D = (Graphics2D) g;
		
		g2D.setPaint(Color.darkGray);
		g2D.setStroke(new BasicStroke(5));
		//g2D.drawLine(0, 0, 500, 500);
		
		//g2D.drawRect(0, 0, 100, 200);
		//g2D.fillRect(0, 0, 100, 200);
		
		//g2D.drawOval(0, 0, 100, 100);
		//g2D.fillOval(0, 0, 200, 200);
		
		//g2D.drawArc(100, 100, 100, 100, 180, 180);
		//g2D.fillArc(100, 100, 100, 100, 180, 180);
		
		int[] x = {100, 150, 200};
		int[] y = {100, 150, 100};
		
		//g2D.drawPolygon(x, y, 3);   // triangle	
		
		g2D.setPaint(Color.blue);
		g2D.setFont(new Font("Ink Free", Font.BOLD,30));
		g2D.drawString("Wow... That is Amazing", 100, 100);
		
		g2D.drawImage(image, 0, 0, null); 
		*/
	
	
	/* 2D Graphics */
	
	// Panel Dimensions
	final int PANEL_WIDTH = 820;
	final int PANEL_HEIGHT = 512;
	Image enemy;
	Image space;
	
	// Timer 
	Timer timer;
	
	// enemy speed
	int xVelocity = 10;
	int yVelocity = 10;
	
	// enemy position
	int x = 0;
	int y = 0;
	
	
	public MyPanel() {
		
		this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
		this.setBackground(Color.black);
		enemy = new ImageIcon("enemy.png").getImage();
		space = new ImageIcon("space.jpg").getImage();
		timer = new Timer(10, this);
		timer.start();
	}
	
	public void paint(Graphics g) {
		
		super.paint(g);
		
		Graphics2D g2D = (Graphics2D) g;
		
		g2D.drawImage(space, 0, 0, null);
		g2D.drawImage(enemy, x, y, null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		// set bounds
		if(x >= (PANEL_WIDTH - enemy.getWidth(null)) || x < 0) {
			xVelocity = xVelocity * -1;
		}
		
		if(y >= (PANEL_HEIGHT - enemy.getHeight(null)) || y < 0) {
			yVelocity = yVelocity * -1;
		}
		// speed up
		x += xVelocity;
		y += yVelocity;
		
		repaint();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


}
