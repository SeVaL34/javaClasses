package com.class17;
public class ObjectOfCarClass {
public static void main(String[] args) {
	//to create an object syntax is
	//ClassName variable=new ClassName();
	//Scanner scan=new Scanner(System.in);
	//String str=new String();
	car car1=new car();
	car1.make="Tesla";
	car1.model="S";
	car1.color="Black";
	car1.year=2020;
	car1.wheels=4;
	car1.windows=5;
	car1.speed=200;
	//accessing behavior for 1 object
	car1.drive();
	car1.start(); //calling method from class
	car1.accelerate();
	
	car car2=new car();
	car2.make="BMW";
	car2.model="i8";
	car2.color="Purple";
	car2.year=2019;
	car2.wheels=4;
	car2.windows=6;
	car2.speed=300;
	//accessing behavior for 2 object
	car2.drive();
	car2.start(); 
	car2.accelerate();

	//print features of the car
	//i have black Tesla
	System.out.println("I have "+car1.color+" "+car1.make);
	System.out.println("I drive "+car2.make+" "+car2.year);
	





}
}
