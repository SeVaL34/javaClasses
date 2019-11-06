package com.class4;

public class NestedIfMore {
public static void main(String[]args) {
	
	/*check age, if age is less than 16-->you are too young to drive
	 * otherwise-->you are eligible to drive 
	 * & we will check f you are older than 18-->
	 * you can get driver license and if not you can get driver permit 
	 */
	
//	int age=55;
//	if (age<16) {
//		System.out.println("you are too young to drive");
//	}else {
//		System.out.println("you are eligible to drive");
//	
//	if (age>=18) {
//		System.out.println("you can drive alone");
//	}else {
//		System.out.println("you need your parents to drive");
//	}
//	}
//	System.out.println("________________");
 /*we need to check if student completed the quiz
  * if yes-->good job, if not--> not good
  * if they completed we will check score:
  * if more than 90-->you got an A
  * if more than 80-->got a B
  * anything below--> you should study more
  */

//boolean quiz=false;
//int score=89;
//if (quiz) {
//System.out.println("good job");
//
//if (score>=90) {
//System.out.println("you got an A");
//}else if(score>80) {
//System.out.println("you got a B");
//}else {
//System.out.println("you study");
//}
//}else {
//	System.out.println("not good");
//}

boolean diploma=true;
double gpa=3.2;
//boolean gpaValidation=gpa>3.5;


	if(diploma) {
		System.out.println("congrat");
		
	
			if(gpa<3.5) {
					System.out.println("get a degree");
					}
			else {
					System.out.println("you are eligible to scholarship");
					}
}
 	else {
	System.out.println("you should have studied harder");
	}

 	
 	
//double mort=5.5;
//if (mort>4.5) {
//	System.out.println("not buy");
//}else if(mort<4.5) {
//	System.out.println("loan");
//}else {
//System.out.println("will pay cash");
//
//}



}}
