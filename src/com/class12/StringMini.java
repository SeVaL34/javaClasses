package com.class12;

public class StringMini {
public static void main(String[]s) {
	
	int a=2;
	
	if(a==20) {
		System.out.println("number is "+a);
	}else {
		System.err.println("number was not 20 but is "+a);
	}
	
	
	//create two Strings and initialize them with some value
	//implement the following methods on those strings
	
	//sen.length();
	String name=new String("Seval");
	int name0=name.length();
	System.out.println(name0);
	
	//sen.equals();
	String name1="sevall";
	String name2="seval";
	boolean isEquals=name1.equals(name2);
	System.out.println(isEquals);
	
	//sen.contains();
	String sentence="Hi Seval!!";
	String word="S";
	System.out.println(sentence.contains(word));
	
	//sen.toUpperCase();
	String name3="seval";
	name3=name3.toUpperCase();
	System.out.println(name3);
	
	//sen.toLowerCase();
	String name4="SEval";
	name4=name4.toLowerCase();
	System.out.println(name4);
	
	//sen.equalsIgnoreCase(anotherString);
	String name5="seVaL";
	System.out.println(name5.equalsIgnoreCase(name4));

	
	
	
	
}
}
