package com.class22;

public class AccsessModifiers {

	public static void hello() { //baska paketin icinde kullalabilirsin 
		System.out.println("hello");
	}
	protected static void hello1() {//sadece ayni paketin icinde kullanabilirsin
		System.out.println("hello1");
	}
	static void hello2() {//sadece ayni paketin icinde kulalnabilirsin 
		System.out.println("hello2");
	}
	private static void hello3() {//sadece ayni class icinde kullanabilirsin 
		System.out.println("hello3");
	}
	
}
