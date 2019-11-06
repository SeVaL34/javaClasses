package com.class5;

public class NotOperator {
public static void main(String[] args) {

boolean b1=!true;
boolean b2=!false;

System.out.println(b1);
System.out.println(b2);

boolean traffic=true;

if (!traffic) {//using ! we are reverting condition 
	System.out.println("hello");
}else {
	System.out.println("bye");
}
boolean isRain=true;
if(!isRain) {
	System.out.println("take umbrella");
}else {
	System.out.println("dont take");
}

//let's compare 2 numbers using NOT operator
int num1=10;
int num2=10;

if(num1==num2) {
	System.out.println("numbers are equals");
}else {
	System.out.println("numbers are not equals");
}

if(!(num1==num2)) {
	System.out.println("numbers are NOT equals");
}else {
	System.out.println("numbers are equals");
}
// if name is not Mary or Anna  then you are not my sister
String name="Mary";
String name2="Anna";
// true OR false--> true add NOT-->false
if (!(name.equals("Mary") && name.equals("Anna"))){
	System.out.println("you are not my sister");
}else {
	System.out.println("you are my sister");
}






}
}