package com.class23;

public class BetterCar {

	public static String make;
	public String model;
	public String color;
	public int speed;
	public int doors;
	
	BetterCar(String carModel,String carColor,int carSpeed,int carDoors){
		model=carModel;
		color=carColor;
		speed=carSpeed;
		doors=carDoors;
	}
	public void getDetails() {
		System.out.println("I build "+make+" "+model+" "+color);
		System.out.println("My car has "+doors);
	}
	
}

}
