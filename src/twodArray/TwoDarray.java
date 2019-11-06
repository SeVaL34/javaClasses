package twodArray;

public class TwoDarray {
public static void main(String[] args) {
	// example:1
    
//  int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7 , 8 } };
//  
//  for (int i = 0; i < 2; i++) {
//      
//    for(int j = 0; j < 4; j++) {
//        
//      System.out.println(myNumbers[i][j]);
//    }
//  }
  
  
// example :2
  
int[][] a={ {1,2,3} , {4,5,6,7} , {8} };
  for (int i = 0; i < a.length; ++i) {
	  for(int j = 0; j < a[i].length; ++j) {
		  System.out.println(a[i][j]);
      }
   }
}}
