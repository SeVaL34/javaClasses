package com.class24;

public class PianoTeacher extends Teacher {

static void display() {
	System.out.println("She can plays piano very well");
}
	
public static void main(String[] args) {
	
	Teacher teach=new Teacher();
	System.out.println(Teacher.schoolName);
	Teacher teach1=new Teacher();
	teach1.name="Asel";
	System.out.println(teach1.name);
	Teacher teach2=new Teacher();
	teach2.subject="Piano Teacher";
	System.out.println(teach2.subject);
	PianoTeacher.display();
}	
}
