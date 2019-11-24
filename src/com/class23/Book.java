package com.class23;


public class Book {

	/* Write program as a Book class   that will have 2 Constructors. 
	 * While creating an object make sure:
       Instance variables are being initialized
       Both Constructors are being executed
	 */
	String name;
	String author;
	
	Book(){
		//System.out.println(name+" "+author);
	}
	Book(String name,String author){
		this.name=name;
		this.author=author;
		System.out.println(name+" "+author);
	}
    
	public static void main(String[] args) {
	Book obj=new Book("Harry Potter","J. K. Rowling");
	
}
}
