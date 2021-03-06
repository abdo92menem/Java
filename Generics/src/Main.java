import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		/* Generics = enable types (classes and interfaces) to be parameters when defining:
		 *			  classes, interfaces, methods.
		 *			  a benefit is to eliminate the need to create different versions of   
		 *  		  a method or class for various data typed.
		 *  		  use 1 version for all reference data types.
		 *  
		 * Bounded types = bound data to only one collection of types such as numbers
		 */
		
		Integer[] intArray = {1, 2, 3, 4, 5};
		Double[] doubleArray = {1.5, 2.5, 3.5, 4.5, 5.5};
		Character[] charArray = {'A', 'B', 'C', 'D', 'E'};
		String[] stringArray = {"A", "B", "C", "D", "E"};
		
		// Methods
		printArray(intArray);
		printArray(doubleArray);
		printArray(charArray);
		printArray(stringArray);
		
		System.out.println();
		System.out.println();
		
		// Classes
		MyGenericClass<Integer> myInt = new MyGenericClass<>(1);
		MyGenericClass<Double> myDouble = new MyGenericClass<>(2.5);
		MyGenericClass<Character> myChar = new MyGenericClass<>('A');
		MyGenericClass<String> myString = new MyGenericClass<>("My name is Khan");
		
		System.out.println(myInt.getValue());
		System.out.println(myDouble.getValue());
		System.out.println(myChar.getValue());
		System.out.println(myString.getValue());
		
	}
	
	// Generic Method
	public static <T> void printArray(T[] TArray) {
		
		for (T x: TArray) {
			System.out.print(x + " ");
		}
		System.out.println();
	}
	
	// This generic bounded the data to be sent to only numbers type
	public static <T extends Number> void printArray(T[] TArray) {
		
		for (T x: TArray) {
			System.out.print(x + " ");
		}
		System.out.println();
	}

}
