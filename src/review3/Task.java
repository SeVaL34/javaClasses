package review3;

public class Task {

	/* Write a program that will have a constructor:
	 * one with parameters and second without
	 * any parameters. Create a separate 
	 * Test class where you will execute both of
	 * the constructors.
	 * 
	 */
	String name;
	
	Task(){
		
	}
	Task(String name){
		System.out.println(name);
	}
	public static void main(String[] args) {
		
		Task obj=new Task("Seval");
		
		
		
	}
	
}
