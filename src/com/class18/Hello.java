package com.class18;

public class Hello {

	void sayHello(String name) {
		System.out.println("Hello "+name);
	}
	
	public static void main(String[] args) {
		Hello obj=new Hello();
		obj.sayHello("Asel");
		obj.sayHello("Seval");
		obj.sayHelloDifferentLanuage("USA");
		obj.sayHelloDifferentLanuage("Russia");
		obj.sayHelloDifferentLanuage("Turkey");
		obj.sayHelloDifferentLanuage("paraguay");
		obj.sayNameAndAge("Seval",20);
		obj.isSnowing(true);
	}
	/* create a method that will say hello in different language
	 * based on the value that will be passed when user calls a method
	 */
	
	void sayHelloDifferentLanuage(String country) {
		
		
		switch(country.toLowerCase()) {
		
		case"USA":
			System.out.println("Hello");
			break;
		case"Russia":
			System.out.println("Privet");
			break;
		case"Paraguay":
			System.out.println("Hola");
			break;
		case"Albania":
			System.out.println("Pershendetje");
			break;
		default:
		System.out.println("I dont know");
		}
		
		
		
		
	}
	
	
	//method to say name and age
	
	void sayNameAndAge(String name,int age) {
		System.out.println("My name is "+name+" and I am "+age+" years old");
	}
	
	//create a method that will check if it snowing
	//if snow--> stay at home , otherwise go to for a walk
	
	void isSnowing(boolean isSnowing) {//method header
		//method body
		if (isSnowing) {
			System.out.println("stay at home");
		}else {
			System.out.println("go to for a walk");
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
