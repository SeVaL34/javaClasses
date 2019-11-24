package com.class22;

public class InstanceVariable {

	String name="Samir";
	
	public static void main(String[] args) {
		
		String name="Burcu";
		System.out.println(name);
		
		InstanceVariable obj=new InstanceVariable();
		System.out.println(obj.name);
		//changing value of the instance variable
		obj.name="John";
		System.out.println(obj.name);
		//creating a new instance of class InstanceVariable
		InstanceVariable obj1=new InstanceVariable();
		//value will be Samir
		System.out.println(obj1.name);
		
	}
}
