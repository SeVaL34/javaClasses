package com.class8;

public class BreakAndContinue {
	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			if (i == 4) {
				break;//sayilari 4 e kadar print eder gerisini cikarmaz 
			}
			System.out.println(i);
		}
System.out.println("i am outside");
	
//continue - it will skip Current iteration 
	for (int i = 0; i < 10; i++) {
		if (i == 2) {
			continue;// 2 yi cikarmaz 1,3,4,....
		}
		System.out.println(i);
	}
System.out.println("i am outside");
// if (i==3 || i==4) --> 3 ve 4 rakamlarini cikartmaz. 

	
// iwant to print nums from 1 to 20 except 5,6,7
    for (int a=1 ; a<=20 ; a++) {
	     if (a==5 || a==6 || a==7) {//--> if(a>=5 && a<7=)
         continue;
	}
System.out.println(a);


}}}
   





