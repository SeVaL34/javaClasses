package com.class2;

public class VaribleDeclaration {
public static void main (String[] args) {
	//1.declaring variable num1 that will hold value of int and 
	//assigning value of 123 to it
	int num1=123;
	int num2=6767;
	long num3=78787878l;
	char num4='A';
	
	//2.declare variable first and then assingn value
	int n1;
	int n2;
	int n3;
	
	n1=56;
	n2=7676;
	n3=767;
	
	//3.declare all variable together and then assign value
	int number1, number2, number3;
	number1=12;
	number2=15;
	number3=676;
	
	//System.out.println(number3);
	
	number3=1000;
	
	System.out.println(number3);
	
boolean var=true;
System.out.println(var);

	char myVariable='^';
	myVariable='*';
	System.out.println(myVariable);
	
	number2=number1;
	System.out.println(number2);

//number2=false; compile time error asking to change datatype of
	//variable number2 to boolean 
System.out.println();

//variable can be decpared only ONCE!! 
// you MUST put values of specified datatype ONLY

// values of variable CAN be change later in the program

//we can use values of other variables to initialize another variable
boolean isRain=false;
boolean isSnow;
isSnow=isRain; //isSnow=false

System.out.println(isSnow);

isSnow=true;
System.out.println(isSnow);

}

// to attach any value (int,String,char,boolean) to a String we use (+)
//-> concatenation operator

}
