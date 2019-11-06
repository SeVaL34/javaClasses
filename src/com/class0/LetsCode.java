package com.class0;

import java.util.Scanner;

public class LetsCode {
public static void main(String[]args) {

	System.out.println("*****\n***\n*\n***\n*****");

 
	System.out.println(2+4+5);

 System.out.println("Hey there,\nI am data!");

int a=2;
double b=2.0;


System.out.println("int : "+a+"\nfloat : "+b+"\nchar : ");

int area1=2*3;
System.out.println(area1);

char ASCII='h';
System.out.println((int)'h');

double d=100.235;
System.out.println((int)d);

int x=3+'d';
System.out.println((char)x);

int i=5;
double e=6.2;
System.out.println(i+e);

System.out.println(3.9*3.9);

//Length and breadth of a rectangle 
//are 5 and 7 respectively. Write a program to calculate
//the area and perimeter of the rectangle.
int area=5*7;
int perimeter=(5+7)*2;
System.out.println("area is: "+area +"\nperimeter is: "+perimeter);

//Write a program to add 8 to the number 2345 
//and then divide it by 3. Now, the modulus 
//of the quotient is taken with 5 and then multiply the resultant 
//value by 5. Display the final result./
System.out.println((((8+2345)/3)%5)*5);

//Write a program to check if the two numbers 23 and 45 are equal.
System.out.println(23==45);

//Assign values of variables 'a' and 'b' 
//as 55 and 70 respectively and then check 
//if both the conditions 'a < 50' and 'a < b' are true.
int f=55;
int g=70;
if (f<50 && f<g) {
	System.out.println();
}else {
	System.out.println(true);
}
System.out.println(Math.pow(7,5));

float Fahrenheit, Celsius;  
Fahrenheit = 70;  
Celsius  = ((Fahrenheit-50)*5)/9;  
System.out.println("Temperature in celsius is: "+Celsius);  

//Write a program to take two integer inputs 
//from user and print sum and product of them.
Scanner scan=new Scanner(System.in);
int k=scan.nextInt();
int l=scan.nextInt();
System.out.println(k+l);


}}









