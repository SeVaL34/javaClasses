package com.class5;

import java.util.Scanner;

public class Task1 {
public static void main(String[] args) {

/*ask user to enter boolean value for sale
 * if no sale--> i am not shopping
 * if sale -->check the price of the item
 * based on the amount we will have to calculate the price after discount 
 * if price<20-->apply 10%
 * if price between 20-100-->20%
 * if between 100-500-->30%
 * anything -->50%
 * 
 * after discount _ the price of the item reduce from _to_
 * 	
 */
	Scanner scan=new Scanner(System.in);
	System.out.println("Is there any sale?");
		
	    boolean sale=true;
	    double discountedPrice=0;
		double discount;
	    sale=scan.nextBoolean();
		System.out.println("discount");
	    discount=scan.nextDouble();
	    //discountedPrice=scan.nextDouble();
	
	 if (sale) {
	   if(discount<=20) {
		   discountedPrice=discount*0.90;
		 if(discount>20 && discount<100);
		   discountedPrice=discount*0.80;
		    if(discount>=100 && discount<500);
		       discountedPrice=discount*0.70;
	       }else{
                  discountedPrice=discount*0.50;
	   }}else {
		   System.out.println("there is no sale");
	   }
		   System.out.println("After discount "+discount+"the price or the item reduce from "
	   		+ discount+"to"+discountedPrice);
	   }}
	   

