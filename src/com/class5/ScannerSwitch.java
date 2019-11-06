package com.class5;

import java.util.Scanner;

public class ScannerSwitch {
public static void main(String[] args) {
	/*aske user where they are from
	 * based on the country we will spacify favorite food
	 * 
	 */

String country,foodName;
Scanner scan;

scan=new Scanner(System.in);
System.out.println("pls enter your country");
country=scan.nextLine();

switch(country) {
case "Turkey":
	foodName="kebab";
	break;
case "Ethiopia":
	foodName="tibs";
	break;
case "Morocco":
	foodName="tajin";
	break;
case "Kazakhstan":
	foodName="kumis";
	break;
case "Pakistan":
	foodName="beryani";
	break;
case "Russia":
	foodName="caviar";
	break;
case "Cuba":
	foodName="sofrita";
	break;
	
 default:
	foodName="unknown";
}
	System.out.println("You are from "+country+" and your favorite food is "+foodName);


}}

