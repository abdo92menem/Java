import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.*;

public class MyFrame extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/* Variables */
	SimpleDateFormat timeFormat;        // format holder for time
	SimpleDateFormat dayFormat;			// format holder for day
	SimpleDateFormat dateFormat;		// format holder for date
	JLabel timeLabel;					// hold time string
	JLabel dayLabel;					// hold day string
	JLabel dateLabel;					// hold date string
	String time;						// to store time 
	String day;							// to store day
	String date;						// to store date

	/* Constructor */
	public MyFrame() {
		
		/* Frame attributes */
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(350, 200);
		this.setTitle("My Clock Program");
		this.setLayout(new FlowLayout());
		this.setResizable(false);          // prevent resizing
		
		/* format */
		timeFormat = new SimpleDateFormat("hh:mm:ss a", new Locale("en"));
		dayFormat = new SimpleDateFormat("EEEE", new Locale("en"));
		dateFormat = new SimpleDateFormat("MMMM dd yyyy", new Locale("en"));

		/* Label style */
		timeLabel  = new JLabel();
		timeLabel.setFont(new Font("Verdana", Font.PLAIN, 50));
		timeLabel.setForeground(Color.green);
		timeLabel.setBackground(Color.black);
		timeLabel.setOpaque(true);
		
		dayLabel  = new JLabel();
		dayLabel.setFont(new Font("Ink Free", Font.PLAIN, 35));
		dayLabel.setForeground(Color.black);
		dayLabel.setOpaque(true);
		
		dateLabel  = new JLabel();
		dateLabel.setFont(new Font("Ink Free", Font.PLAIN, 25));
		dateLabel.setForeground(Color.black);
		dateLabel.setOpaque(true);
		
		/* add to frame */
		this.add(timeLabel);
		this.add(dayLabel);
		this.add(dateLabel);
		
		/* Frame visibility */
		this.setVisible(true);
		
		/* Time track Method */ 
		setTime();
	}
	
	/*
	 * This method has parameters, no return types
	 * to track time and date at every change 
	 */
	public void setTime() {
		
		// this loop to keep tracking changes
		while(true) {
			
			// get time and date from calendar
			time = timeFormat.format(Calendar.getInstance().getTime());
			timeLabel.setText(time);
			day = dayFormat.format(Calendar.getInstance().getTime());
			dayLabel.setText(day);
			date = dateFormat.format(Calendar.getInstance().getTime());
			dateLabel.setText(date);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
