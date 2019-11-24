package com.class24;

public class EnglishTeacher extends Teacher{
	
	static void display() {
		System.out.println("He has nice pronunciation");
	}
	
	public static void main(String[] args) {
		
		Teacher teach=new Teacher();
		System.out.println(Teacher.schoolName);
		Teacher teach1=new Teacher();
		teach1.name="Weqas";
		System.out.println(teach1.name);
		Teacher teach2=new Teacher();
		teach2.subject="English Teacher";
		System.out.println(teach2.subject);
		EnglishTeacher.display();
	}	
	}

