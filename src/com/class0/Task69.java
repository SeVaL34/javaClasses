package com.class0;

public class Task69 {

public static void main(String[] args) {

/*Write a program to print out the pattern: 

        1
       22 
      333 
     4444 
    55555

 */

for (int line=1 ; line<=5 ; line++) {
	for (int a=1 ; a<=(-1*line+5) ; a++)
	System.out.print(" ");

for (int a=1 ; a<=line ; a++) {
	System.out.print(line);
}
System.out.println();
}}}




