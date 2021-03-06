import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
 

public class Calculator implements ActionListener{

	/* Variables */
	double num1 = 0, num2 = 0, result = 0;
	char operator;
	
	/* Frame */
	JFrame frame;
	
	/* Text field */
	JTextField textfield;
	
	/* Panel */
	JPanel panel;
	
	/* Buttons */
	JButton[] numberButtons = new JButton[10];
	JButton[] functionButton = new JButton[9];
	JButton addButton, subButton, mulButton, divButton;
	JButton decButton, equButton, delButton, clrButton, negButton;
	
	/* Generic Font */
	Font font = new Font("Ink Free", Font.BOLD, 30);
	
	
	/* Constructor */
	public Calculator() {
		
		/* Frame style */
		frame = new JFrame("Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 550);
		frame.setLayout(null);
		
		/* TextField */
		textfield = new JTextField();
		textfield.setBounds(30, 25, 340, 50);
		textfield.setFont(font);
		textfield.setEditable(false);
		
		/* Buttons */
		addButton = new JButton("+");
		subButton = new JButton("-");
		mulButton = new JButton("*");
		divButton = new JButton("/");
		decButton = new JButton(".");
		equButton = new JButton("=");
		delButton = new JButton("Delete");
		clrButton = new JButton("Clear");
		negButton = new JButton("(-)");
		
		// set buttons to array
		functionButton[0] = addButton;
		functionButton[1] = subButton;
		functionButton[2] = mulButton;
		functionButton[3] = divButton;
		functionButton[4] = decButton;
		functionButton[5] = equButton;
		functionButton[6] = delButton;
		functionButton[7] = clrButton;
		functionButton[8] = negButton;
		
		// add style to buttons
		for (int i = 0; i < functionButton.length; i++) {
			functionButton[i].addActionListener(this);
			functionButton[i].setFont(font);
			functionButton[i].setFocusable(false);
		}
		
		for (int i = 0; i < numberButtons.length; i++) {
			numberButtons[i] = new JButton(String.valueOf(i));
			numberButtons[i].addActionListener(this);
			numberButtons[i].setFont(font);
			numberButtons[i].setFocusable(false);
		}
		
		/* Panel */
		panel = new JPanel();
		panel.setBounds(30,  100, 340, 300);
		panel.setLayout(new GridLayout(4, 4, 10, 10));
		//panel.setBackground(Color.LIGHT_GRAY);
		
		panel.add(numberButtons[1]);
		panel.add(numberButtons[2]);
		panel.add(numberButtons[3]);
		panel.add(functionButton[0]);
		panel.add(numberButtons[4]);
		panel.add(numberButtons[5]);
		panel.add(numberButtons[6]);
		panel.add(functionButton[1]);
		panel.add(numberButtons[7]);
		panel.add(numberButtons[8]);
		panel.add(numberButtons[9]);
		panel.add(functionButton[2]);
		panel.add(functionButton[4]);
		panel.add(numberButtons[0]);
		panel.add(functionButton[5]);
		panel.add(functionButton[3]);
		
		
		delButton.setBounds(30, 430, 125, 50);
		clrButton.setBounds(160, 430, 125, 50);
		negButton.setBounds(295, 430, 75, 50);
		
		
		frame.add(panel);
		frame.add(delButton);
		frame.add(clrButton);
		frame.add(negButton);
		frame.add(textfield);
		frame.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		
		Calculator calculator = new Calculator();
				
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		for(int i = 0; i < 10; i++) {
			if (e.getSource() == numberButtons[i]) {
				textfield.setText(textfield.getText().concat(String.valueOf(i)));
			}
		}
		
		if (e.getSource() == decButton) {
			textfield.setText(textfield.getText().concat("."));
		}
		
		if (e.getSource() == addButton) {
			num1 = Double.parseDouble(textfield.getText());
			operator = '+';
			textfield.setText("");
		}
		
		if (e.getSource() == subButton) {
			num1 = Double.parseDouble(textfield.getText());
			operator = '-';
			textfield.setText("");
		}
		
		if (e.getSource() == mulButton) {
			num1 = Double.parseDouble(textfield.getText());
			operator = '*';
			textfield.setText("");
		}
		
		if (e.getSource() == divButton) {
			num1 = Double.parseDouble(textfield.getText());
			operator = '/';
			textfield.setText("");
		}
		if (e.getSource() == equButton) {
			num2 = Double.parseDouble(textfield.getText());

			switch(operator) {
			case '+':
				result = num1 + num2;
				break;
			case '-':
				result = num1 - num2;
				break;
			case '*':
				result = num1 * num2;
				break;
			case '/':
				result = num1 / num2;
				break;
			}
			
			textfield.setText(String.valueOf(result));
			num1 = result;
		}
		
		if (e.getSource() == clrButton) {
			textfield.setText("");
		}
		
		if (e.getSource() == delButton) {
			String string = textfield.getText();
			textfield.setText("");
			
			for (int i = 0; i < string.length() - 1; i++) {
				textfield.setText(textfield.getText() + string.charAt(i));
			}
		}
		
		if (e.getSource() == negButton) {
			double temp = Double.parseDouble(textfield.getText());
			temp *= -1;
			
			textfield.setText(String.valueOf(temp));
			
		}
	}
}
