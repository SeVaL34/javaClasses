package review3;

public class task2 {

	
		  String dogName;
		  double dogWeight;
		  static String dogBreed="Mutt";
		  
		  task2(String dogName1,String dogBreed1,double dogWeight1){
			  dogName=dogName1;
			  dogWeight=dogWeight1;
			  dogBreed=dogBreed1;
		  }  
		  task2(String dogName1,double dogWeight1){
			  dogName=dogName1;
			  dogWeight=dogWeight1;
		  }
		public void display(){
		        System.out.println(dogName+" "+dogBreed+" "+dogWeight);
		        
		  }
		  
		  public static void main(String[] args) {
			
			  task2 dog=new task2("Tarzan","Mutt",50.0);
			  dog.display();
			  task2 dog1=new task2("Tarzan",50.0);
			  dog1.display();
		}

	
		}
		

