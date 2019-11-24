package com.class23;

public class Car {

	/* we want to build make as Toyota
	 * that will have different models and color
	 */
	public static String make;
	public String model;
	public String color;
	public int speed;
	public int doors;
	
	public void getDetails() {
		System.out.println("I build "+make+" "+model+" "+color);
		System.out.println("My car has "+doors);
	}
	
}
