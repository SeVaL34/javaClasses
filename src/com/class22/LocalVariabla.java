package com.class22;

public class LocalVariabla {

	String name;
	String lastName;
	
	public static void main(String[] args) {
	
		LocalVariabla human1=new LocalVariabla();
		human1.lastName="John";
		human1.lastName="Smith";
		
		LocalVariabla human2=new LocalVariabla();
		human2.lastName="Jimmy";
		human2.lastName="Miller";
		
		LocalVariabla human3=new LocalVariabla();
		human3.lastName="Anna";
		human3.lastName="Robert";
		
		System.out.println(human2.lastName);
		System.out.println(human1.name);
	
}

	
}
