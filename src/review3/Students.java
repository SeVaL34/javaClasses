package review3;

public class Students {

	/* Write a java program of Class Students that takes students
	 * name and 3 subject grades. 
	 * Inside your class also have a method to Calculate Average Grade. 
	 * Test Student class for 5 different students with different marks. 
	 * Your program should print an average mark of each students name.
	 */
	
	String name;
	int grade;
	
	Students(String name,int a,int b,int c) {
		int sum = (a+b+c)/3;
		System.out.println(name+" "+a+" "+b+" "+c+" Avarage is "+sum);
	}
	public static void main(String[] args) {
		
		Students obj=new Students("Fatma", 90, 80, 70);
		Students obj1=new Students("Nuray", 90, 100, 70);
		Students obj2=new Students("Sasha", 100, 100, 99);
	}
}
