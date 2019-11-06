package com.class9;

import java.util.Scanner;

public class Pattern {
public static void main(String[] args) {
	//*****
	for (int k=1 ; k<=5 ; k++) {
		System.out.println("*");
		}
	
    /* *****
     * *****
     * *****
     */
 for (int m=1 ; m<=4 ; m++) { //rows
	 for (int l=1 ; l<=5 ; l++) { //cols
	 System.out.print("*");
 }
     System.out.println();
 }

 for (int i=0 ; i<5 ; i++) {
	 for (int j=0 ; j<=6 ; j++) {
		 System.out.println("*");
	 }
	System.out.println();	 
	 }
 
for (int a=1 ; a<5 ; a++) { //rows
	for (int b=1 ; b<5 ; b++) { //cols
		System.out.print(a); // 1111
	}
System.out.println();
}
for (int a=1 ; a<5 ; a++) {
	for (int b=1 ; b<5 ; b++) {
		System.out.print(b); //1234
	}
System.out.println();
}

for (int d=1 ; d<10 ; d++) {
	for (int e=1 ; e<10 ; e++) {
		System.out.print(e); //123456789
	}
System.out.println();
}
for (int f=5 ; f>=1 ; f--) {
	for (int g=5 ; g>=1 ; g--) {
		System.out.print(f);
	}
System.out.println();
}

//*
//**
//***
//****
//*****
for (int i=1 ; i<=5 ; i++) {
	for (int j=1 ; j<=i ; j++) { 
		System.out.print("*");
	}
System.out.println();
}
//1
//12
//123
//1234
for (int a=1 ; a<=9 ; a++) {
	for (int b=1 ; b<=a ; b++) {
		System.out.print(a);
	}
System.out.println();
}
for (int a=5 ; a>0 ; a--) {
	for (int b=1 ; b<a ; b++) {
		System.out.print(a);
	}
System.out.println();
}

  for (int i=1 ; i<=5 ; i++) {
	  for (int j=1 ; j<=i ; j++) {
         System.out.print("*");
	  } 
	  System.out.println();
  }
	  for (int c=1 ; c<6 ; c++) {
	for (int d=6 ; d>c ; d-- ) {
		System.out.print("*");
	}
System.out.println();
}

System.out.print("*\n**\n***\n****\n*****\n****\n***\n**\n*");

}

/*Write a program that reads a range of integers 
 * (start and end point), provided by a user and then 
 * from that range prints the sum of the even and odd integers.
 * 
 */


}




