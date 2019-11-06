package com.class4;

import java.util.Scanner;

public class scannerDemeleri1 {
 
	
	public static void main(String[] args) {
		
		Scanner ky=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=ky.nextLine();
		System.out.println("Enter your age");
		String age=ky.nextLine();
		System.out.println("Enter your mobile number");
		String mobilenumber=ky.nextLine();
		
		
		
		
		System.out.println("Your name is "+name+" your age is "+age+
				  " and your mobile number is "+ mobilenumber);
		
		}
	public static void main1(String[] args) {
	Scanner ky=new Scanner(System.in);
	  System.out.println("Enter your name");
	  String name=ky.nextLine();
	  System.out.println("Enter your age");
	  String age=ky.nextLine();
	  System.out.println("Enter your mobile number");
	  String mobilenumber=ky.nextLine();
	  
	  System.out.println("Your name is "+name+"your age is"+age+
	  "and your mobile number is" +mobilenumber);
	  
	}}
