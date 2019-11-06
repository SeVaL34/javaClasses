package com.class4;

import java.util.Scanner;

public class denemeler {

public static void main(String[] args) {

Scanner scan=new Scanner(System.in);
System.out.println("How many years do you work?");
int years=scan.nextInt();

System.out.println("write your salary");
int salary=scan.nextInt();
if (years>=5) {
    System.out.println("you eligible bonus");
	if (50000<=salary) 
    System.out.println("your bonus is 5000");
	else 
	System.out.println("your bonus is 3000");

}else{
	System.out.println("you cannot get bonus");
}}}






