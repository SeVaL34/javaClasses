package com.class4;

public class IfElseRecap {

	public static void main(String[] args) {

		/*
		 * class schedule if tuesday--> sdlc if wednesday --> java review if
		 * thursday-->sdlc if saturday -->java coding if sunday -->my favorite java
		 * coding
		 * 
		 */

		int day = 4;
		day = 3;

		if (day == 2) {
			System.out.println("SDLC class");
		} else if (day == 3) {
			System.out.println("Review class");
		} else if (day == 4) {
			System.out.println("SDLC class");
		} else if (day == 6) {
			System.out.println("java class");
		} else if (day == 7) {
			System.out.println("favorite java class");
		} else {
			System.out.println("there is no class");
		}

		boolean b = false;
		boolean classToday = true;

		if (b) {
			System.out.println("hello");
			if (classToday) {
				System.out.println("hello my friend");
			} else {
				System.out.println("bye");
			}
		}
		
	}}
	


