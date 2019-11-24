package com.class23;

public class demo {

	/*Write a program  that will have a private constructor
	 * class and create 2 objects of this class:
	 * 1 - inside same class; 
	 * 2 - from outside the class and observe result.
	 */

	private demo() {
	
	}
	
	String name;
	int num;
	
public static void main(String[] args) {
		
		demo obj=new demo();
		obj.name="Seval";
		obj.num=123456789;
	
		System.out.println(obj.name+" "+obj.num);
		
}}

// private baska class in icindeyken constructor calismaz. sadece public protected ve default at calisir	
