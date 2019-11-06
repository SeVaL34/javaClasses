package ReviewCalss;

import java.util.Scanner;

public class Task {
public static void main(String[] args) {
//Write a program to find if the largest Number of three numbers
  //Print out  System.out.println("Largest number is " + largestNumber);
  // Must use if then a else if and lastly else 

Scanner scan=new Scanner(System.in);
System.out.println("enter first number");
int a=scan.nextInt();
System.out.println("enter second number");
int b=scan.nextInt();
System.out.println("enter third number");
int c=scan.nextInt();

if (a>b) {
System.out.println("largest number is "+a);
}else if (b>c){
	System.out.println("largest number is "+b);
}else {
	System.out.println("largest number is "+ c);


}}}
