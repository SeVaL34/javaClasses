package com.class14;

public class ToCharArrayMethod {
public static void main(String[] args) {
	
	String str="Syntax";
	
	//str.toCharArray();
	//System.out.println(str.toCharArray());
	/* .toCharArray
	 * This method converts this string to a new character array.
	 */
	
	char[] array=str.toCharArray(); 
	for (char i:array) {
	System.out.println(i); //syntax harfleri altalta cikaracak
}
	char b='w';
	char c='a';
	System.out.println(b+""+c); // harflerin sayi karsiliklari cikar o yuzden aralaina boslul koymaliyiz 







}}
