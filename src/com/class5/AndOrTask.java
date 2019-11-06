package com.class5;

import java.util.Scanner;

public class AndOrTask {
public static void main(String[] args) {

	
Scanner scan;
int avarage,midTerm,finalScore,quiz;
scan=new Scanner(System.in);

System.out.println("please enter the quiz score");
quiz=scan.nextInt();

System.out.println("please enter the mid term score");
midTerm=scan.nextInt();

System.out.println("please enter the final score");
finalScore=scan.nextInt();

int average=(quiz+midTerm+finalScore)/3;
String  score;

if (average>=90) {
	score = "A";
}else if(average>=70 && average<90) {
     score ="B";
}else if (average>=50 && average<70) {
	score ="C";
}else if(average<50){
	score="Fail";
}else {
	score="unknow";
}

System.out.println("your score is "+score);
 



/*Write a program to determine the classMode.
If there is no rain → classMode=“In Class”, 
otherwise classMode → “Online”.*/

Scanner key=new Scanner(System.in);
System.out.println("classMode");
boolean noRain=true;
if (!noRain) {
	System.out.println("In class");
}else {
	System.out.println("Online");
}

for (int i=1; i<=10 ; i++) {
for (int a=1; a<=3; a++)
	System.out.println(i+""+a);
}}}
