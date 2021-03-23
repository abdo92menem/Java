import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		
		/* File = An abstract representation of file and directory pathnames */
		
		// create file instance to contain secret_message file
//		File file = new File("secret_message.txt");
//		
//		// check if file exist
//		if (file.exists()) {
//			System.out.println("That file exists! :o!");
//			System.out.println(file.getPath());
//			System.out.println(file.getAbsolutePath());
//			System.out.println(file.isFile());
//			file.delete();
//		} else {
//			System.out.println("That file does not exist! :(");
//		}
		
		/* FileWriter = write to file */
		
		// create instance of filewriter
//		try {
//			FileWriter writer = new FileWriter("poem.txt");
//			writer.write("Roses are red\n");
//			writer.write("violets are blue");
//			writer.close();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		/* FileReader = read from file */
		
		try {
			// create instance for reading file
			FileReader reader = new FileReader("art.txt");
			// variable to store data read from file
			int data = reader.read();
			// loop through the file to get data
			while(data != -1) {
				// cast to char to printed as character
				System.out.print((char) data);
				data = reader.read();
			}
			reader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
