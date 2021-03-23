// Super keyword example

public class Hero extends Person{
	
	String power;
	
	// constructor
	public Hero(String name, int age, String power) {
		super(name, age);
		this.power = power;
	}
}
