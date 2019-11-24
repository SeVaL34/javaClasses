package com.class18;

public class task {
/* Create a method that will take 2 parameters as a numbers and prints which number is larger.


Create a method that will take a number and prints whether the number is even or odd.


Create a method that will print whether given String is palindrome or not.
 * 
 */
	
	int num,num1;
	String name;
	
	public static void main(String[] args) {
		
		task large=new task();
		large.num=10;
		large.num1=20;
		int large1;
		if(large.num<large.num1) {
			System.out.println(large.num1+" large");
			
		}else {
			System.out.println(large.num+" large");
		}
	
	
	task oddEven=new task();
	 oddEven.num=10;
	 oddEven.num1=20;
	 
	if(oddEven.num%2==0 || oddEven.num1%2==0) {
		System.out.println("even number");
	}else {
		System.out.println("odd number");
	}
	
	task pal=new task();
	pal.name="Kazak";
	String reverse="";
	
	for(int i=pal.name.length()-1 ; i>0 ; i--) {
		reverse=reverse+pal.name.charAt(i);
	}
	if (pal.name.equals(reverse)) {
		System.out.println("palindrom");
	}else {
		System.out.println("not palindrom");
	}
	
	
	
	
}}
