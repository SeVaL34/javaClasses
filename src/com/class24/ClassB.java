package com.class24;

public class ClassB extends ClassA {

	public String conName="Texas";

	public static void main(String[] args) {
		
	ClassA obj=new ClassA();
	System.out.println(obj.country);
	ClassA.printF();
	
	ClassB obj1=new ClassB();
	System.out.println(obj1.conName);
}
}