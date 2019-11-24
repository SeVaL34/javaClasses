package review3;

public class Application {

	public int largestNumber(int[] array) {
		
		int max=array[0];
		
		for(int element : array) {//local variable array ve element burda olustu burda oldu
			if (element>max) {
				max=element;
	}
}
		return max;
	}
	public static int sumOfArray(int[] array) {
		int total=0;
		for(int element : array) {
			total+=element;
		}
		return total;
	}
	
	
	
	
	
	
	
	
	//public static void main(String[] args) {
	
}

