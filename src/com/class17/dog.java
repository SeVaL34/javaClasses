package com.class17;

public class dog {
 //Create a Dog Class and create 3 different objects of it:
//Husky, Bulldog, Labrador  with specific attributes and behaviours.
	
	String animal,color,eyesColor;
	int legs,eyes;
	
	void move()
	{
		System.out.println("run");
	}
	
	public static void main(String[] args) {
		
	dog husky=new dog();
	husky.color="white";
	husky.eyesColor="blue eyes";
	husky.legs=4;
	husky.eyes=2;
	
	System.out.println("I loveeee "+husky.color+" "+husky.eyesColor+" husky");
	husky.move();
	
	dog bulldog=new dog();
	bulldog.color="black";
	bulldog.eyesColor="black";
	bulldog.legs=4;
	bulldog.eyes=2;
	
	System.out.println("I have "+bulldog.color+" bulldog");
	
	
	
	
	
	
	
	}
}
