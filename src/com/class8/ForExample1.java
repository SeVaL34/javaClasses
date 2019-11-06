package com.class8;

public class ForExample1 {
	public static void main(String[] args) {

// print numbers from 1 to 100 in 1 line with space

		for (int i = 0; i <= 100; i++) {
			System.out.print(i);
		}
//print numbers from 100 to 1 
		for (int i = 100; i >= 1; i--) {
			System.out.println(i);
		}
// Print even numbers from 20 to 1 (2 ways)
		for (int i = 20; i > 1; i -= 2) {
			System.out.println(i);

		}
		int i = 20;
		while (i > 1) {
			System.out.println(i);
			i -= 2;
		}
//print odd numbers from 20 to 50 {2 ways}	
		for (int i1 = 20; i1 <= 50; i1++) {
		if (i1 % 2 != 0) {
				System.out.println(i1);
			
		}
int sum=0;
for (int a=1 ; a<=5 ; a++) {
	sum=sum+a;
System.out.print(sum+"+");// sonuc 1;3;6;19;15
}
System.out.println(sum);// sonuc 15		
}

	int sumAll=0;
	 for (int b=0; b<=20; b+=5) {
		sumAll=sumAll+b; 
	 }
	System.out.println(sumAll);	
		
	//what is the output	
	int total=2;
	
	for(int y=1 ; y<=3 ; y++) {
		total=total*y; //2=2*1; 4=2*2; 12=4*3
	}
	System.out.println(total);
	}}		
//0+0=0+5=5+10=15+15=30+20=50
