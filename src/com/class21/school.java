package com.class21;
import com.class21.*;
public class school {

	public static void main(String[] args) {
		Student student1=new Student();
		//assigning instance variables
		student1.studentName="Eric";
		student1.GPA=3.95;
		student1.school="Syntax";
		
		Student student2=new Student();
		student2.studentName="Jaime";
		student2.GPA=3.90;
		student2.school="Syntax";
	
		int hours=3;
		hours=4; //herzaman son olani alir
		student1.displayInfo();
		student1.study(hours);
		
		student2.displayInfo();
	}
}
