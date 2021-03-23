import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.*;

public class Main {

	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException{
		
		Scanner scanner = new Scanner(System.in);
		// create file instance to contain audio file
		File file = new File("Level_up.wav");
		// create audio input stream to read audio file data
		AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
		// create clip instance to get data from stream
		Clip clip = AudioSystem.getClip();
		// open clip to be started
		clip.open(audioStream);
		
		String response = "";
		
		while (!response.equals("Q")) {
			System.out.println("P = Play, S = Stop, R=Reset, Q = Quit");
			System.out.println("Enter your choice: ");
			response = scanner.next();
			response = response.toUpperCase();
			
			switch(response) {
				case "P":
					clip.start();
					break;
				case "S":
					clip.stop();
					break;
				case "R":
					clip.setMicrosecondPosition(0);
					break;
				case "Q":
					System.out.println("Thank you");
					clip.close();
					break;
			}
		}
	}

}
