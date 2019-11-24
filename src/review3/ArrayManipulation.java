package review3;

public class ArrayManipulation {

	public static void main(String[] args) {
		
		int[] arr= {5,8,2,9,3,6};
		
		Application obj1=new Application();
		int largest = obj1.largestNumber(arr);
		System.out.println(largest);
		System.out.println("The largest number is: "+largest);
		
		int sum=obj1.sumOfArray(arr);
		System.out.println("The sum of the numbers in the array is:"+sum);
	}

	
}
