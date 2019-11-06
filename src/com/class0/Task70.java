package com.class0;

public class Task70 {
public static void main(String[] args) {

/*Write a program to print out the pattern: 

$$$$
$  $
$  $
$$$$
  
 */
//hint= you can just skip the empty area by opening if-else cond 
	for (int a = 1; a < 5; a++) {
	   for(int b=1 ; b<5 ; b++) {
	     if (a==1 || a==4 || b==1 || b==4)  {
          System.out.print("$");
	     }else {
		  System.out.print(" ");
	     }
	}
	System.out.println();}


/******
 *    *
 *    *
 *    *
 *    *
 ****** 
 */
	for (int c=1 ; c<=6 ; c++) {
	for (int d=1 ; d<=5 ; d++) {
		if (c==1 || c==6 || d==1 || d==5) {
			System.out.print("*");
		}else {
			System.out.print(" ");
		}}
System.out.println();

	}}}





