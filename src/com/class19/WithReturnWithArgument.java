package com.class19;

public class WithReturnWithArgument {

	int add(int a,int b) {
		int c=a+b;
		return c;
	}
	public static void main(String[] args) {
		WithReturnWithArgument obj=new WithReturnWithArgument();
		int x=obj.add(1, 2);
		System.out.println(x);
	}
}
