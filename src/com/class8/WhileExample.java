package com.class8;

import java.util.Scanner;

public class WhileExample {
public static void main(String[] args) {

/* lets ask user to enter if it is raining or not (true or false)
 * as long as there is rain lets tell user to take an umbrella
 * as soon as there is no rain you go to the park
 */

Scanner scan;
boolean isRain;
scan=new Scanner(System.in);
do {
	System.out.println("is it raining?");
    isRain=scan.nextBoolean();
if(!isRain) {
	break;
}}while (isRain);
System.out.println("go to the park");



//print numbers from 1-10;
 for (int i=1 ; i<=10 ; i++) {
	 System.out.println(i);
 }

//print numbers from 10-1
 for (int i=10 ; i>=1 ; i--) {
	 System.out.println(i);
 }
for (int i=0 ; i<=50 ; i+=5) {
	System.out.println(i); //5,10,15,20
}
 
int num = 10;
while (num <= 7) {
System.out.println("Hello");
num++;
}
// rare
int num1 = 10;
do {
System.out.println("Bye");
num1++;
} while (num1 <= 7);
System.out.println("^^^^^^^^^^^^^^^^^^^^^^");
// print even numbers from 20 to 50 using do while
// 1 way
int even = 20;
do {
System.out.println(even);
even += 2;
} while (even <= 50);
System.out.println("-------------Second way---------");
// 2 way
int even1 = 20;
do {
if (even1 % 2 == 0) {
System.out.println(even1);
}
even1++;
} while (even1 <= 50);


//Write a program using a do while loop to print out all odd number from 0 15 
int odd=0;
while (odd<=15) {
 if(odd%2==1)
	 System.out.println(odd);
odd++;
}

//  *keep asking user to pay for candy until entered price is not equal to 3
//  *after user got a write amount print "Please enjoy your candy"*/  

int can=1;
while (can<=3) {
	do {
		System.out.println("pay for candy");
	can++;
	}}
	System.out.println("enjoy your candy");
	
	}}
