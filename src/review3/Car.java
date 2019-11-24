package review3;

public class Car {
 
	String make;
	String color;
	
	//constructor is a special method
	//The name of the Constructor should be the same as Class Name
	//Constructors don't have a return type
	//no void ,no return
	
	public Car() { //default constructor
		
	}
	public Car (String type) { //one parameter constructor
		make=type;
	}
	public void displayInfo() {//2 parameter constructor
		System.out.println("This is a car.Type is: "+make+" color is "+color);
	}
		
}
