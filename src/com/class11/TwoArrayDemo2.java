package com.class11;

public class TwoArrayDemo2 {
public static void main(String[]args) {
	
	String[][] names= { {"kaan" , "ali" , "ayse" , "emine" },
	                    {"fatma" , "nuray" , "sasha" , "nurgul"},
	                    {"oya" , "lale" , "serkan" , "seda"}
	                  };

	//int length=names.length;
//System.out.println(length);

//int lengthOfCols=names[1].length;
//System.out.println(lengthOfCols);

for (String getArrays[]:names) {
	
	for (String getName: getArrays) {
		
		System.out.print(getName+" ");
	}
System.out.println();
}

//Create a 2D array or integer type where you will store
//odd and even numbers in 3 rows and 4 columns. 
//Develop a program which will identify/print the even numbers only.

int[][] nums =new int[3][4];

int[][] num= { {2,5,7,8} ,
		     {10,11,14,16},
		     {1,3,6,7},
		     {9,12,13,15} };

for (int i=0 ; i<num.length ; i++) {
    for(int j=0 ; j<num[i].length ; j++) { 
	  if (j%2==0)	{
    	  System.out.print(num[i][j]+" ");
      }else {
    	  System.out.print(num[i][j]+" ");
      }

    }}}}








//Create a 2D array or integer type and store numbers in 3 rows and 3 columns. Print the sum of all numbers.


