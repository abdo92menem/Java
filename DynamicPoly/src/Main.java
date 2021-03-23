import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// create scanner instance for user input
		Scanner scanner = new Scanner(System.in);
		
		// create instance for animal class
		Animal animal;
		
		// ask user for the type of the animal
		System.out.println("What is your favourite animal?");
		System.out.println("Cat = 1 or Dog = 2 :");
		
		int choice = scanner.nextInt();
		
		switch (choice) {
			case 1:
				animal = new Cat();
				// dynamic polymorphism
				animal.speak();
				break;
			case 2:
				animal = new Dog();
				animal.speak();
				break;
			default:
				System.out.println("Invalid choice"); 
				break;
		}
		
		
	}

}
