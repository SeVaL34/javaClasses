package com.class21;
import com.class21.*;
public class Forest {
   

	//Create four classes: Forest, Wolf, Fox, Bear
    //Class wolf has: color, age, numberOfWolves
    //Class fox has: color, speed, numberOfFoxes
    //Class bear has: type, weight, numberOfBears
    
    //Forest has main method
    //Create different objects/instances of different classes
    //At the end, print the total for each animal.
	
	public static void main(String[] args) {
		
		Wolf wolf1=new Wolf();
		wolf1.color="grey";
		wolf1.age=2;
		Wolf.numberOfWolves++;
		
		
		Wolf wolf2=new Wolf();
		wolf2.color="white";
		wolf2.age=1;
		Wolf.numberOfWolves++;
		
				
		Wolf wolf3=new Wolf();
		wolf3.color="black";
		wolf3.age=3;
		Wolf.numberOfWolves++;
		System.out.println("Total number of wolf : " +Wolf.numberOfWolves);
		System.out.println("Frist wolf is "+wolf1.color+" and age is "+wolf1.age);
		System.out.println("Second wolf is "+wolf2.color+" and age is "+wolf2.age);
		System.out.println("Third wolf is "+wolf3.color+" and age is "+wolf3.age);
		
		Fox fox1=new Fox();
		fox1.color="grey";
		fox1.speed=200;
		Fox.numberOfFoxes++;
		
		
		Fox fox2=new Fox();
		fox2.color="black";
		fox2.speed=250;
		Fox.numberOfFoxes++;
		
		
		Fox fox3=new Fox();
		fox3.color="grey";
		fox3.speed=300;
		Fox.numberOfFoxes++;
		System.out.println("Total number of fox : "+Fox.numberOfFoxes);
		System.out.println("Frist fox is "+fox1.color+" and speed is "+fox1.speed);
		System.out.println("Second fox is "+fox2.color+" and speed is "+fox2.speed);
		System.out.println("Third fox is "+fox3.color+" and speed is "+fox3.speed);
		
		Bear bear1=new Bear();
		bear1.type="polar bear";
		bear1.weight=400;
		Bear.numberOfBears++;
		
		
		Bear bear2=new Bear();
		bear2.type="brown bear";
		bear2.weight=500;
		Bear.numberOfBears++;
		System.out.println("Total number of bear : "+Bear.numberOfBears);
		System.out.println("First bear is "+bear1.type+"and weight is "+bear1.weight);
		System.out.println("Second bear is "+bear2.type+"and weight is "+bear2.weight);
	}
	

}
