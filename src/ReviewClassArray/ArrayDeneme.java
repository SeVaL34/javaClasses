package ReviewClassArray;

public class ArrayDeneme {
public static void main(String[] args) {
	
	//int [] a=new int[4];
	
	//for (int i=0; i<a.length ; i++) {
		//System.out.println(a[i]);
	
	int [][] a=new int[3][4];
	a[0][0]=5;
	a[2][1]=3;
	
	for (int row=0 ; row<a.length; row++) {
		System.out.println("row "+ row+" ->");
		for (int col=0 ; col<a[row].length ; col++) {
			int value = a[row][col];
			System.out.print(value+" ");
		}
	System.out.println();
	}
	

	
	
	
}
}
