import java.awt.FlowLayout;
import java.awt.MenuBar;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener{

	JMenuBar menuBar;
	
	/* Menu*/
	JMenu fileMenu;
	JMenu editMenu;
	JMenu helpMenu;
	
	/* Item */
	JMenuItem loadItem;
	JMenuItem saveItem;
	JMenuItem exitItem;
	
	/* Icon */
	ImageIcon loadIcon;
	ImageIcon saveIcon;
	ImageIcon exitIcon;
	
	/* Constructor */
	public MyFrame() {
		
		/* Frame */
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.setSize(420, 420);
		
		/* Icon */
		loadIcon = new ImageIcon("load.png");
		saveIcon = new ImageIcon("save.png");
		exitIcon = new ImageIcon("exit.png");
		
		/* MenuBar */
		JMenuBar menuBar = new JMenuBar();
		
		fileMenu = new JMenu("File");
		editMenu = new JMenu("Edit");
		helpMenu = new JMenu("Help");
		
		fileMenu.setMnemonic(KeyEvent.VK_F);   // alt + F
		editMenu.setMnemonic(KeyEvent.VK_E);   // alt + E
		helpMenu.setMnemonic(KeyEvent.VK_H);   // alt + H
		
		/* Items */
		loadItem = new JMenuItem("Load");
		saveItem = new JMenuItem("Save");
		exitItem = new JMenuItem("Exit");
		
		loadItem.addActionListener(this);
		saveItem.addActionListener(this);
		exitItem.addActionListener(this);
		
		loadItem.setIcon(loadIcon);
		saveItem.setIcon(saveIcon);
		exitItem.setIcon(exitIcon);
		
		loadItem.setMnemonic(KeyEvent.VK_L);   // press L for load 
		saveItem.setMnemonic(KeyEvent.VK_S);   // S for save
		exitItem.setMnemonic(KeyEvent.VK_E);   // E for exit
		
		// Add
		fileMenu.add(loadItem);
		fileMenu.add(saveItem);
		fileMenu.add(exitItem);
		
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		menuBar.add(helpMenu);
		
		this.setJMenuBar(menuBar);
		
		this.setVisible(true);
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==loadItem) {
			System.out.println("**** Loading file ****");
		}
		else if(e.getSource()==saveItem) {
			System.out.println("**** Saving file ****");
		}
		else if(e.getSource()==exitItem) {
			System.exit(0);
		}
		
	}

}
