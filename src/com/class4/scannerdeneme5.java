package com.class4;

import java.util.Scanner;

public class scannerdeneme5 {

	public static void main(String[]args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter first number");
	int num1=scan.nextInt();
	
	 
	System.out.println("enter in operator");
    String operator=scan.next();
    //System.out.println(operator);
    
    System.out.println("enter second number");
    int num2=scan.nextInt();
    
    if(operator.equals("+")) {
    System.out.println(num1+num2);
    }else if(operator.equals("-")) {
    System.out.println(num1-num2);
    }else if (operator.equals("/")) {
    System.out.println(num1/num2);
    }else if(operator.equals("*")) {
    System.out.println(num1*num2);
    }else {
    	System.out.println("invalid operator or number");
    	
    	
    	
    }
	}}