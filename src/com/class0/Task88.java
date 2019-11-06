package com.class0;

public class Task88 {
	public static void main(String[] args)
	{
		int[][] a = {
			{-5,-2,-3,7},
			{1,-5,-2, 2},
			{1,-2, 3,-4}
		};
		
		
//   should print -9
	int j=1;
	int sum=0;
	for (int i=0 ; i<a.length ; i++) {
		sum+=a[i][j];
	}
	System.out.println(sum);
	
	}

}
