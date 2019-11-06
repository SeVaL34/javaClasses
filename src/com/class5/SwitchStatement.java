package com.class5;

public class SwitchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*7 weekdays
 * if day==1 --> monday
 * if day==2 --> tuesday
 */
	int day=5;
	String weekDay;
	
	if (day==1) {
		weekDay="monday";
	}else if (day==2) {
		weekDay="tuesday";
	}else if(day==3) {
		weekDay="wednesday";
	}else if(day==4) {
		weekDay="thursday";
	}else if(day==5) {
		weekDay="friday";
	}else if(day==6) {
		weekDay="saturday";
	}else if(day==7) {
		weekDay="sunday";
	}else {
		weekDay="invalid";
	}
	System.out.println(weekDay);	
		
	day=5;
	
	switch(day) {
	case 1://day==1
		weekDay="monday";
		break;
	case 2://day==2
	    weekDay="tuesday";
	    break;
	case 3:
		weekDay="wednesday";
		break;
	case 4:
		weekDay="thursday";
		break;
	case 5:
		weekDay="friday";
		break;
	case 6:
		weekDay="saturday";
		break;
	case 7:
		weekDay="sunday";
		break;
	default:
		weekDay="invalid";
	}
		System.out.println(weekDay);
	
	
	


}}
