package com.class12;

import java.util.Scanner;

public class ScannerTask {

	
	Scanner scan=new Scanner(System.in);
	int [] arr=new int[3];
	for(int i=0 ; i<arr.length ; i++) {
		arr[i]=scan.nextInt();
		System.out.println(arr[i]+" ");
	}


}}
