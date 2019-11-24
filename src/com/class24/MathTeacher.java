package com.class24;

public class MathTeacher extends Teacher {
	
	static void display() {
		System.out.println("He can solve the questions quickly");
	}
 
	public static void main(String[] args) {
	
		Teacher teach=new Teacher();
		System.out.println(Teacher.schoolName);
		Teacher teach1=new Teacher();
		teach1.name="Sohil";
		System.out.println(teach1.name);
		Teacher teach2=new Teacher();
		teach2.subject="Math Teacher";
		System.out.println(teach2.subject);
		MathTeacher.display();
	}		
}

