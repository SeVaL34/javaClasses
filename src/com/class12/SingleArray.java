package com.class12;
public class SingleArray {
public static void main(String[] args) {
	
	int[] array1=new int[4];
	array1[0]=12;
	array1[1]=15;
	array1[2]=14;
	array1[3]=18;
	
	
	int [] array2= {2,5,4,7};
	for (int i:array2) {
   	 System.out.println(i);
	
	
	
	//System.out.println(array1[1]);
	int num1=0;
	for (int s = 0; s < 4; s++) {
		num1=num1+array1[s];
		System.out.println("the number sum is" +array1[s]);//toplamini cikartir interviev sorususudr
	}
System.out.println("===========");
     for (int s:array1) {
    	 System.out.println(s);
     }
}}}
