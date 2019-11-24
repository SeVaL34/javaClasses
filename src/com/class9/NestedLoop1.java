package com.class9;

import java.util.Scanner;

public class NestedLoop1 {
public static void main(String[]args) {
	Scanner scan=new Scanner(System.in);
	 System.out.println("start a number");
	System.out.println("end number");
	 
	int start=scan.nextInt();
	int end=scan.nextInt();
	int even=0;
	int odd=1;
	for (int i=start; i<=end ; i++) {
		if (i%2==0) {
		even+=i;
		}else {
		odd+=i;
		}
	}
	System.out.println("number is "+even);
	System.out.println("number is"+odd);

	Scanner scan1 = new Scanner(System.in);
	System.out.println("Enter start number");
	int firstNumber = scan1.nextInt();
	System.out.println("Enter ending number");
	int secondNumber = scan1.nextInt();

	int start1 = 0;
	int end1 = 0;

	if (firstNumber < secondNumber) {
		start = firstNumber;
		end = secondNumber;
	} else {
		start = secondNumber;
		end = firstNumber;
	}
	int even1 = 0;
	int odd1 = 0;

	for (int i = start; i <= end; i++) {
		if (i % 2 == 0) {
			even = even + i;
		} else {
			odd = odd + i;
		}
	}
	System.out.println("The sum of even numbers is " + even);
	System.out.println("The sum of odd numbers is " + odd);
	}


	Scanner scan = new Scanner(System.in);
	System.out.println("Enter start number");
	int start = scan.nextInt();
	System.out.println("Enter end number");
	int end = scan.nextInt();

	int even = 0;
	int odd = 0;

	if (start <= end) {
		for (int i = start; i <= end; i++) {
			if (i % 2 == 0) {
				even = even + i;
			} else {
				odd = odd + i;
			}
		}
		System.out.println("The sum of even numbers is " + even);
		System.out.println("The sum of odd numbers is " + odd);
		
	} else {//if 1num >2num 
		System.out.println("Please enter start# less then end number");
	}}






	//  bu iki sekilde yapilabilir ayni zamanda syso("pls enter number start number less then end number") 
	//de yazabilirsiniz. yaptiginiz programin duzgun sekilde calismasi icin 
		
		


}
