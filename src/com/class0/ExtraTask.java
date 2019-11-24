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
	
	int num1=12345;
	int rem;
	int sum1=0;
	
	while(num1>0) {
		rem=num1%10; //5
		num1/=10;// 1234
		sum1=sum1+rem;
		
	
	
	}
	System.out.println(sum1);
		
	/* 3.Write a program to determine  whether given number is Armstrong number or not?
       “Armstrong number is a number that is equal to the sum of cubes of its digits.”
       Examples
       Input=153
       Output= true
       Input=155
       Output=false	*/
	
	int num=153;
	int arm=num;
	int d;
	int sum=0;
	while(num!=0 ) {
		d=num%10; //3
		num/=10; //15
		sum=sum+(d*d*d);
		
	}
	if (arm==sum) {
		System.out.println(true);
	}else {
		System.out.println(false);
	}
	








}}

