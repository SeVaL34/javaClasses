package com.class19;

public class Task {
/* Create a method createEmail().
 *  Based on provided users name, 
 *  lastName and email type, 
 *  your method should return complete email Address.
 *   Example: johnsnow@gmail.com or johnsnow@yahoo.com*
 */
	//String userName,lastName,email;
	
	String emaill(String userName,String lastName,String email) {
	 String emaill=userName+lastName+email;
	 return emaill;
 }
	public static void main(String[] args) {
		//Task ss=new Task();
		//ss.userName="svl";
		//ss.lastName="saygin";
		//ss.email="@gmail";
		
		//System.out.println(ss.userName+ss.lastName+ss.email);
	//}
 Task ss=new Task();
 //String str=ss.emaill("svl","saygin","@gmail");
 System.out.println(ss.emaill("svl","saygin","@gmail").toLowerCase());
 
}
	


}
