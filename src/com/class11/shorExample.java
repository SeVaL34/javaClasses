package com.class11;

import java.util.Arrays;

public class shorExample {
public static void main(String[]args) {
	
	
	int[] numbers= {123,34,15,66,99};
	for(int i:numbers) {
		System.out.println(i+" ");
	}
	System.out.println();
	
	Arrays.sort(numbers);
	for (int i:numbers) {
		System.out.println(i);
	}
	}
}
