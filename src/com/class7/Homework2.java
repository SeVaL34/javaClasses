package com.class7;

import java.util.Scanner;

public class Homework2 {
public static void main(String[] args) {

/* you need to ask user to play for coffee
 * you need to keep asking user to pay for it until
 * entered price is equal=5;
 * after user paid then say "Enjoy your coffee!"
 */

//1st way to do it
Scanner scan=new Scanner(System.in);

int price;
 do {

	 System.out.println("pay your coffee");
	 price=scan.nextInt();

 
 }while (price!=5); 


System.out.println("enjoy your coffee");


 /* 2. way to do it
 *int price;
 * System.out.println("please pay your coffee"); 
 * price.scan.nextInt();
 *  while (price!=5) {
 *  System.out.println("please pay your coffee");
 *  }
 *  syso("enjoy your coffee);
 */




}}
