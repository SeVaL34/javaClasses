package ReviewCalss;

import java.util.Scanner;

public class Task5 {
public static void main(String[] args) {
/* Write a program to found out the user level of experience 
Must use a switch statement with  a String variable named levelString and a 
int variable named level 
Beginner level should be 1
Intermediate level should be 2
Expert level should be 3*/

Scanner scan=new Scanner(System.in);
System.out.println("enter your level");
int level=scan.nextInt();
String level1; 

switch (level) {
case 1:
	level1="Beginner";
	break;
case 2:
	level1="Intermediate";
	break;
case 3:
	level1="Expert";
	break;
default:
	level1="no level";
	
}System.out.println("your level is "+ level1);
}}
