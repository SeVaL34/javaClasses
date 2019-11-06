package com.class12;

import java.util.Scanner;

public class ScannerTask {

	int [] arr=new int[3];
	Scanner scan=new Scanner(System.in);
	
	for(int i=0 ; i<arr.length ; i++) {
		arr[i]=scan.nextInt();
		System.out.println(arr[i]+" ");
	}


}}
