import java.util.Random;

public class DiceRoller {
	// global variable declaration
	
	int number;
	Random random;
	
	// constructor
	public DiceRoller() {
		// local variable Initialization
		
//		Random random = new Random();
//		int number = 0;
//		roll(random, number);
		
		// variable assignment
		random = new Random();
		number = 0;
		roll();
	}
	
	void roll() {
		number = random.nextInt(6) + 1;
		System.out.println(number);
	}
}
