package com.class19;

public class NoReturnNoArgument {

	//1) no return no arguments
	
	public void add() {
		int a=40;
		int b=50;
		int c=a+b;
		System.out.println(c);
		
	}
	public static void main(String[] args) {
		NoReturnNoArgument obj=new NoReturnNoArgument();
		obj.add();
	}
	
}
