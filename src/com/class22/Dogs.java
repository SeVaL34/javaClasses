package com.class22;

public class Dogs {

	static String breed="Husky";
	static int paws=4;
	static int tale=1;
	
	String name;
	String color;
	
	void display() {
		System.out.println("Dog name is "+breed+" "+name);
	}
	public static void main(String[] args) {
		
		Dogs dog=new Dogs();
		Dogs dog1=new Dogs();
		
		dog.name="Meatball";
		dog.color="brown";
		dog.display();
		dog1.name="Sharik";
		dog1.color="black";
		dog1.display();
		
		Dogs dog2=new Dogs();
		dog2.name="Jack";
		dog2.color="grey";
		breed="Bulldog";
		dog2.display();
		//displaying values from previous instances
		dog1.display();
		dog.display();
		
	}
}
