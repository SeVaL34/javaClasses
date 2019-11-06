package com.class2;

public class StringExample1 {
public static void main(String[] args) {
	
	String name="Seval";
	String lastName="Saygin";
	String grade="33";
	String city="Dallas";
	String state="Texas";
	String phoneNumber="214315066";
	
	System.out.println(name);
	System.out.println(lastName);
	System.out.println(grade);
	System.out.println(city);
	System.out.println(state);

			
	/*in your program create different
	 * type of variable to store student's information
	 * name lastName grade city state phoneNumberb)
	 * change student's city,state,phone number and grade. and print values.		
	 */
			
	String studentCity="VA";
	//String studentCity="Washington DC";// we do not need to declare
	//variable again
	
	studentCity="Washington DC";
	//My name is _
	//I live in city of _
	//My phone number is _
	
	System.out.println("My name is " + name );
	System.out.println("i live in city of " + city);
	System.out.println("My phone number is " + phoneNumber);
	
}
}
