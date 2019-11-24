package com.class24;

public class ThisWithConstructor {

	ThisWithConstructor(){//ThisWithConstructor obj=new ThisWithConstructor(); icine birsey yazmazsam bu cikar
		System.out.println("I am non argument constructor");
	}
	
	ThisWithConstructor(String str){//ThisWithConstructor obj=new ThisWithConstructor(); icine parameter yazarsam bu cikar
		this(); //used to call current class constructor //this always must be first statement
		System.out.println("I am constructor with 1 String parameter");
	}
	ThisWithConstructor(String str,String str1){
		this("hello1");
		System.out.println("I am cont 2 parameters");
	}
	public static void main(String[] args) {
		
		ThisWithConstructor obj=new ThisWithConstructor("Hello");
		ThisWithConstructor obj1=new ThisWithConstructor("Hello","bye");
		//can we execute 2 constructors when creating an Object
		//yes - it can be achieved using this()
		//this type constructor calls is known as CONSTRUCTOR CHAINING
	}
}
// this() yazarsak ikisinide cikartir yazmazsak parameter olani yada olmayani cikartir 