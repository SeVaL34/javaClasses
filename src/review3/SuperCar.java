package review3;

public class SuperCar {

	///Create a SuperCar class.
	//It should have at least 10 variables, like : make, brand, year, manufacture, axle, tireNumber,,,
	//Create at least 4 Constructors with different number of parameters.
	
	String make;
	String brand;
	String manufacture;
	String color;
	int doorNumber;
	int horsePower;
	int year;
	int tireNumber;
	int mileage;
	
	public SuperCar(String make,String brand,String manufacture,String color,int doorNumber,int horsePower
			,int year,int tireNumber,int mileage){
		this.make=make;
		this.brand=brand;
		this.manufacture=manufacture;
		this.color=color;
		this.doorNumber=doorNumber;
		this.horsePower=horsePower;
		this.year=year;
		this.tireNumber=tireNumber;
		this.mileage=mileage;
	}
	
	public void disPlay() {
		System.out.println(make+ " "+brand+" "+manufacture+" "+color+" "+doorNumber+" "+horsePower
				+" "+year+" "+tireNumber+" "+mileage);
	}
	
	public static void main(String[] args) {
		
		SuperCar car1=new SuperCar("Toyota","RAV4","Japonya","Grey",4,203,2019,4,8000);
		SuperCar car2=new SuperCar("Land Rover","SUV","India","White",4,340,2019,4,5000);
		SuperCar car3=new SuperCar("MiniCooper","Countryman","Germany","Red",2,221,2019,4,2000);
		SuperCar car4=new SuperCar("BMW","i8","Germany","Black",2,369,2019,4,1000);
		car1.disPlay();
		car2.disPlay();
		car3.disPlay();
		car4.disPlay();
	}
	
}
