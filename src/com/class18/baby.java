package com.class18;

public class baby {
	
	String firstName;
	String lastName;
	char gender;
	int weight;
	String hairColor;
	
	void talk() {
		System.out.println("bla bla bla");
	}
	void walk(int times) {
		for(int i=0 ; i<times ; i++) {
		System.out.println("crawl");
	}
		
	}
	void cry() {
		System.out.println("cry every minute");
	}
	void displayBaby() {
		System.out.println(firstName+ " "+lastName);
		System.out.println(gender);
		if (gender=='M') {
			System.out.println("Boy");
		}else if(gender=='F'){
			System.out.println("Girl");
		}else {
			System.out.println("unknown");
		}
	}
public static void main(String[] args) {
	
	baby baby1=new baby();
	
	baby1.firstName="John";
	baby1.lastName="Doe";
	baby1.gender='M';
	baby1.weight=4;
	baby1.hairColor="yellow";
	baby1.cry();
	baby1.walk(3);
	System.out.println(baby1.firstName);

	
	baby baby2=new baby();
	
	baby2.firstName="Ann";
	baby2.lastName="Don";
	baby2.hairColor="black";
	baby2.cry();
	baby2.gender='F';
	
	baby1.displayBaby();
	baby2.displayBaby();
}
}