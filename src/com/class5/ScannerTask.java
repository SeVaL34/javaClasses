package com.class5;

import java.util.Scanner;

public class ScannerTask {
public static void main(String[] args) {
	/*Write a program to find largest of three 
	double values using if-else..if and 
	logical operators provided by a user 
	(numbers must be distinct)*/
	Scanner scan=new Scanner(System.in);
	System.out.print("Write the first number: ");
	double num1=scan.nextDouble();
	System.out.print("Write the second number: ");
    double num2=scan.nextDouble();
    System.out.print("Write the third number: ");
	double num3=scan.nextDouble();
	
	if (num1>num2 && num2>num3) {
		System.out.println("Bigger number is :"+num1);
	}else if (num1<num2 && num2<num3){
		System.out.println("Bigger number is :"+num3);
	}else {
		System.out.println("Bigger number is :"+num2);
	}}}
		
	
	
	
	
	
	
	  



