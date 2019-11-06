package com.class4;

public class NestedIfPractice {

	public static void main(String[] args) {
	
	boolean isFriday=false;
	int day=131;
	
	//if today is friday only day i want to check if it day is 13
if(isFriday) {
	System.out.println("today is friday");
	if(day==13) {
		System.out.println("i will watch movie");
	}else {
		System.out.println("i will watch comedy");
	}
}else {
		System.out.println("today is not friday");
	}
}

}
