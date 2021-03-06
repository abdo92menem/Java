
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener{
	
	JComboBox comboBox;
	
	public MyFrame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout()); 
		
		String[] animals = {"dog", "cat", "bird"};
		
		/* Combo box */
		comboBox = new JComboBox(animals);
		comboBox.addActionListener(this);
		
		comboBox.setEditable(true);
		comboBox.addItem("horse");
		comboBox.insertItemAt("rat", 3);
		comboBox.setSelectedIndex(0);
		
		this.add(comboBox);
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==comboBox) {
			System.out.println(comboBox.getSelectedItem());
		}
	}

}
