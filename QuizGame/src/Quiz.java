import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Quiz implements ActionListener{
	
	String[] questions = {
							"Which company created java?",
							"in Which year was java created?",
							"Who created java",
							"what was java originally called?"
						 };
	
	String[][] options = {
							{"Sun Microsystems", "StarBuks", "Microsoft", "Alphabet"},
							{"1989", "1996", "1972", "1960"},
							{"Apple", "Latte", "Oak", "Koffing"},
							{"Steve Jobs", "Bill Gates", "James Goslling", "Mark Zukerberg"}
						 };
	
	char[] answers = 	{
							'A',
							'B',
							'C',
							'C'
						};
	
	char guess;
	char answer;
	int index;
	int correct_guesses = 0;
	int total_questions = questions.length;
	int result;
	int seconds = 10;
	
	JFrame frame = new JFrame();
	JTextField textfield = new JTextField();
	JTextArea textarea = new JTextArea();
	JButton buttonA = new JButton();
	JButton buttonB = new JButton();
	JButton buttonC = new JButton();
	JButton buttonD = new JButton();
	JLabel answerA_label = new JLabel();
	JLabel answerB_label = new JLabel();
	JLabel answerC_label = new JLabel();
	JLabel answerD_label = new JLabel();
	JLabel time_label = new JLabel();
	JLabel second_label = new JLabel();
	JTextField number_right = new JTextField();
	JTextField percentage = new JTextField();
	
	Timer timer = new Timer(1000, new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			seconds--;
			second_label.setText(String.valueOf(seconds));
			
			if (seconds <= 0) {
				displayAnswer();
			}
			
		}
	});
	
	public Quiz() {
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(650, 650);
		frame.setLayout(null);
		frame.getContentPane().setBackground(new Color(50, 50 , 50));
		
		textfield.setBounds(0, 0, 650, 50);
		textfield.setFont(new Font("Ink Free", Font.BOLD, 30));
		textfield.setBackground(new Color(25, 25, 25));
		textfield.setForeground(new Color(25, 255, 0));
		textfield.setBorder(BorderFactory.createBevelBorder(1));
		textfield.setHorizontalAlignment(JTextField.CENTER);
		textfield.setEditable(false);
		
		textarea.setBounds(0, 50, 650, 50);
		textarea.setLineWrap(true);
		textarea.setWrapStyleWord(true);
		textarea.setFont(new Font("MV Boli", Font.BOLD, 25));
		textarea.setBackground(new Color(25, 25, 25));
		textarea.setForeground(new Color(25, 255, 0));
		textarea.setBorder(BorderFactory.createBevelBorder(1));
		textarea.setEditable(false);
		
		buttonA.setBounds(0, 100, 100, 100);
		buttonA.setText("A");
		buttonA.setFont(new Font("MV Boli", Font.BOLD, 35));
		buttonA.setFocusable(false);
		buttonA.addActionListener(this);
		
		buttonB.setBounds(0, 200, 100, 100);
		buttonB.setText("B");
		buttonB.setFont(new Font("MV Boli", Font.BOLD, 35));
		buttonB.setFocusable(false);
		buttonB.addActionListener(this);
		
		buttonC.setBounds(0, 300, 100, 100);
		buttonC.setText("C");
		buttonC.setFont(new Font("MV Boli", Font.BOLD, 35));
		buttonC.setFocusable(false);
		buttonC.addActionListener(this);
		
		buttonD.setBounds(0, 400, 100, 100);
		buttonD.setText("D");
		buttonD.setFont(new Font("MV Boli", Font.BOLD, 35));
		buttonD.setFocusable(false);
		buttonD.addActionListener(this);
		
		answerA_label.setBounds(125, 100, 500, 100);
		answerA_label.setBackground(new Color(50, 50, 50));
		answerA_label.setForeground(new Color(25, 255, 0));
		answerA_label.setFont(new Font("MV Boli", Font.PLAIN, 35));
		
		answerB_label.setBounds(125, 200, 500, 100);
		answerB_label.setBackground(new Color(50, 50, 50));
		answerB_label.setForeground(new Color(25, 255, 0));
		answerB_label.setFont(new Font("MV Boli", Font.PLAIN, 35));
		
		answerC_label.setBounds(125, 300, 500, 100);
		answerC_label.setBackground(new Color(50, 50, 50));
		answerC_label.setForeground(new Color(25, 255, 0));
		answerC_label.setFont(new Font("MV Boli", Font.PLAIN, 35));
		
		answerD_label.setBounds(125, 400, 500, 100);
		answerD_label.setBackground(new Color(50, 50, 50));
		answerD_label.setForeground(new Color(25, 255, 0));
		answerD_label.setFont(new Font("MV Boli", Font.PLAIN, 35));
		
		second_label.setBounds(535, 510, 100, 100);
		second_label.setBackground(new Color(25, 25, 25));
		second_label.setForeground(new Color(255, 00, 0));
		second_label.setFont(new Font("Ink Free", Font.BOLD, 60));
		second_label.setBorder(BorderFactory.createBevelBorder(1));
		second_label.setOpaque(true);
		second_label.setHorizontalAlignment(JTextField.CENTER);
		second_label.setText(String.valueOf(seconds));
		
		time_label.setBounds(535, 475, 100, 25);
		time_label.setBackground(new Color(50, 50, 50));
		time_label.setForeground(new Color(255, 0, 0));
		time_label.setFont(new Font("MV Boli", Font.PLAIN, 17));
		time_label.setHorizontalAlignment(JTextField.CENTER);
		time_label.setText("timer >:D");
		
		number_right.setBounds(225, 225, 200, 100);
		number_right.setBackground(new Color(25, 25, 25));
		number_right.setForeground(new Color(25, 255, 0));
		number_right.setFont(new Font("Ink Free", Font.BOLD, 50));
		number_right.setBorder(BorderFactory.createBevelBorder(1));
		number_right.setHorizontalAlignment(JTextField.CENTER);
		number_right.setEditable(false);
		
		percentage.setBounds(225, 325, 200, 100);
		percentage.setBackground(new Color(25, 25, 25));
		percentage.setForeground(new Color(25, 255, 0));
		percentage.setFont(new Font("Ink Free", Font.BOLD, 50));
		percentage.setBorder(BorderFactory.createBevelBorder(1));
		percentage.setHorizontalAlignment(JTextField.CENTER);
		percentage.setEditable(false);
		
		frame.add(time_label);
		frame.add(second_label);
		frame.add(answerA_label);
		frame.add(answerB_label);
		frame.add(answerC_label);
		frame.add(answerD_label);
		frame.add(buttonA);
		frame.add(buttonB);
		frame.add(buttonC);
		frame.add(buttonD);
		frame.add(textfield);
		frame.add(textarea);
		frame.setVisible(true);
		
		nextQuestion();
	}
	
	public void nextQuestion() {
		seconds = 10;
		if (index >= total_questions) {
			results();
		}
		else {
			textfield.setText("Question" + (index + 1));
			textarea.setText(questions[index]);
			answerA_label.setText(options[index][0]);
			answerB_label.setText(options[index][1]);
			answerC_label.setText(options[index][2]);
			answerD_label.setText(options[index][3]);
			timer.start();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		buttonA.setEnabled(false);
		buttonB.setEnabled(false);
		buttonC.setEnabled(false);
		buttonD.setEnabled(false);
		
		if (e.getSource() == buttonA) {
			answer = 'A';
			
			if (answer == answers[index]) {
				correct_guesses++;
			}
		}
		if (e.getSource() == buttonB) {
			answer = 'B';
			
			if (answer == answers[index]) {
				correct_guesses++;
			}
		}
		if (e.getSource() == buttonC) {
			answer = 'C';
			
			if (answer == answers[index]) {
				correct_guesses++;
			}
		}
		if (e.getSource() == buttonD) {
			answer = 'D';
			
			if (answer == answers[index]) {
				correct_guesses++;
			}
		}
		
		displayAnswer();
	}
	
	public void displayAnswer() {
		
		timer.stop();
		
		buttonA.setEnabled(false);
		buttonB.setEnabled(false);
		buttonC.setEnabled(false);
		buttonD.setEnabled(false);
		
		if (answers[index] != 'A') {
			answerA_label.setForeground(Color.red);
		}
		if (answers[index] != 'B') {
			answerB_label.setForeground(Color.red);
		}
		if (answers[index] != 'C') {
			answerC_label.setForeground(Color.red);
		}
		if (answers[index] != 'D') {
			answerD_label.setForeground(Color.red);
		}
		
		Timer pause = new Timer(2000, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				answerA_label.setForeground(new Color(25, 255, 0));
				answerB_label.setForeground(new Color(25, 255, 0));
				answerC_label.setForeground(new Color(25, 255, 0));
				answerD_label.setForeground(new Color(25, 255, 0));
				
				answer = ' ';
				seconds = 10;
				second_label.setText(String.valueOf(seconds));
				buttonA.setEnabled(true);
				buttonB.setEnabled(true);
				buttonC.setEnabled(true);
				buttonD.setEnabled(true);
				index++;
				nextQuestion();
			}
		});
		
		pause.setRepeats(false);
		pause.start();
	}
	
	public void results() {
		
		buttonA.setEnabled(false);
		buttonB.setEnabled(false);
		buttonC.setEnabled(false);
		buttonD.setEnabled(false);
		
		result = (int)((correct_guesses / (double)total_questions) * 100);
		
		textfield.setText("RESULTS!");
		textarea.setText("");
		answerA_label.setText("");
		answerB_label.setText("");
		answerC_label.setText("");
		answerD_label.setText("");
		
		number_right.setText("(" + correct_guesses + "/" + total_questions + ")");
		percentage.setText(result + "%");
		
		frame.add(number_right);
		frame.add(percentage);  
		
	}

}
