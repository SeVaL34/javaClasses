package com.class10;

public class Array {
public static void main(String[] args) {


	int a;
	a=10;
	
	int a1=10;
	//1 way
	int [] b; //declare an array --> preferred way (also we can write int b[]
	
	b=new int[4]; //initialize an array
	
	//2 way --> all in 1 line (declaration&initialization)
	int[] array=new int[4];
	array[0]=10;
	array[1]=20;
	array[2]=30;
	array[3]=40;
//access value from an array
System.out.println(array[2]);

//lets create an array that will store classes

String[] classes=new String[4];
classes[0]="Java";
classes[1]="SDLC";
classes[2]="Manuel Testing";
classes[3]="GIT";
// today we have Java class
System.out.println("Today we have "+classes[0]+" class");

int [] nums=new int[3];
nums[0]=1;
nums[1]=2;
nums[2]=3;
//how can change 1 to 100
nums[0]=100;
System.out.println(nums[0]); //100 (cunku iki tame ayni variable varsa buyuk olani alir)
System.out.println(nums[0]+nums[2]);  //100+3 

String [] names=new String[3];
names[0]="seval";
names[1]="fatma";
names[2]="nuray";
//names[3]="sasha"; // yazinca sorun gostermez ama cikti alamazsin cunku 3 tane tanimladin
//4.yu cikti alamazsin
System.out.println(names[2]);

//
int [] numbers=new int[4];// 4 element yazdin 
numbers[1]=100;//iki tane value yazdin 
numbers[3]=200;
System.out.println(numbers[0]); // 0 cikar 
//numbers[0]=0;
//numbers[1]=100;
//numbers[2]=0;
//numbers[3]=200;
 
//we are putting less elements inside-->compiler will give default values

// create and array to store 5 double valuses print in all one line 
double [] num=new double [5];
num [0]=1.2;
num [1]=1.3;
num [2]=1.4;
num [3]=1.5;
num [4]=1.6;
for (int f=0 ; f<num.length ; f++) {
	System.out.print(num[f]+" ");
}




//		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };


}}
