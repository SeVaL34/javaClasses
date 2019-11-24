package com.class24;

public class ClassC extends ClassB {

	public String cityName="Dallas";
	
	public static void main(String[] args) {
		
		ClassB obj=new ClassB();
		System.out.println(obj.country);
		System.out.println(obj.conName);
		
		ClassC obj1=new ClassC();
		System.out.println(obj1.cityName);
	}
}
