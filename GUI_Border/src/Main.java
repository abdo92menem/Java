import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) {
		
		/* Layout Manager = Defines the natural layout for components within a container
		 * 
		 *  3 Common managers
		 *  
		 *  BorderLayout = A BorderLayout places components in five areas: North, South, West,
		 *  East and Center. All extra space is placed in the center area.
		 *  
		 */
		
		
		 /* Frame object */
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setLayout(new BorderLayout(10, 10));    // 10 is the margin for up/down and left/right
		frame.setVisible(true);
		
		
		/* Panel Objects */
		JPanel centerPanel = new JPanel();
		JPanel topPanel = new JPanel();
		JPanel bottomPanel = new JPanel();
		JPanel leftPanel = new JPanel();
		JPanel rightPanel = new JPanel();
		
		/* panels colors  */
		centerPanel.setBackground(Color.red);
		topPanel.setBackground(Color.green);
		bottomPanel.setBackground(Color.yellow);
		leftPanel.setBackground(Color.magenta);
		rightPanel.setBackground(Color.blue);
		
		/* Panels size */
		centerPanel.setPreferredSize(new Dimension(100, 100));
		topPanel.setPreferredSize(new Dimension(100, 100));
		bottomPanel.setPreferredSize(new Dimension(100, 100));
		leftPanel.setPreferredSize(new Dimension(100, 100));
		rightPanel.setPreferredSize(new Dimension(100, 100));
		
		/* ******Sub Panels     ******** */
		
		// layout for sub panels
		centerPanel.setLayout(new BorderLayout(5, 5));
		
		/* Sub-Panels Objects */
		JPanel centerSubPanel = new JPanel();
		JPanel topSubPanel = new JPanel();
		JPanel bottomSubPanel = new JPanel();
		JPanel leftSubPanel = new JPanel();
		JPanel rightSubPanel = new JPanel();
		
		/* Sub-panels colors  */
		centerSubPanel.setBackground(Color.black);
		topSubPanel.setBackground(Color.darkGray);
		bottomSubPanel.setBackground(Color.gray);
		leftSubPanel.setBackground(Color.lightGray);
		rightSubPanel.setBackground(Color.white);
		
		/* Sub-Panels size */
		centerSubPanel.setPreferredSize(new Dimension(50, 50));
		topSubPanel.setPreferredSize(new Dimension(50, 50));
		bottomSubPanel.setPreferredSize(new Dimension(50, 50));
		leftSubPanel.setPreferredSize(new Dimension(50, 50));
		rightSubPanel.setPreferredSize(new Dimension(50, 50));
		
		/* add sub panels to center panel */ 
		
		centerPanel.add(centerSubPanel, BorderLayout.CENTER);
		centerPanel.add(topSubPanel, BorderLayout.NORTH);
		centerPanel.add(bottomSubPanel, BorderLayout.SOUTH);
		centerPanel.add(leftSubPanel, BorderLayout.WEST);
		centerPanel.add(rightSubPanel, BorderLayout.EAST);
		
		/* ******Sub Panels End ******** */
		
		
		/* add panels to frame */
		frame.add(centerPanel, BorderLayout.CENTER);
		frame.add(topPanel, BorderLayout.NORTH);
		frame.add(bottomPanel, BorderLayout.SOUTH);
		frame.add(leftPanel, BorderLayout.WEST);
		frame.add(rightPanel, BorderLayout.EAST);
		

	}

}
