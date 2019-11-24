package com.class17;

public class ObjectOfComputer {
public static void main(String[] args) {
	
	computer comp=new computer();
	comp.brand="Apple";
	comp.name="MacBook Pro";
	comp.keyboard=true;
	comp.memory=250;
	comp.screen=15;

System.out.println("I have "+comp.brand+" "+comp.name);

}
}
