package com.class5;

import java.util.Scanner;

public class LogicalAndScanner {
public static void main(String[] args) {

	/*ask user to enter age
	 * if age is from 1 to 3--> you are baby
	 * if age from 3-5 --> you are toddler
	 * if age from 5-12 -->you are kid
	 * if age from 12-19 --> teenager
	 * if age 20--> you are an adult
	 */
Scanner scan=new Scanner(System.in);
System.out.println("pls enter your age");
int age=scan.nextInt();

if (age>=1 && age<3) {
   System.out.println("you are baby");
   }else if(age>=3 && age<5) {
	System.out.println("you are toddler");
   }else if(age>=5 && age<12) {
	System.out.println("you are kid");
   }else if(age>=12 && age<19) {
	System.out.println("teenager");
}else {
	System.out.println("you are adult");
}







}}
