package com.class11;

import java.util.Arrays;

public class ArrayManipulation {
public static void main(String[] args) {
	
	String[] actualNames= {"john" , "Smith" , "Alex" ,"Tanaz"};
	Arrays.sort(actualNames);
	String[] expectedNames= { "Smith" , "John" , "Alex" , "Tanaz"};
	
	//to sort the elements of an Array
	Arrays.sort(expectedNames);
	
	System.out.println(Arrays.toString(actualNames));
	
	String actual=Arrays.toString(actualNames);
	String expected=Arrays.toString(expectedNames);
	
	System.out.println(actual.equals(expected));
	
	
	String firstname="zom";
	String firstname2="ali";
	
	String firstname3="ali";
	String firstname4="zom";


String actl=firstname+firstname2;
String expt=firstname3+firstname4;
System.out.println(actl);
System.out.println(expt);

}
}
