package com.class5;

public class LogicalOr {

public static void main(String[] args) {
	/*7 days a week
	 * if day is 2 or 4 --> SDLC class
	 *  if day 6 or 7 --> java class
	 *  if day is 1 or 5--> no classes
	 *  if day =3 --> review class
	 */
		int day=6;
		
		if (day==2 || day==4) {
			System.out.println("SDLC class");
		}else if (day==6 || day==7) {
			System.out.println("java class");
		}else if(day==1 || day==5) {
			System.out.println("no classes");
		}else if(day==3) {
			System.out.println("review class");
		}else {
			System.out.println("number is out of the range ");
		}
	
		/*7 days a week
		 * if day is Tuesday or Thursday --> SDLC class
		 *  if day Saturday or Sunday --> java class
		 *  if day is Monday or Friday--> no classes
		 *  if day =Wednesday --> review class
		 */
	
	String weekDay="Sunday";
	
	if (weekDay.equals("Tuesday") || weekDay.equals("Thursday")) {
		System.out.println("SDLC class");
	}else if (weekDay.equals("Saturday") || weekDay.equals("Sunday")) {
		System.out.println("java class");
	}else if(weekDay.equals("Monday") || weekDay.equals("Friday")) {
		System.out.println("no classes");
	}else if(weekDay.equals("Wednesday")) {
		System.out.println("review class");
	}else {
		System.out.println("not valid day ");
	}
	
	
	
	}

}
