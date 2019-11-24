package com.class3;

public class IfElseIf {

	public static void main(String[] args) {

		int num1 = 100;
		int num2 = 100;

		if (num1 > num2) {
			System.out.println("num1 is larger than num2");
		} else if (num1 == num2) {
			System.out.println("num1 is equal num2");
		} else {
			System.out.println("num1 is smaller than num2");

		}
		int day = 4;

		if (day == 1) {
			System.out.println("today is monday. i have to go to work");

		} else if (day == 2) {
			System.out.println("today is tuesday. i have to go to work");
		} else if (day == 3) {
			System.out.println("today is wednesday/i have sdlc class");
		} else if (day == 4) {
			System.out.println("today is thursday.weekend is here");
		} else if (day == 5) {
			System.out.println("today is friday.holiday");
		} else if (day == 6) {
			System.out.println("today is saturday.");
		} else if (day == 7) {
			System.out.println("i love spending");
		} else {
			System.out.println("i dont have this day");
		}
		System.out.println("i am done with if statement");
	}

//cntl+shif+f--> for windows and command+shift+f-->for mac (duzenlemek icin)


}
