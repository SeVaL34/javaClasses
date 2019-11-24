package com.class17;

public class phone {

	//Create a Class “Phone”. Create 3 Objects of it:
	//iPhone, Android, Nokia with specific  attributes and behaviours.
	
	String brand,os,color,model;
	
	void ring() {
		System.out.println("ringing");
	}
	
	void talk() {
		System.out.println("talking");
	}
	
	void text() {
		System.out.println("texting");
	}
	
	
	public static void main(String[] args) {
		 phone phone1=new phone();
		 phone1.brand="IPhone";
		 phone1.os="Android";
		 phone1.model="XO";
		 phone1.color="pink";
		 
		 phone phone2=new phone();
		 phone2.brand="Nokia";
		 phone2.os="Android";
		 phone2.model="3310";
		 phone2.color="blue";
		 
		
		 System.out.println("I have a "+phone1.brand+
				 " "+phone1.os);
		 phone1.talk();
		 System.out.println("I have "+phone2.brand+" "
		 +phone2.os+" "+phone2.color+" "+phone2.model);
		 phone2.text();
	}
	
	
	
}
