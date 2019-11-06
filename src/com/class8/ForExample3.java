package com.class8;

import java.util.Scanner;

public class ForExample3 {
	public static void main(String[] args) {

// print numbers from 1 to 50 accept those that are divisible by 3

		for (int a = 0; a <= 50; a++) {

			if (a % 3 == 0) {
				continue;
			}
			System.out.println(a); 

		}
	/* create a program that will be asking user to apply for 
	 * a credit card 10 times.
	 * as soon you get an "yes" from a user program should stop asking.
	 */
	String card;
	Scanner scan=new Scanner(System.in);
	
	for (int b=0 ; b<=10 ; b++) {
		System.out.println("are you apply to a card?");
		card=scan.nextLine();
	
		if (card.equalsIgnoreCase("yes")) {
	        break;
	}
}}}
//codecademy, codegym,  geeksforgeeks...