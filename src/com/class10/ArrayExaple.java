package com.class10;

public class ArrayExaple {
public static void main(String[] args) {

/*Create an array of chars and store grades into 
 * it: A,B,C,D,E,F. Then print a grade B 
 * (use 2 different ways of creating an array).*/

char[] store=new char[6];

store[0]='A';
store[1]='B';
store[2]='C';
store[3]='D';
store[4]='E';
store[5]='F';

 System.out.println(store[1]);


 char[] array= {'A','B','C','D','E','F'};
 System.out.println(array[1]);

/*Create an array of names and store all names of your group.
 *  Then print your name from that array. 
 *  (use 2 different ways of creating an array).*/

String[] name=new String[6];

name[0]="Omer";
name[1]="Mehmet";
name[2]="F.T";
name[3]="Ahmet";
name[4]="Fatma";
name[5]="Seval";

System.out.println(name[5]);

String [] array1= {"Omer","Mehmet","F.T","Ahmet","Fatma","Seval"};
System.out.println(array1[5]);

//Create an array of words: Java, Saturday, day, coding, is.
//Print the following sentence using element of array: 
//“Saturday is Java coding Day”. 

String[] classes=new String[5];
classes[0]="Java";
classes[1]="Saturday";
classes[2]="day";
classes[3]="coding";
classes[4]="is";
System.out.println(classes[1]+" "+classes[4]+" "+classes[0]+" "+classes[3]+" "+classes[2]);



}}
