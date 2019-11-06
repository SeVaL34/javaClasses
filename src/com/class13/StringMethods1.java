package com.class13;

public class StringMethods1 {
public static void main(String[] args) {
	
	String str="Java is getting interesting";
	
	System.out.println(str.substring(15)); // printout the beginning index 
	System.out.println(str.substring(8,15));

	/*Create a String and print it in reverse order (Sunday → yadnuS).*/
	 String day="Sunday";
     //System.out.println(day.chatAt(5)+" "+day.charAt(4)+""+........);
	 for(int i=day.length()-1 ; i>=0 ; i--)
     System.out.print(day.charAt(i));

     /*Create a String and if the String is not empty perform the following:
	 * if the String has an odd number of characters and has 3 or more characters,
	 *  print the character in the middle of the String.*/

     String str1="hi!";
    
     int middle=str1.length()/2;
      
     if (!str1.isEmpty()) {
    	 if(str1.length()%2!=0 && str1.length()>=3) {
    	 System.out.println(str1.charAt(middle));
    
    	 /*String str = "Eclip";
        int length = str.length();
        if(!str.isEmpty()) {
            if(length%2!=0 && length>3) {
                System.out.println(str.charAt((length/2)));
            }}
      */
     }}





}
}
