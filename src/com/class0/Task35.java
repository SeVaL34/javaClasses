package com.class0;

import java.util.Scanner; 
class Task35 {
public static void main(String[] args){

Scanner scan=new Scanner(System.in);
System.out.println("Do you need a loan?");
boolean card=scan.nextBoolean();

String eligibility="";

if (card){
	    System.out.println("What is your credit score?");
	    int loan=scan.nextInt();
	if (loan<600) {
    eligibility="Not eligible";
	}else if (loan>=600 && loan<=700){
		eligibility="Maybe eligible";   
	}else  if (loan>701 && loan<=800){
		eligibility="Eligible";   
	} else if(loan>800){
		eligibility="Definitely eligible";
		}
}else{
	eligibility="Unknown";
    }
	
System.out.println(eligibility);

}}