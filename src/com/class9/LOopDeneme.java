package com.class9;

import java.util.Scanner;

public class LOopDeneme {
public static void main(String []args) {
	/*Write a guessing game where the user has to
	* guess a secret number between 1 and 20.
	* After every guess input, the program tells the user
	* whether their number was too large or too small.
	* The program will keep asking the user to enter the number until he finds
	* the correct number. When the correct answer is found
	* the system should display “Congratulations!!. You got it!”
	*/

	Scanner scan=new Scanner(System.in);

for (int a=1 ; a<=20 ; a++) {
	System.out.println("pls enter the number");
     int num=scan.nextInt();
     
     if (num==10) {
    	 System.out.println("congrats");
    	break;
     }else if (num<10) {
    		 System.out.println("smaller");
     }else {
    		 System.out.println("bigger");
    	 }
     
     Scanner scan1;
		int secretNumber, guessNumber;

		scan1 = new Scanner(System.in);
		secretNumber = 12;
		// for (int i=0; i<20; i++) -> you are limiting user to 20 inputs
		do {
			System.out.println("Please guess my number from 1 to 20");
			guessNumber = scan1.nextInt();

			if (guessNumber < secretNumber) {
				System.out.println("Your number is too small");
			} else if (guessNumber > secretNumber) {
				System.out.println("Your number is too large");
			}
		} while (guessNumber != secretNumber);

		System.out.println("Congratulations you got it");
	}




}}   




