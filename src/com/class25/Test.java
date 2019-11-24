package com.class25;

public class Test {

	public static void main(String[] args) {
		System.out.println("Creating a object");
		Employee emp=new Employee();
		emp.salary=70000;
		Employee.companyName="Syntax";
		emp.work();
		emp.getPaid();
		
		System.out.println("Creating an object");
		ScrumTeam sm=new ScrumTeam();
		sm.salary=90000;
		sm.work();
		sm.getPaid();
		sm.artifacts="Product Backlog,Burndown Chart,Spring Backlog";
		sm.ceremonies="Sprint Demo,Planning,Retro,Daily Meeting";
		
		Developer dev=new Developer();
		dev.salary=130000;
		dev.work();
		dev.getPaid();
		dev.code();
		dev.artifacts="Sprint Backlog";
		dev.ceremonies="Sprint Demo,Planning";
		dev.attendScrumMeetings();
		
	}
}
