package com.class14;

public class StringTask {
public static void main(String[] args) {
	
	/*Create a String that will hold a sentence.
	 *Write a program to get a new String without any spaces.
	 */
	String str="Today is Sunday";
	System.out.println(str.replace(" ", ""));
	
	/*Create a String that should be combination of letters,
	 * numbers and special characters. 
	 * Find out how many alpha characters are there in the String.
	 */
	String str1="s123e123v123a123l!!!";
	System.out.println(str1.replaceAll("[^A-z]",""));
	
	/*You have a String a=”Is it saturday? Is it raining?
	 * Do we have a Java Class today?” 
	 * How would you find out how many sentences are in that String?
	 */
	String str2="Is it saturday? Is it raining? Do we have a Java Class today?";
	String [] array=str2.split("\\?");
	//for(int i=0 ; i<array.length ; i++) {
	System.out.println(array.length);



}
}
