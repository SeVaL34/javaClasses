package com.class12;

public class StringMiniDemo {
public static void main(String[] args) {
	
	//this metod tests if a string starts with the specified prefix beginning
	String str2="It is very hot in the class";
	System.out.println("is this string starts with "+str2.startsWith("It"));
	
    System.out.println("Is this string starts with " + str2.startsWith("very", 6));
System.out.println("_______________________");
    //This method tests if this string ends with the specified suffix
    System.out.println("Is this string starts with = " + str2.endsWith("class"));

    String s1=" ";
    System.out.println("Is this string empty "+s1.isEmpty());
    
    String s2=" ";
    System.out.println("Is this string empty "+s2.isEmpty());
    
  
    
    
    String sentence="Each day has a promise to brighten up the day,\n but first you must allow";
    
    System.out.print(sentence);

 //this metod appends one String to the end of another. 
   //the method returns a String with the value of the 
   //String passed in to the method appneded to the end of the String used to invoke this method
    
    
    String str3="hello";
    String str4="world";
    String str5="people";
 System.out.println(str3+str4+str5);
 System.out.println(str3.concat(str4).concat(str5)); //worldhellopeople / helloworldpeople

 System.out.println("*************************");
 
 /*this metod returns a copy of the string with leading and trailing whitespace omitted
  */
 
 String str6=" how are you? ";
 System.out.println(str6.trim());
 
 //this metod returns the character located t the String's specified index. the String indexes start from zero.
String str7="we might be done early today";
System.out.println(str7.charAt(4));//i

//this metod returns the index within this string of the first occurence of the specified character or -1
//if the charater does not occur 
String str8="we might mnot be done early";
System.out.println(str8.indexOf('m')); //3
System.out.println(str8.indexOf('m',5));//3 m den baslayarak say,aya baslar
// eger bulmak istedigin harf orada degilse printout -1 cikar 




}
}
