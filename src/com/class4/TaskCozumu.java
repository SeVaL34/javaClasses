package com.class4;

import java.util.Scanner;

public class TaskCozumu {
	/*You are DMV representative and you need 
	to ask customer their age. 
	If they are 18 and older you will 
	issue a driver license to them,otherwise 
	you will offer them to get a learners permit.*/

public static void main(String[]args) {

Scanner scan=new Scanner(System.in);
System.out.println("what is your age?");
int age=scan.nextInt();

if (age>=18) {
	System.out.println("you can get driver license");
}else {
	System.out.println("you need to get permit");
}

}}
