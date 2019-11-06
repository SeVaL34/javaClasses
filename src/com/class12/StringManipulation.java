package com.class12;

public class StringManipulation {
public static void main(String[]args) {
	
	//there are two ways to create string objects
	
	//1
	//String Literal
	String name="john";
	System.out.println(name);
	System.out.println(name.length());

	//2
	//creating String with new key word
	String name1=new String("john1;");
	System.out.println(name1);
	
	/* this method returns the length of this string
	 * the length is equal to the number
	 * of 16 bit unicode characters in the string
	 */
     int name1Len=name.length();
     System.out.println("The length of name1Len is= "+name1Len);

     //toLowerCase();
     //this metod converts all of the caharaters in this String to lowers
     String str1="hello world";
     System.out.println("before ::" +str1);
     str1=str1.toLowerCase();
     System.out.println("after ::" +str1);
     
     //.equals();
     //this metod will count everthing such capitalization and content
     String str2="heLLO wORLd";
    
     boolean isEqual=str1.equals(str2);
     System.out.println(isEqual);
     
     //.equalsIgnoreCase();
     //this does not care for capitilization and compare the content only 
     System.out.println(str1.equalsIgnoreCase(str2));
     
     //toUpperCase();
     //this metos converts all of the caharcters in this string to uppercase
     String str3="Mohammad";
     System.out.println("before:: "+str3);
     str3=str3.toUpperCase();
     System.out.println("after:: "+str3);
     
     /* .contains();
 	 * This metod searches the sequence of caharacters in the string
 	 * if the sequences of characters are found
 	 * then it returns true otherwise returns false
 	 */
 	String sentence="It was raining";
 	String sen="raining";
 	System.out.println(sen.contains(sentence));
 	System.out.println(sentence.contains("was"));		 


 	//Accept username, password and confirm password and check following requirements:
 	//Username and Password cannot be  empty, if so→ message=“Username and Password cannot be empty”.
 	//Password should be minimum 8 characters, if less → message=“Password is too short”.
 	//Password cannot contain username if so, → message=“Password cannot contain username”.
 	//Password should match confirmed password, if not  → message=“Passwords do not match”.
 	//Only after all requirements met → message “Your username and password has been created”
 		




}
}
