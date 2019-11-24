package com.class19;

public class WithReturnNoArgument {

	 public int add() {
		 int a=40;
		 int b=50;
		 int c=a+b;
		 return c;
	}
	 public static void main(String[] args) {
		 WithReturnNoArgument obj=new WithReturnNoArgument();
		 int x=obj.add();
		 System.out.println(x);
	}
}
