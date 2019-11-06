package com.class0;

import java.util.Scanner;

public class forTask {
	public static void main(String[] args) {

		// Task 0ne Print numbers from 10 to 1
	 
		for (int a=10 ; a>=1 ; a--) {
			System.out.println(a);
		}
		
		// Task Two Write a program from 40 to 10 and only print the even numbers
	 
		for (int b=10 ; b<=40 ; b++) {
		   if (b%2==0) {
		      System.out.println(b); 
	 }
		    
		// Task Three Write a program from 50 to 25 and only print the odd numbers
		
		   for (int c=25 ; c<=50 ; c++) {
			   if(c%2==1) {
				   System.out.println(c);
			   }
		   }
		// Task Four Write a program from 0 to 100 and break the loop once the value  reaches 45
		int value;
		Scanner scan=new Scanner(System.in);
		   for (int d=0 ; d<=100 ; d++) {
			   System.out.println("write the any value");
			   value=scan.nextInt();
			   if(value==45) {
			  break;
			   }}
	
		// Task Five Write a program  1 to 10 and if the value is 10 
        int value1;
	for (int e=0 ; e<=10 ; e++) {
		System.out.println("write your value");
		value1=scan.nextInt();
		if (value1==10) {
		break;
		}
	}
	
	
	}}}
