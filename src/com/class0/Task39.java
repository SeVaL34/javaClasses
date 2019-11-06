package com.class0;

import java.util.Scanner;

public class Task39 {
public static void main(String[] args) {

	

Scanner scan=new Scanner(System.in);
System.out.println("enter name of the instructor");
String instructor=scan.nextLine();
String res = null;
switch (instructor) {
case "Shiva":
res="Will take care of Java Assignment";
break;
case "Sandish":
res="Will take care of SDLC Assignment";	
break;
case "Weqas":
res="Will take care of Selenium Assignment";
break;
case "Asel":
res="Will take care of every Assignment";
break;
case "James":
res="Invalid instructor selected";
break;
default:
}
System.out.println(res);
}}
