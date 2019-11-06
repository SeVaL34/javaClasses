package com.class0;

import java.util.Scanner;

public class Task1 {
public static void main(String[]args) {
	 
	Scanner inp = new Scanner(System.in);
	    System.out.print("In:");
	    double max = inp.nextDouble();
	    //write your code below
//for (double i : max) {
	    
	    if(max%max==0 || max%1==0) {
	System.out.println(Math.sqrt(max)+"prime");
}else {
	System.out.println(Math.sqrt(max));
}







}
}
