package com.class13;

public class Recap2 {
public static void main(String[] args) {
	
	/*
     * str.isEmpty();
    str.length();
str.toUpperCase();
str.toLowerCase();
str.equals();
str.equalsIgnoreCase();
str.contains(s);
str.startsWith(String prefix);
str.endsWith(String suffix);
str.concat(String str);
str.trim();
str.charAt(int index);
str.indexOf(int ch);
     */
	
	String str1="Hello";
	String str2="Hello";
	
	String str3=new String("Bye");
	String str4=new String("Bye");
	
	System.out.println(str1.contentEquals(str2));//true
	System.out.println(str1==str2);
	System.out.println(str3.equals(str4));
	System.out.println(str3==str4);
	
	
	System.out.println(str1.contains("zz"));
	System.out.println("=====starts ends===");
	String str5="Today is Saturday";
	System.out.println(str5.startsWith("Today"));
	System.out.println(str5.endsWith("day"));
	
	System.out.println("====concat======");
	System.out.println(str5.concat("and we have java class"));
	
	System.out.println("======trim======");
	String str6="  it is sunny   ";
	System.out.println("before triming:"+str6);
	System.out.println(str6.trim());
	
	System.out.println("=====index of and charAt====");
	String str7="Tomorrow we will be done with String Manipulation";
	System.out.println(str7.indexOf('e'));
	System.out.println(str7.indexOf('e',11));
	System.out.println(str7.indexOf("we"));
	System.out.println(str7.charAt(10));





}
}
