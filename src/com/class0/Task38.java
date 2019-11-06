package com.class0;

import java.util.Scanner;

public class Task38 {
	public static void main(String[] args) {
	
	 Scanner scan=new Scanner(System.in);
	 System.out.println("Is it weekend?");
	 boolean weekend=scan.nextBoolean();
	 
	  
	 String subject1="Java";
	 String subject="Manual testing";
	  
	  if (weekend) {
	  System.out.println("Today you will be learning "+subject1);
	  }else{
	  System.out.println("Today you will be learning "+subject);
	  }

/*	    Scanner scan;
		boolean weekend;
		String subject;
		
		scan = new Scanner(System.in);
		System.out.println("Is it weekend?");
		weekend = scan.nextBoolean();
		
		if (!weekend) {
			subject="Manual Testing";
		}else {
			subject="Java";
		}
		System.out.println("Today you will be learning " + subject);
 * 
 */
	}}
