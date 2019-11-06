package com.class0;

public class Task85 {
	public static void main(String[] args) {

  int[][] b = {
		{1,1,1},
		{1,1,1},
		{1,1,1}
	};
//should be true
	//boolean b[i][j]=true;
boolean flag=true;	
for (int i=0 ; i<b.length ; i++) {
	for (int j=0 ; j<b[i].length ; j++)	{
		 if (b.length!=b[i].length) {
			flag =false;
		break;
			}}
			}
			
	System.out.println(flag);
      	
		
	}}



	


