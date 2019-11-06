package com.class4;

public class NestedDeneme {

	public static void main(String[]args) {
		
	int num=567;
	
	
	if (num<100 && num>9) {
		System.out.println("2 digit");
	}
		if(num<=999 && num >=100) {
			System.out.println("3 digit");
		}
			if(num<100000 && num>=999999) {
			    System.out.println("4 digit");
			}else {
				System.out.println("5 digit");
			}
		}
		
	

	
}
