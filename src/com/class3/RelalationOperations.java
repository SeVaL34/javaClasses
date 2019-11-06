package com.class3;

public class RelalationOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int num1=20;
	int num2=19;
	System.out.println(num1>num2);
	System.out.println(num1<num2);
	System.out.println("*******");
	
	double d=1.99;
	double d1=2.99;
	boolean b5=d>d1;
	System.out.println(b5); //false
	
	boolean b1=d<d1; //true
	boolean b2=d==d1;//false
	boolean b3=d!=d1;//true
	System.out.println(b1);
	System.out.println(b2);
	System.out.println(b3);
	System.out.println("######");
	int a=90;
	int b=300;
	//if number a is bigger than number b
	//i want to print a is larger than b 
	
	if (a>b) {
		System.out.println("a is larger than b");
	}else {
		System.out.println("a smaller than b");

	}
int expectedHours=15;
int actualHours=2;
//if expected hours are more than actual -> you will succeed
//otherwise, pls study more

if (actualHours>expectedHours){

System.out.println("you will succeed");
	} else {
System.out.println("pls study more");
	
	}
	
	double teaPrice=4.99;
	double allowedPrice=5.99;
	//teaPrice-=2;//2.99=4.99-2
	//if price is more than i can afford i will not buy
	//if price is less or matches what i can afford than i will buy tea
	if (teaPrice<=allowedPrice) {
		System.out.println("i will buy tea");
		System.out.println("and i will enjoy my tea");
	}else {
		System.out.println("i cannot afford,i need to study more ");
		System.out.println("i will go back to study more");
	}
	
	System.out.println("i keep writing some code");
	System.out.println("i keep writing more code");
	
	
	}
	}
