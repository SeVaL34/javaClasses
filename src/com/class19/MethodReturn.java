package com.class19;

public class MethodReturn {
public static void main(String[] args) {
	/* declare a String and
	 * if String has more than 10 characters-->String is large
	 * otherwise-->String is small
	 */
	String str="welcome home";
	int numOfChars=str.length();
	if(numOfChars>10) {
		System.out.println("String is large");
	}else {
		System.out.println("String is small");
	}
	
	char character=str.charAt(4);
	System.out.println(character);
}
//create an object of the class where method is defined
Recap obj=new Recap();
//int num=obj.sum(10,30); compile error saying change return type

void sum(int num1,int num2) {
	int c=num1+num2;
	return ;
}
}
