package com.class18;

public class TaskCozumu {


	public static void main(String[] args) {
		
		TaskCozumu obj=new TaskCozumu();
		obj.getLarge(10, 30);
		obj.getEvenOrOdd(20);
		obj.getPalindrom("seval");
	}
	void getLarge(int a,int b) {
		if (a>b) {
		System.out.println(a+" large number");
	}else {
		System.out.println(b+" large number");
	}}
	
	void getEvenOrOdd(int a) {
		if(a%2==0) {
			System.out.println("even number");
	}else {
		System.out.println("odd number");
	}}
	
	void getPalindrom(String name) {
		String reverse="";
		for(int i=name.length()-1 ; i>=0 ; i--) {
			reverse=reverse+name.charAt(i);
		}
		if(reverse.equals(name)) {
		System.out.println("palindrom");
		}else {
			System.out.println("not palindrom");
		}
		
		
			
		}
}
