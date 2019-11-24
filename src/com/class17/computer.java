package com.class17;

public class computer {

	String brand,name,monitor,mouse;
	boolean keyboard;
	int screen,memory,size,ram;
	
	//define behavior ,actions
	void playGames() { //method header
		//method body
		System.out.println("I can play on my "+name);
	}
    void javaCoding() {
    	System.out.println("I can do Java coding on my "+name);
    }
    void watchMovie() {
    	System.out.println("I can watch movie on my "+name);
    }
    //using main mathod for code execution
    public static void main(String[] args) {
		computer compt1=new computer();
		compt1.brand="Apple";
		compt1.name="MacBook Pro";
		compt1.memory=250;
		
		System.out.println("I have "+compt1.brand+" "+compt1.name);
		compt1.javaCoding();
		
		computer computer2=new computer();
		computer2.brand="Dell";
		computer2.name="420";
		computer2.memory=125;
		
		computer2.javaCoding();
		computer2.playGames();
		computer2.watchMovie();
		
		
	
    
    
    
    }
}
