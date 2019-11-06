package com.class11;

public class TwoDimention {
public static void main(String[] args) {
	
//Declare 2D Array
	int[][] array=new int[3][5];
	
	 //1st row
	array[0][0]=44;
	array[0][1]=80;
	array[0][2]=33;
	array[0][3]=20;
	
	//2nd row
	array[1][0]=10;
	array[1][1]=5;
	array[1][2]=7;
	array[1][3]=8;
	
	//3rd row
	array[2][0]=10;
	array[2][1]=9;
	array[2][2]=70;
	array[2][3]=6;
	System.out.println(array[1][3]); //8
	
//task: create 2D array of String with 2 and 3 columns
	//1st row
	
	String [][] name=new String [2][3];	
	
	//1st row
		name[0][0]="Live";
		name[0][1]="Laught";
		name[0][2]="Love";
		
		name[1][0]="Live";
		name[1][1]="Laught";
		name[1][2]="Love";
		
		System.out.println(name[1][1]);//laught

int [][]numbers= { {8,6,5,4,5} , {1,2,3,4,6} , {9,8,7,6,5} };
System.out.println("the value in index 1 and 4 is" +numbers[1][3]);//1-4

//to identify the numbers of rows
System.out.println("the numbers of rows are:" + numbers[1].length);//5
//to identify the numbers of columns/elements in that row
System.out.println("the numbers of columns:" + numbers[2].length);//5

for (int i=0 ; i<numbers.length ; i++) {
	for (int j=0 ; j<numbers[i].length ; j++) {
		System.out.print(numbers[i][j]+" ");
	}
System.out.println();
}


}
}
