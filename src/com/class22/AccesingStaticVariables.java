package com.class22;

public class AccesingStaticVariables {

	public static void main(String[] args) {
		 
		Dogs obj=new Dogs();
		System.out.println(obj.name);
		
		System.out.println(Dogs.breed);
		System.out.println(obj.breed);
	}
}
