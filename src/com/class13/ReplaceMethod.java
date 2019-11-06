package com.class13;

public class ReplaceMethod {
public static void main(String[] args) {
	
/*.replace
 * this method returns a new string resulting 
 * from replacing all occurrences of oldChar
 * in this string with newChar.
 */

String str="Hello Dear Dan,how are you,how you been Dan?";

System.out.println(str.replace('e', 'z'));

System.out.println(str.replace("Dear", "Respected"));

System.out.println(str.replaceFirst("Dan","Ali"));


}}
