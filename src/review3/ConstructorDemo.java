package review3;

public class ConstructorDemo {
public static void main(String[] args) {
	Car car1=new Car();//default constructor
	
	car1.make="Honda";
	car1.color="Red";
	car1.displayInfo();
	
	Car car2=new Car("Toyota");//constructor
	car2.displayInfo();
	car2.color="Grey";
	car2.displayInfo();
}
}
