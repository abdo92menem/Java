/******************************* Example 1 ********************************/
/*
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*
		 Recursion = the process in which a method calls itself continuously
		 			 A method that calls itself is called a recursive method
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Say hello how many times?: ");
		int number = scan.nextInt();
		
		HelloWorld(number);
	}
	
	static void HelloWorld(int i) {
		if(i>0) {
			System.out.println("Hello World!"+i);
			i--;
			HelloWorld(i);
		}
	}
}
*/

// ******************************* Example 2 *******************************/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// recursion = the process in which a method calls itself continuously
		// a method that calls itself is called a recursive method	
		// useful for factorials, transversing trees, and simplifying a complex task
	
		Scanner scan = new Scanner(System.in);
		System.out.println("How far do you want to walk (meters)?: ");
		int distance = scan.nextInt();
		
		takeAStep(0,distance);
		
	}
	
	static void takeAStep(int i,int distance) {
		if(i<distance) {
			i++;
			System.out.println("*you take a step* : "+i+" meter/s");
			takeAStep(i,distance);
		}
		else {
			System.out.println("You are done walking!");
		}

	}
	
}

