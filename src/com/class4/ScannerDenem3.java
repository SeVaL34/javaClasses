package com.class4;

import java.util.Scanner;

public class ScannerDenem3 {
public static void main(String[]args) {
	
	Scanner ky=new Scanner(System.in);
	System.out.println("Do you have a credit card?");
	boolean card=ky.nextBoolean();
	
	if (card) {
	    System.out.println("What is the balance on your card?");
	    int cardbalance=ky.nextInt();
	         if(cardbalance>1000) {
	    	     System.out.println("pay it immediately");
	    	   
	          }else {
	    	       System.out.println("you can spend more");
	          }
	   }else {
		System.out.println("you can a get new one");
	}
		
	
	 }}

