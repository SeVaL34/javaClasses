package ReviewCalss;

import java.util.Scanner;

public class WhileLoop {
public static void main(String[] args) {

	/* print only even numbers from 1 to 20 */

	for (int a=1 ; a<=20 ; a++) {
	if (a%2==0)
	System.out.println(a);
}

/* how to print numbers from 5 to 25 inclusive 
 * all in 1 line with space in between?
 */
	for (int b=5 ; b<=25 ; b++) {
		System.out.print(b+" ");
	}
	/* Prompt the user to ask the 
	 * name 3 times and print "Hello____" */
Scanner scan=new Scanner(System.in);
System.out.println("what is your name?");
String name=scan.nextLine();
for (int c=0 ; c<=3 ; c++) {
	System.out.println("Hello "+name);
}
Scanner scan1=new Scanner(System.in);

int price;
 do {

	 System.out.println("pay your candy");
	 price=scan1.nextInt();

 
 }while (price!=3); 


System.out.println("enjoy your candy");

}}