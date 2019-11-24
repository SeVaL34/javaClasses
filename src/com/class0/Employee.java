package com.class0;

public class Employee {
	
	/* CreateaClasscalledEmployee:
     ● Create three variables eID , salary
       and set the CEO to “Sumair”
     ● Create two objects of the class
       Employee
     ● Set the value of eID, salary for each of
       the objects
     ● Print out the eID , salary and CEO for
       each of the objects  */
	
	static String CEO; 
	int eID ,salary ;
	

	//void disPlay(String Employee) {
	//System.out.println("Arthur's CEO is "+obj.CEO+" his eID is "+obj.eID+" his salary is "+obj.salary);
		
	
	public static void main(String[] args) {
	
	Employee obj=new Employee();
	obj.CEO="Sumair";
	obj.eID=12345;
	obj.salary=500000;
	
	Employee obj1=new Employee();
	obj1.eID=123456;
	obj1.salary=450000;
	
	System.out.println("Arthur's CEO is "+obj.CEO+" his eID is "+obj.eID+" his salary is "+obj.salary);
	System.out.println("Halime's CEO is "+obj.CEO+" his eID is "+obj1.eID+" his salary is "+obj1.salary);




}}

