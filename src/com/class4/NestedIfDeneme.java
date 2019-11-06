package com.class4;

public class NestedIfDeneme {
public static void main(String[] args) {
	
	boolean isDisplayed=true;
	String buttonText="Sign In";
	
	if(isDisplayed) {
		System.out.println("button is diplayed");
		
		if(buttonText.contentEquals("Sign In")) {
	    System.out.println("test case pass");
		}else {
		System.out.println("wrong text");
	}}else
	System.out.println("button is not displaed");
	
	
}
}
