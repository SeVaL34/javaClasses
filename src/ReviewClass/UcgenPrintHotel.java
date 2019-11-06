package ReviewClass;

public class UcgenPrintHotel {
public static void main(String[] args) {

//funny way
	System.out.println("1");
	System.out.println("12");
	System.out.println("123");
	System.out.println("1234");
	System.out.println("12345");

//serious way
	
	for (int row=1 ; row<=5 ; row++) {
		for (int col=1 ; col<=row ; col++) {
			System.out.print(row);
		}
	System.out.println();
	}

//1
//13
//135
//1357
//13579
	for (int row=1 ; row<=5 ; row++) {
		for (int col=1 ; col<=row ; col++) {
			System.out.print(2*col-1);
		}
	System.out.println();
	}
// karelerini alarak cikarir
//1
//1 4
//1 4 9
//1 4 9 16
//1 4 9 16 25

	for (int row=1 ; row<=5 ; row++) {
		for (int col=1 ; col<=row ; col++) {
			System.out.print(col*col+" ");
		}
	System.out.println();
	}

//----1
//---12
//--123
//-1234
//12345
for (int a=1 ; a<=5 ; a++) {
	for (int b=5-a ; b>=1 ; b--) {
     System.out.print(" ");
	}
for (int c=1 ; c<=a ; c++) {
	System.out.print(c);
}
    System.out.println();
}
//$$$$$
//$   $
//$   $
//$$$$$
for (int i=1 ; i<=4 ; i++) {
	for (int j=1 ; j<=4 ; j++) {
		if(i==1 || j==1 ||i==4 ||j==4) {
			System.out.print("$");
		}else {
			System.out.print(" ");
		}
	}
System.out.println();
}


}}
