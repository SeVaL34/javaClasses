package com.class5;

public class ANDorOperators {
  public static void main(String[]args) {
	/*if number is between 1-10 -->this number is small
	 * if number is between 10-100 --> this number is medium
	 *if number between 100-1000--> this numbebr is large
	 *any other number --> is out of the range
	 */
	  int num=200;
	  // true AND false --> false
	  if (num>1 && num<10) {
	System.out.println("this number is small");
	  // true AND false--> false
	  }else if (num>=10 && num<100) {
	  System.out.println("this number is medium");
      // true AND true-->true
	  }else if (num>=100 && num<1000) {
	  System.out.println("this number is large");
      }else {
	  System.out.println("number is out of our the range");
}}}
