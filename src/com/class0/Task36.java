package com.class0;

import java.util.Scanner;

public class Task36 {
	public static void main(String[] args){
/*Prompt user to input two strings : "Please enter two strings"and two integers: "Please enter two numbers"  
and make the comparisons:
if int1 and int2 are equal and word1 and word2 are equal, output "AND"
if int1 and int2 are equal or word1 and word2 are equal, output "OR"
if int1 and int2 are not equal and word1 and word2 are not equal, output "NONE"*/

		  Scanner scan=new Scanner(System.in);
		  System.out.print("Please enter two strings:");
		  String word1=scan.nextLine();
		  String word2=scan.nextLine();

		  System.out.print("Please enter two numbers:");
		  int int1=scan.nextInt();
		  int int2=scan.nextInt();
		  
if (int1==int2 && word1.equals(word2)) {
	System.out.println("AND");
}else if(int1==int2 || word1.equals(word2)) {
	System.out.println("OR");
}else if (int1!=int2 || (!(word1.equals(word2)))) {
	System.out.println("NONE");
}}}
