import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Print line on screen with new line
//		System.out.println("Hello Java");
		
		// Variables
//		int i = 5;
//		char c = 'A';
//		double d = 8.9;
//		boolean b = true;
//		String s = "Hello";
		
		// Print these variables
//		System.out.println(i);
//		System.out.println(c);
//		System.out.println(d);
//		System.out.println(b);
//		System.out.println(s);
		
		// Input data from user
//		int age;
//		String name, food;
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter your name:");
//		name = scanner.nextLine();
//		System.out.println("How old are you? ");
//		age = scanner.nextInt();
//		System.out.println("What is your favourite food? ");
//		// This line to prevent Skipping next line
//		scanner.nextLine();
//		food = scanner.nextLine();
//		
//		System.out.println("Hello " + name);
//		System.out.println("You are " + age +" years old");
//		System.out.println("Your favourite food is " + food);
		
		// Expression-> operands & operators
		// Operands  -> values, variables, numbers, quantity
		// Operators -> * / % + -     (Arithmetic)
		// 			 -> && || !       (Logical)
		// 			 -> > < == >= <=  (Comparison)
		// 			 -> ++ --         (Increment/Decrement)
		// 			 -> ()            (Casting)
		//           -> ?:			  (Ternary/Conditional)
		
//		int num = 10;
//		
//		num = num + 1;    // number = 11
//		System.out.println(num);
//		num = num - 2;    // number = 9
//		System.out.println(num);
//		num = num * 3;	  // number = 27
//		System.out.println(num);
//		num = num / 2;    // number = 13
//		System.out.println(num);
//		num = num % 3;    // number = 1
//		System.out.println(num);
		
//		// Math operations
//		System.out.println(Math.pow(2, 5));
		
		// Random Values
//		Random random = new Random();
		
		// Limit the random value by typing the limit between braces
//		int x = random.nextInt(6) + 1;
//		System.out.println(x);
//		double y = random.nextDouble();
//		System.out.println(y);
//		boolean z = random.nextBoolean();
//		System.out.println(z);
		
		// 2D Array
//		String[][] cars = {
//							{"Camero", "Corvette", "Silverado"},
//							{"Mustang", "Ranger", "F-150"},
//							{"Ferrari", "Lambo", "Tesla"}
//						  };
//		for (int i : cars.length) {
//			for (int j : cars[i].length) {
//				System.out.println(cars[i][j]);
//			}
//		}
		
		// Wrappers  = Primitive data types as a reference data types
		// 			-> Reference data types contain useful methods
		
		// Primitive        // Wrapper
		//----------        //---------
		// boolean          // Boolean
		// int				// Integer
		// char				// Character
		// double			// Double
		
		// Autoboxing = automatic conversion that java compiler makes to convert from primitive to wrapper
		// Unboxing = inverse of autoboxing
		
//		Boolean b = true;
//		Integer i = 12;
//		Double d = 3.14;
//		Character c = 'A';
//		String s = "Abdo";
//		
//		if (b == true) {
//			System.out.println("This is "+b);
//		}
		
		
		// ArrayList = a resizeable array
		//           -> elements can be added and removed after compilation phase
		//           -> store reference data types (wrappers or user defined classes)
		
//		ArrayList<String> food = new ArrayList<String>();
//		
//		food.add("Pizza");
//		food.add("Hamburger");
//		food.add("Hotdog");
//		food.add("shawrma");
//		
//		for (int i = 0; i < food.size(); i++) {
//			System.out.println(food.get(i));
//		}
		
	}

}
