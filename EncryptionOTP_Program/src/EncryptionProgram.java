import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class EncryptionProgram {

	/* Variable declaration */
	private Scanner scanner;        	 // take input from user
	private Random random;		         // generate random output
	private ArrayList<Character> list;  	   // array of characters to hold ascii values started at 32 to 126
	private ArrayList<Character> shuffledList; 		 // array to hold shuffled ascii values
	private char character;              // to initialize key array
	private char[] letters;				// to hold user input message
	private char[] secretLetters;	    // to hold encrypted message

	/* Constructor */
	EncryptionProgram(){

		/* Variable Initialization */
		scanner = new Scanner(System.in);
		random = new Random();
		list = new ArrayList<>();
		shuffledList = new ArrayList<>();
		character = ' ';

		newKey();
		askQuestion();
	}

	/* AskQuestion method 
	 *      has no parameters, no return values
	 * 		Prompt the user to enter a choice such as: 
	 * 			1. set new key
	 * 			2. get key
	 * 			3. encrypt message
	 * 			4. decrypt message
	 * 			5. quit
	 */
	private void askQuestion() {
		while(true) {
			System.out.println("**************************************************");
			System.out.println("What do you want to do? : ");
			System.out.println("(N)ew key, (G)et key, (E)ncrypt, (D)ecrypt, (Q)uit");

			char response = scanner.nextLine().toUpperCase().charAt(0);    // get first character of input string and convert to upper case

			switch(response) {
			case 'N':
				newKey();
				break;
			case 'G':
				getKey();
				break;
			case 'E':
				encrypt();
				break;
			case 'D':
				decrypt();
				break;
			case 'Q':
				quit();
				break;
			default:
				System.out.println("Not a valid choice !!");
				break;
			}
		}

	}

	/*
	 *    New key method
	 *    has no parameters, no return values
	 *    generate new key values
	 */

	private void newKey() {

		character = ' ';         // start from 32 value which is space character
		list.clear();		     // clear list array
		shuffledList.clear();	 // clear shuffled list

		// iterate for the ascii values from 32 to 126
		for(int i = 32; i < 127; i++) {
			list.add(Character.valueOf(character));    // get value of character as integer
			character++;

		}

		shuffledList = new ArrayList<>(list);        // copy list items to shuffled list
		Collections.shuffle(shuffledList);           // shuffle the list

		System.out.println("New key has been generated");


	}

	/*
	 *    Get key method
	 *    has no parameters, no return values
	 *    get key values
	 */
	private void getKey() {

		System.out.println("Key:");
		
		// print all list values
		for(Character x: list) {
			System.out.print(x);
		}
		
		System.out.println();
		
		// print all suffledList values
		for(Character x: shuffledList) {
			System.out.print(x);
		}
		
		System.out.println();
	}
	
	/*
	 *    Encrypt method
	 *    to encrypt data in array
	 *    has no parameters, no return values
	 *    
	 */
	
	private void encrypt() {
		
		System.out.println("Input message to be encrypted: ");
		String message = scanner.nextLine();
		
		letters = message.toCharArray();     // convert message string to array of character
		
		for(int i = 0; i < letters.length; i++) {
			for(int j = 0; j < list.size(); j++) {
				if (letters[i] == list.get(j)) {
					letters[i] = shuffledList.get(j);
					break;
				}
			}
		}
		
		System.out.println("Encrybted: ");
		
		for(char x : letters) {
			System.out.print(x);
		}
		
		System.out.println();
	}
	
	/*
	 *    decrypt method
	 *    to decrypt data in array
	 *    has no parameters, no return values
	 *    
	 */
	private void decrypt() {
		
		System.out.println("Input message to be decrypted: ");
		String message = scanner.nextLine();
		
		letters = message.toCharArray();     // convert message string to array of character
		
		for(int i = 0; i < letters.length; i++) {
			for(int j = 0; j < list.size(); j++) {
				if (letters[i] == shuffledList.get(j)) {
					letters[i] = list.get(j);
					break;
				}
			}
		}
		
		System.out.println("decrybted: ");
		
		for(char x : letters) {
			System.out.print(x);
		}
		
		System.out.println();
	}
	
	/*
	 *    Quit method
	 *    to exit program
	 *    has no parameters, no return values
	 *   
	 */	
	private void quit() {
		System.out.println("Thank you, Bro");
		System.exit(0);
	}
}
