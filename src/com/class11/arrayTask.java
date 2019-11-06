package com.class11;

public class arrayTask {
public static void main(String[] args) {
	
/*Create an array of cars 
 * and store 6 elements into it.
 * Using 2 different loops print all values from the array.*/

String[] cars= {"Toyota" , "BMW" , "Land Rover" , "Honda" , "MINI" , "Jaguar" };
  
for (String car : cars) {
	System.out.println(car);
}
//Create an array on integers and calculate the sum of all elements in an array.
int sum=0;
int [] num= {2,3,4,5};
for (int a=0 ; a<4 ; a++) {
sum+=num[a];

}
System.out.println(sum);

//Create an array of countries. 
//While retrieving all values from an array print capital for each country.
//(use 2 different loops).

String[] contrs={"Turkey" , "Nigeria" , "Tailand" } ;

for (String cont:contrs) {
	if (cont.equals("Turkey")) {
	System.out.println("Ankara");
    } else if (cont.equals("Nigeria")) {
    System.out.println("Abuja");
    }else if (cont.equals("Tailand")) {
    System.out.println("Bangkok");
    }
}
}}
