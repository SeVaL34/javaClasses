package com.class23;

public class CarTest {

	public static void main(String[] args) {
		
		//Car is a class name
		//car1 is object reference variable
		//= assigning operator
		//new keyword used to create an object
		//Car() constructor
		//; end of statement
		
		Car.make="Toyota";
		Car car1=new Car();
		car1.model="Camry";
		car1.color="Pink";
		car1.speed=200;
		car1.doors=4;
		car1.getDetails();
		
		Car car2=new Car();
		car2.model="Corolla";
		car2.color="Blue";
		car1.speed=150;
		car1.doors=2;
		car2.getDetails();
		
		Car car3=new Car();
		car3.model="Prius";
		car3.color="Green";
		car3.getDetails();
		
		//BetterCar betterCar1=new BetterCar("Toyota", "White" , 180 , 5);
		
	}
}
