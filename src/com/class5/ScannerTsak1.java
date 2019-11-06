package com.class5;

import java.util.Scanner;

public class ScannerTsak1 {
public static void main(String[] args) {

	/*Program to find largest number among 
	 * three numbers using nested if provided by a 
	 * user (numbers must be distinct)
	 */
Scanner scan=new Scanner(System.in);
System.out.print("Write first number: ");
int num1=scan.nextInt();
System.out.print("Write second number: ");
int num2=scan.nextInt();
System.out.print("Write third number: ");
int num3=scan.nextInt();


	if (num1>num2) { 
		if (num2>num3) {
			 
			System.out.println("Your number bigger: "+num1);
		}else {
			System.out.println("Your number bigger: "+num2);
}
	}else {
	if (num1<num2) {
		if (num2<num3) {
			System.out.println("Your number bigger: "+num3);
		}else {
			System.out.println("Your number bigger: "+num2);
		}
	}else {
		System.out.println("Your number bigger: "+num1);
	}

	
	
	
	}}}
