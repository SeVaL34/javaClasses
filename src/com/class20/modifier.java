package com.class20;

public class modifier {
//public static void main(String[] args) {
	
	//public can be seen/accessed
	//from everywhere
	public void add1() {
		int num1=2;
		int num2=1;
		int result=num1+num2;
	}
	//default can be seen/accessed
	//within package
	void add2(int num1,int num2) {
		int result=num1+num2;
	}
	//protected can be seen/accessed
	//within package
	protected int add3() {
		int num1=2;
		int num2=2;
		int result=num1+num2;
		return result;
	}
	//private can be seen/accessed
	//only within this class
	private int add4(int num1,int num2) {
		int result=num1+num2;
		return result;
		
	}
	


}
	

