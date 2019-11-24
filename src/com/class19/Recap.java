package com.class19;

public class Recap {

	void methodName(String str) {
		//String str -->parameter
		System.out.println("Hello "+str);
	}
	//create to display hello 5 times
	void sayHello(int times) {
		for(int i=0 ; i<times ; i++) {
			System.out.println("Hello");
		}
	}
	//create method to say smth # number of times
	void saySomething(String word,int times) {
		for (int i=0 ; i<times ; i++) {
			System.out.println(word);
		}
	}
	public static void main(String[] args) {
		Recap obj=new Recap();
		obj.methodName("Anton");
		obj.sum(10, 30);
		obj.sayHello(2);
		obj.saySomething("Java",5);
		//obj.saySomething(5,"Welcome"); -->compiler error
		
	}
	
	void sum(int num1,int num2) {
		int c=num1+num2;
		//System.out.println("The sum of 2 number is= "+c);
	}
}

