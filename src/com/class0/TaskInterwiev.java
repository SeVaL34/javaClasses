package com.class0;

public class TaskInterwiev {
public static void main(String[] args) {
	
	/* 1) Write a program to swap 2 numbers without a temporary variable?
	 * Swap  2 strings without a temporary variable? */
	
	int a1=10;
	int b1=20;
	
	a1=a1+b1;//30
	
	b1=a1-b1;//10
	a1=a1-b1;//20
	
	String sa="Life";
	String sa1="Love";
	
	int c1=sa.length();
	int d1=sa1.length();
	
	sa=sa+sa1;
	sa1=sa.substring(0,sa.length()-sa1.length());
	sa=sa.substring(sa1.length());
	System.out.println(sa+""+sa1);
	
	//2nd way
	//String a = "Love";
	//String b = "You";
	//System.out.println("Before swap: " + a + " " + b);
	//a = a + b; // love you
	//b = a.substring(0, a.length() - b.length());
	//a = a.substring(b.length());
	//System.out.println("After : " + a + " " + b);

  /* 2) Write a java program to find the second largest number in the array?
   * Maximum and minimum number in the array?
   */
	
	   int[] array= {4,2,3,7,5,8};
       int max=0;
      for (int i = 1; i < array.length; i++){
            if(array[i]>max){
              max=array[i];
            }
          }
      System.out.println(max);
      int[] array1= {4,2,3,7,5,8};
      int min=array1[0];
      for (int i = 0 ; i <array1.length ; i++){
          if(array1[i]<min){
            min=array1[i];
          }
        }
      System.out.println(min);
      System.out.println("**************");
      int[] arr= {4,2,3,7,5,8};
      int secondMax=0;
      int max1=0;
      for (int i = 0; i < arr.length; i++) {           
           if (arr[i] > max1) {
               secondMax = max1;
               max1 = arr[i];
           } else if (arr[i] > secondMax) {
               secondMax = arr[i];
           }
       }
      System.out.println(secondMax);
      
      /* 3) Find out how many alpha characters present in a string? */
      
      String s="Ab@$^*12457He";
      System.out.println(s.replaceAll("[0-9]",""));
      
      /* 4)How to find out the part of the string from a string?
      * What is substring?Find number of words in string?*/
      
      String text="I am from Turkey ve";
      //word count
      int counter=1;
      for(int i=0; i<text.length(); i++)
      {
          if(text.charAt(i)==' ' && text.charAt(i+1)!=' ')
              counter++;
      }
      System.out.println("Total number of words in string are: "+ (counter));
      //since last word does not contain and character after that
      
      /* 5) Write a java program to reverse String? Reverse a string word by word? */
      
      // reverse moves backword
      
      String str="Java Class";
      
     for(int i=str.length()-1 ; i>=0 ; i--) {
          
          System.out.print(str.charAt(i));
      }
          System.out.println();
      
      
      /* 6) Write a Java Program to find whether a String is palindrome or not? */
          String original="level";
          
          String reverse="";
          
          int size=original.length();
          
              for(int i=size-1; i>=0 ;i--) {
                  
              reverse=reverse+original.charAt(i);
              }
              if(original.equals(reverse)) {
                  
                  System.out.println(reverse+ " is a palindrome string.");
                  
              }else {
                  
                  System.out.println(reverse+ " is not a palindrome string.");
              }
              
         /* 7) Write a java program to check whether a given number is prime or not? */
              int num =13;
              boolean prime = true;
              for(int i = 2; i <= num/2; ++i){
                  if(num % i == 0){
                      prime = false;
                      break;
                  }
              }
              if (prime)
                  System.out.println(num + " is a prime numbers.");
              else
                  System.out.println(num + " is not a prime numbers.");   
         
         /* 8) Write a Java Program to print first 10 numbers of Fibonacci series. */
          
          //0 1 1 2 3 5 8 13 21 34 55
               
               int a=0;
               int b=1;
               int c;
               for(int i=0; i<10; i++) {
                   System.out.print(a+" ");
                   c=a+b;
                   a=b;
                   b=c;
                   //System.out.print(a+" ");
           }




}
}
