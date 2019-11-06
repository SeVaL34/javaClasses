package com.class4;

import java.util.Scanner;

public class deneme1 {
public static void main(String[]args) {

Scanner scan=new Scanner(System.in);
System.out.println("which city?");
String city=scan.nextLine();
System.out.println("what is temp.?");
int temp=scan.nextInt();
int convertedTemp=(temp-32)*5/9;
System.out.println("The temp is the "+ city+ " is"+ 
convertedTemp);


}

/*You are a loan specialist and you 
need to ask user what is the amount 
of loan is needed. If loan is less than 
200,000 then you would lend the money 
otherwise you would reject the client.*/





}
