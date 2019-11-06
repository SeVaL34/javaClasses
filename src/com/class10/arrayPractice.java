package com.class10;

import java.util.Scanner;

public class arrayPractice {
public static void main(String[] args) {


       String[] animals= {"cat","dog","cow","snake","elephant"};
        int size=animals.length;
        for (int i=0 ; i<animals.length ; i++) {
  System.out.println(animals[i]+" ");
  }
// create an array to store 5 double values print all in 1 line 

double [] array= {1.2,1.3,1.4,1.5,1.6};
double num=array.length;
for (int a=0 ; a<num-1 ; a++) {
System.out.print(array[a]+" ");

//0	 1	   2    3    4    5
	char[] grades= {'A', 'B', 'C', 'D', 'E', 'F'};
	
	int b=2;
	System.out.println(grades[4]);
	System.out.println(grades[b]);
	
	a+=2;//2+2
	System.out.println(grades[b]);
	a--;//3
	System.out.println(grades[b]);
	
	System.out.println("--------------------");

//	System.out.println(grades[0]);
//	System.out.println(grades[1]);
//	System.out.println(grades[2]);
//	System.out.println(grades[3]);
	
	for(int i=0; i<grades.length; i++) {
		System.out.println(grades[i]);
	}
	System.out.println("--------------------");
	
	// i want to print all values from an array
	//when value is Dog--> i love dogs
	String[] animal= {"cat","dog","cow","snake","elephant"};
   
	for (int i=0 ; i<animal.length ; i++) {
	if (animals[i].equals("Dog")) {
		System.out.println("i love dogs");
	}else {
		System.out.println(animal[i]);
	}

	for (int c=0; c<animals.length; c++) {
        if(c==1) {//or if(animals[i].equals("Dog))
            System.out.println("I love dogs");
        }else {
        System.out.println(animals [c]);
        }
	

	}
	
	}}}}


