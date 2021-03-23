
public class Car {
	private String make;
	private String model;
	private int year;
	
	// constructor
	public Car(String make, String model, int year) {
		this.setMake(make);;
		this.setModel(model);;
		this.setYear(year);;
	}
	
	// getter
	public String getMake() {
		return make;
	}
	
	public String getModel() {
		return model;
	}
	
	public int getYear() {
		return year;
	}
	
	// setter
	public void setMake(String make) {
		this.make = make;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
}
