package com.class18;

import java.util.Scanner;

public class Methods {
	 public static void main(String[] args) {
	        
	        String str = "Hello";
	        str = str.replace("Hello", "Hi");
	        System.out.println(str);
	        
	        Scanner scan = new Scanner (System.in);
	        String scannerString = scan.nextLine();
	        System.out.println(scannerString);
	        
	        Methods obj = new Methods();
	        obj.myMethod();
	    }
	    
	    
	    // WE CANNOT CREATE A METHOD INSIDE ANOTHER METHOD !
	    
	    void myMethod() //method header
	    { //method body
	        System.out.println("This is user defined method that I created");
	    }
	    
}
