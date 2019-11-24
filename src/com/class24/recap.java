package com.class24;

import com.class0.Employee;

public class recap extends Employee{

	public String capital,name;
	
	recap(){
		
	}
	recap(String countryName,String countryCapital){
		name=countryName;
		capital=countryCapital;
	}
	public void display() {
		System.out.println(name+" "+capital);
	}
	public static void main(String[] args) {
		recap country1=new recap("Usa","Washington dc");
		recap country2=new recap("Turkey","Ankara");
		recap country3=new recap("Kazakhstan","Astana");
		recap country4=new recap();
		
		
		country1.display();
		country2.display();
		country3.display();
		country4.display();
		
	}
	
}
