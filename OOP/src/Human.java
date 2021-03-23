
public class Human {
	
	String name;
	int age;
	double weight;
	
	Human(String name, int age, double weight){
		// this means the variable of the class
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	
	static void eat() {
		System.out.println("You are eating");
	}
}
