package com.class7;

public class WhileLoop {
public static void main(String[] args) {

int time=8;

while (time<12) { //if condition is true
System.out.println("good morning");//code executes infinitly
time++;
}

//i want to print GM 5 times
int i=1;
 while (i<=5) {
System.out.println("good afternoon");
i++;
 } 
 System.out.println("outside of while loop");
}

}
