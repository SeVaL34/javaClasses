package com.class2;

public class Task2 {
 public static void main(String[] args) {
	
	int num1=10;
	int num2=5;
	
	int sum=num1+num2;
	int sub=num1-num2;
	int mult=num1*num2;
	int div=num1/num2;
	String add = "addition";
	String mult1="multiplation";
	String div1="division";
	String sub1="subtraction";
	
	System.out.println("The "+ add + " of 2 numbers " + num1 +" and " + num2+
			" is equal to " + sum);
	
	System.out.println("The " +mult1+ " of 2 numbers " + num1 +" and " + num2+
			" is equal to " + mult);			
 
	System.out.println("The " +div1+ " of 2 numbers " + num1 +" and " + num2+
			" is equal to " + div );	
	
	System.out.println("The " +sub1+ " of 2 numbers " + num1 +" and " + num2+
			" is equal to " + sub);	
	
	double sqnum1 = 3.9;
		 double squore = sqnum1 * 4;
		 System.out.println("The square of the " + sqnum1 + " is " + squore);
		 
		 int w=5;
		 int h=8;
		 int area=w*h;
		 int pri=2*(w+h);
		 
		 System.out.println("The perimeter of a rectangle with width " + w + " and height "+ h +
				 " is equal to "+ pri  + " and the ares is "+ area);
				 
			String message="The perimeter of a rectangle with width " + w + " and height "+ h +
					 " is equal to "+ pri  + " and the ares is "+ area;
			
			System.out.println(message);
			

}	
}
