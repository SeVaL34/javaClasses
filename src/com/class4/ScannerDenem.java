package com.class4;

import java.util.Scanner;

public class ScannerDenem {
	 public static void main(String[]args) {
	Scanner ky=new Scanner(System.in);
		System.out.println("Please enter the length");
		int num=ky.nextInt();
		System.out.println("Please enter the width");
        int num2=ky.nextInt();
		
		if (num==num2) {
			System.out.println("The shape of your object is square");
		}else {
			System.out.println("The shape of your object is rectangle");
		}
		}
}
