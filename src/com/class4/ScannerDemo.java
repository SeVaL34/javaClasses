package com.class4;

import java.util.Scanner;

public class ScannerDemo {
public static void main(String[]args) {
	//scanner is a class present in java.util package 
	//which allows us to take user input
	// mac=command+shift+o  windows=ctrl+shift+0
	//
	System.out.println("hello");
	Scanner keyBInput=new Scanner(System.in);
System.out.println("enter your name");
String name=keyBInput.next();
boolean isMale=keyBInput.nextBoolean();

 if(isMale) {
System.out.println("hello male");
 }else {
	 System.out.println("i am not");
 }
}}
