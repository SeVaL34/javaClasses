package com.class7;

import java.util.Scanner;

public class ScannerAndLoop {
public static void main(String[] args) {

/*ask user to enter name 5 times
 * and our output should be "Good afternoon_____"*/
 
Scanner scan=new Scanner(System.in);

int i=1;

while (i<=5) {

System.out.println("please enter your name");

String name=scan.nextLine();

System.out.println("good afternoon"+name);

i++;
}




}}
