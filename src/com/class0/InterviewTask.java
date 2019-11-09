package com.class0;

import java.util.Scanner;

public class InterviewTask {
public static void main(String[] args) {
	
	/* Write a program to swap 2 numbers without a temporary variable? Swap  2 strings without a temporary variable?
Write a java program to find the second largest number in the array? Maximum and minimum number in the array?
Find out how many alpha characters present in a string?
How to find out the part of the string from a string? What is substring? Find number of words in string?
Write a java program to reverse String? Reverse a string word by word?
Write a Java Program to find whether a String is palindrome or not?
Write a java program to check whether a given number is prime or not?
Write a Java Program to print first 10 numbers of Fibonacci series.
	 * 
	 */

int a=5;
int b=10;

a=a+b;
b=a-b; //5
a=a-b; //10

System.out.println("before b is : "+b+", a is : "+a);
System.out.println("after a is : "+a+", b is : "+b);

String sa="Life";
String sa1="Love";
System.out.println("before : "+sa+" "+sa1);

sa=sa1.replaceAll("Life", "Love");
sa1=sa.replaceAll("Love", "Life");
System.out.println("after : "+sa+ " "+sa1);

Scanner inp = new Scanner(System.in);
System.out.print("In:");
int x = inp.nextInt();
//write your code below
 

}
}
