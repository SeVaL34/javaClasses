package com.class0;

import java.util.Scanner;

public class Deneme3 {
public static void main(String[] args) {
	for (int i = 1; i <= 5; i++) {
        for (int j = 5 - i; j >= 1; j--) {
            System.out.print(" ");
        }
        for (int m = 1; m <= i; m++) {
            System.out.print("*");
        }
        System.out.println(" ");
    }
    for(int k=1; k<=5; k++) {
        for(int l=1; l<=k; l++) {
            System.out.print("*");
        }
        System.out.println();
    }
 Scanner scan = new Scanner (System.in);
    
    int[] num = new int[5];
    for (int a=0; a<num.length; a++) {
        num[a] = scan.nextInt();
        for(int b=5; b<=num[a]; b--) {
            System.out.println(num[b]);
        
        }

    }
   
}
}
