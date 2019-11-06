package com.class5;

import java.util.Scanner;

public class SwitchAndScanner {
public static void main(String[] args) {
/* ask user the enter their gender F or M
 * based on the input provide
 * if F--> female
 * if M --> male
 * otherwise -->unknown	
 */
	Scanner scan=new Scanner(System.in);
	System.out.println("please enter your gender : F or M");
	char gender=scan.next().charAt(0);
	String userGender;
	//works only byte,short,int,char,String
	switch(gender) {
	case 'F':
		userGender="Female";
		break;
	case 'M' :
		userGender="Male";
		break;
	default:
		userGender="unknown";
	}
	System.out.println("your gander is "+userGender);
	
	
	}}


