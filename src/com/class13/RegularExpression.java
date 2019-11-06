package com.class13;

public class RegularExpression {
public static void main(String[] args) {
	
	//INTERWIEV QUESTIONS
	/*print only text and not numbers
	 */
String str1="12-22-1990"; //12/22/1990
String str="123456erty6789rty";
System.out.println(str.replaceAll("[0-9]","")); //leave only text
System.out.println(str.replaceAll("[a-zA-Z]", "")); //leave only numbers
System.out.println(str1.replace('-','/'));
System.out.println(str1.replaceFirst("-","/"));



//Remove everything except text and numbers
String str2="Hi@#$%How%&$#4567";
System.out.println(str2.replaceAll("[^a-zA-Z0-9]","")); //^ not anlamina geliyor 
System.out.println(str2.replaceAll("[a-zA-Z0-9]","")); // bu cod sadece isarteleri cikaracak
System.out.println(str2.replaceAll("\\w","")); //word disindakileri al 
System.out.println(str2.replace("How",""));


}}
