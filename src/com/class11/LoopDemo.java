package com.class11;

public class LoopDemo {
public static void main(String[]args) {
	
	//for (int i=0 ; i<5 ; i++) {
		//for (int j=0 ; j<=4 ; j++) {
		//System.out.println("i= "+i+" j= "+j);
		
	
//Create a 2D array or integer type where you will store
//odd and even numbers in 3 rows and 4 columns.
//Develop a program which will identify/print the even numbers only.
int [][] nums=new int[3][4];

int[][] num= { {2,5,7,8} ,
	           {10,11,14,16},
	           {1,3,6,7},
	           {9,12,13,15} 
	         };

for(int a=0 ; a<num.length ; a++ ) {
for (int c=0 ; c<num[a].length ; c++) {
	if (c%2==0) {	
	System.out.print(num[a][c]);
	}	
		//for (int a[]:num) {
			//for (int c:a) {
		
		//System.out.println(c);
		//}
	//}
System.out.println("----------------");		
//Create a 2D array or integer type and store numbers 
//in 3 rows and 3 columns. Print the sum of all numbers.
	
	
	int [][] sums= {{1,2,3,4} , {5,6,7,8} , {9,10,11,12} };
	 for (int i[]:sums) {
		 for (int b:i) {
			 System.out.println(b);
		 }
System.out.println("=============");
	 }
			
//Create a 2D array of integer type with 3 rows and 4 columns
//and print all values of the whole array.
	int [][] arr=new int[3][4];
	
	int [][] array= { {1,2,3,4},
			          {4,3,2,1},
			          {5,6,7,8},
			          {8,7,6,5},
			          {4,5,6,7}
	               };
	for (int s=0 ; s<array.length ; s++) {
	for (int f=0 ; f<array[s].length ; f++) {
		System.out.print(array[s][f]+" ");
	}
	
	                   
	
	}}}}}
	
	
	
	


