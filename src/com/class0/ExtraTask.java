package com.class0;

public class ExtraTask {
public static void main(String[] args) {
	
	/* 1.Write a program to calculate the factorial of a given number. (8!=?)
       Example
       Input=8;
       Output= 40320 */
	
	int a=8;
	int fact=1;
	for (int i=a ; i>0 ; i-- ) {
		fact=fact*i;
		
	}
	
	System.out.print(fact+" ");
	
	/* 2. Write a program to calculate sum of its digits?
          Example
          Input=1234
          Output=10 */
	
	
	int b=1,c=2,d=3;
	int sum=b+c+d;
	
	for(int i=0 ; i<sum ; i++) {
		sum=sum+i;
	}
	
	System.out.println(sum+" ");
	
	
	








}}

