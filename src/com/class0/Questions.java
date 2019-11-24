package com.class0;

public class Questions {
public static void main(String[] args) {
	
	/* 1. Largest Prime
       Write a program to calculate largest prime factor of a give number
       If number is negative for does not have prime numbers, the program should print "Invalid value"
       Example input/output:
       21    should print 7 since 7 is the largest print (3 * 7 =21)
       217   should print 31 since 31 is the largest prime (7 * 31 = 217)
       45    should print 5 since 5 is the largest prime (3 * 3 * 5 = 45)
       -1    should print "Invalid number" since number is negative  */
	
	int num=3;
	//int num1=2;
	boolean prime=true;
	
	for(int i=2 ; i<=num/2 ; i++) {
		if(num%i==0) {
		prime=false;
		break;
	}
	
	
	
	}}}

