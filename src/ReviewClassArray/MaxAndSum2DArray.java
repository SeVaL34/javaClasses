package ReviewClassArray;

public class MaxAndSum2DArray {
public static void main(String[]args) {
	
	int[][] b= {
			{ 7, 3 , 5 },
			{ 2, 4 , 7 },
			{ 8 , 1 , 0 },
			{ 3 , 5 , 1 }
	};
int max = b[0][0];
int sum=0;

for (int i=0 ; i<b.length ; i++) {
	for (int k=0 ; k<b[i].length ; k++) {
		sum+=b[i][k];
		if (b[i][k]>max) {
			max=b[i][k];
			
		}
	}
}
System.out.println("max is "+ max);	
System.out.println("sum is "+sum);

int x=2;
x=5;
x=3+4;

}
}
