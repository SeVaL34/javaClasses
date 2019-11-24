package com.class0;

public class Students {

	/* Create a Class called Students
       ● Create three variables studentName ,
        studentID and numberOfStudents
       ● Create three objects of the Students Class
       ● Set the value for studentName ,
        studentID and increment the numberOfStudents for each object
       ● Print out total number of students
	 */
	static int numberOfStudents;
	String studentName;
	int studentID; 
	
	
	public static void main(String[] args) {
		Students stu=new Students();
		
		stu.studentName="Seval";
		stu.studentID=1;
		Students.numberOfStudents=4;
		
		stu.studentName="Sasha";
		stu.studentID=2;
		Students.numberOfStudents=6;
		
		stu.studentName="Nuray";
		stu.studentID=3;
		Students.numberOfStudents=8;
		
		System.out.println("total number of student "+Students.numberOfStudents);
		
	}
}
