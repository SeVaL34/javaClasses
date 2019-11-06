package com.class7;

public class DoTask {
	public static void main(String[] args) {
	//print even numbers from 20 to 50 using do while

	 int even=20;
	 do {
		System.out.println(even);
	    even+=2;
	 }while (even<=50);
//2. way
	 int even1=20;
	 do {
		 if (even1%2==0) {
			 System.out.println(even1);
		 }
	 even1++;
	 }while (even1<=50);
}}
