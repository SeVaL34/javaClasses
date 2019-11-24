package com.class23;

public class Student {

	/* Write program as a Student class that has instance variables name and address. 
	 * Create a constructor that will initialize those variables. 
	 * Print name & address of given  student by the displayInfo method.
	 */
	
	String name;
	String address;
	
	Student(){
		
	}
	
	Student(String name,String address){
		this.name=name;
		this.address=address;
	}
	public void displayInfo() {
		System.out.println(name+" "+address);
	}
	
	public static void main(String[] args) {
		
		Student obj=new Student("Seval","Dallas");
		obj.displayInfo();
	}

}
