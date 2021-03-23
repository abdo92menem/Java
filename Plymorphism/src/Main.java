
public class Main {

	public static void main(String[] args) {
		/* Ploymorphism = the ability of an object to identify as more than one type */
		
		Car car = new Car();
		Bicycle bike = new Bicycle();
		Boat boat = new Boat();
		
		// car, boat, bike all are identified as vehicle and there own class
		Vehicle[] racers = {car, bike, boat};
		
		for (Vehicle x : racers)
		{
			x.go();
		}
	}

}
