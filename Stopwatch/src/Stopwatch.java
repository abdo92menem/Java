import java.awt.*;
import java.awt.event.*;
import java.util.Locale;

import javax.swing.*;

public class Stopwatch implements ActionListener{
	
	/* Variables */
	int elapsedTime = 0;        // overall passed time per milliseconds
	int seconds = 0;			// seconds passed 
	int minutes = 0;			// minutes passed
	int hours = 0;				// hours passed
	boolean started = false;    // indicator for start and stop timer
	
	// string to store time in format with two digits start with 00 
	String seconds_string = String.format("%02d", seconds);       
	String minutes_string = String.format("%02d", minutes);
	String hours_string = String.format("%02d", hours);
	
	/* Timer: 
	 		first parameter: time per milliseconds to do action 
	 		second parameter: the action performed after time out
	 */
	Timer timer = new Timer(1000, new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			elapsedTime += 1000;                        // increment by 1 second  
			hours = (elapsedTime / 3600000);	  		// calculate hours
			minutes = (elapsedTime / 60000) % 60;		// calculate minutes regarding hours
			seconds = (elapsedTime / 1000) % 60;		// calculate seconds regarding minutes
			
			seconds_string = String.format("%02d", seconds);
			minutes_string = String.format("%02d", minutes);
			hours_string = String.format("%02d", hours);
			
			// set time to label
			timeLabel.setText(hours_string + ":" + minutes_string + ":" + seconds_string);
			
		}
	});
	
	/* Frame */
	JFrame frame = new JFrame();
	
	/* Buttons */
	JButton startButton = new JButton("Start");
	JButton resetButton = new JButton("reset");
	
	/* Label */
	JLabel timeLabel = new JLabel();
	
	/* Constructor */
	public Stopwatch() {
		
		/* Label */
		timeLabel.setText(hours_string + ":" + minutes_string + ":" + seconds_string);
		timeLabel.setBounds(100, 100, 200, 100);
		timeLabel.setFont(new Font("Verdana", Font.PLAIN, 35));
		timeLabel.setBorder(BorderFactory.createBevelBorder(1));
		timeLabel.setOpaque(true);
		timeLabel.setHorizontalAlignment(JTextField.CENTER);
		
		/* Buttons */
		startButton.setBounds(100, 200, 100, 50);
		startButton.setFont(new Font("Ink Free", Font.PLAIN, 25));
		startButton.setFocusable(false);
		startButton.addActionListener(this);
		
		resetButton.setBounds(200, 200, 100, 50);
		resetButton.setFont(new Font("Ink Free", Font.PLAIN, 25));
		resetButton.setFocusable(false);
		resetButton.addActionListener(this);
		
		/* Frame */
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,  420);
		frame.setLayout(null);
		
		frame.add(startButton);
		frame.add(resetButton);
		frame.add(timeLabel);
		frame.setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == startButton) {
			if (started == false) {
				started = true;
				startButton.setText("Stop");
				start();
			}
			else {
				started = false;
				startButton.setText("Start");
				stop();
			}
		}
		
		if (e.getSource() == resetButton) {
			started =false;
			startButton.setText("Start");
			reset();
		}
		
	}
	
	public void start() {
		timer.start();
		
	}
	
	public void stop() {
		timer.stop();
	}
	
	public void reset() {
		stop();
		
		elapsedTime = 0;
		seconds = 0;
		minutes = 0;
		hours = 0;
		
		seconds_string = String.format("%02d", seconds);
		minutes_string = String.format("%02d", minutes);
		hours_string = String.format("%02d", hours);
		
		timeLabel.setText(hours_string + ":" + minutes_string + ":" + seconds_string);
	}

}
