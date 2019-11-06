package com.class4;

import java.util.Scanner;

public class ScannerExample {
public static void main(String[] args) {

	Scanner scan=new Scanner(System.in);
System.out.println("please enter any number");
	/*nextInt();-> for numbers 
 * nextLine(); String
 * nextDouble(); ->double
 */
int number=scan.nextInt();
System.out.println("entered number " +number);
	
Scanner input=new Scanner(System.in);
System.out.println("please enter your name");
String name=input.nextLine();
System.out.println("good afternoon" +name);
String lastName=input.nextLine();
System.out.println("hi"+lastName);
int  age=input.nextInt();
System.out.println(55);
}
}