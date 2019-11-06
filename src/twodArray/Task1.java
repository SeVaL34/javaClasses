package twodArray;

public class Task1 {
public static void main(String[] args) {
	
	
	int [][] sums= {{1,2,3,4} , {5,6,7,8} , {9,10,11,12} };
	 for (int j[]:sums) {
		 for (int b:j) {
			 System.out.println(b);
		 }
//Create a 2D array where you will store the following 
//values: Mr, Mrs, Ms, Miss and  Smith, Jordan, Jackson, Obama.
//After storing values print the following:
//Mrs Smith, Mr Obama, Ms Jackson, Miss Jordan.	
		 
		
	System.out.println("===================");
	
	String[][] names={ {"Mr", "Mrs", "Ms", "Miss"} , 
			           {"Smith", "Jordan", "Jackson", "Obama"} 
			        };
	//1st way 
	for (int a=0 ; a<names[0].length ; a++) {
	System.out.println(names[0][a]+ " " + names[1][a]);
		
	 
	//2nd way
	for (int c=0 ; c<4 ; c++) {
		 for (int b=0 ; b<2 ; b++) {
			 System.out.print(names[b][c]+" ");
		 }
	 System.out.println();
	 }}}}}
	
		
		 
//Create a 2D array that first row will contain 4 names 
//and second row will contain grades. 

		
		
		
		
		
//Then you program should print name of the students 
//that has as an A and B grade

	 
			


