package com.class5;

import java.util.Scanner;

public class SwitchTask {
public static void main(String[] args) {

	/*HomeWork: Using scanner class create calculator.
	 * Allow user to enter 2 numbers and operator(+,-,*,/). 
	 * Based on operator provide the result to user.*/
	
Scanner scan=new Scanner(System.in);
System.out.print("Write your first number: ");
int num1=scan.nextInt();
System.out.print("operator");
char operator=scan.next().charAt(0);
System.out.print("Write second number: ");
int num2=scan.nextInt();

int result;

switch(operator) {
case '+':
result = num1+num2;
 System.out.println(result); 
break;
case '-':
result = num1-num2;
System.out.println(result); 
break;
case '*':
result = num1*num2;
System.out.println(result); 	
break;
case '/':
result = num1/num2;
System.out.println(result); 	
break;
default: 


}
}}
