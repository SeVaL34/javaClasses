package com.class0;

public class deneme1 {

	int hour(int a,int b) {
	for(int a1=0 ; a1<24 ; a1++) {
		for(int b1=0 ; b1<60 ; b1++) 
	System.out.println(a1+":"+b1);}
	return 0;
	
	}
	public static void main(String[] args) {
		
		deneme1 clock=new deneme1();
		clock.hour(24, 60);
		System.out.println(clock);
	}}



