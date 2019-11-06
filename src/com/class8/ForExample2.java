package com.class8;

public class ForExample2 {
	public static void main(String[] args) {

		/*
		 * write a code to find the sum of even & odd numbers from range 1 to 20
		 * expecting 2 outputs sum for odd nums=... 
		 * sum for even nums=....
		 */
		int sumEven = 0;
		int sumOdd = 0;

		for (int a = 1; a <= 20; a++) {
			if (a % 2 == 0) {
				sumEven = sumEven + a;
			} else {
				sumOdd = sumOdd + a;
			}
		}
		System.out.println("the total all even" + sumEven);
		System.out.println("the total all even" + sumOdd);
	}
}
