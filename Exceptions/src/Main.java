import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/* Exception = an event that occurs during the execution of a program that
		 * 			   disrupts the normal flow of instructions
		 */
		
		
		Scanner scanner = new Scanner(System.in);
		
		try {	
			System.out.println("Enter a whole number to divide: ");
			int x = scanner.nextInt();
			
			System.out.println("Enter a whole number to divide by: ");
			int y = scanner.nextInt();
			
			int z = x / y;
			
			System.out.println(z);
		} catch(ArithmeticException e) {
			System.out.println("You can't divide by zero !!!");
		} catch(InputMismatchException e) {
			System.out.println("PLEASE ENTER A NUMBER");
		} finally {
			// System.out.println("print always");
			scanner.close();
		}

	}

}
