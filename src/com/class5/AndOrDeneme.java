package com.class5;

import java.util.Scanner;

public class AndOrDeneme {
public static void main(String[] args) {
 Scanner scan=new Scanner(System.in);
 System.out.println("pls enter your height");
  int he=scan.nextInt();
  
  if (he<5) {
     System.out.println("you are short");
     }else if (he==5 && he==6) {
     System.out.println("you are medium");
     }else if (he>6) {
     System.out.println("you are tall");
  } else {
     System.out.println("no result");

}}}
