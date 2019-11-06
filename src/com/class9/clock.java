package com.class9;

public class clock {
public static void main(String[] args) {

// 24 hours,60 min
	
	for (int h=0 ; h<24 ; h++) {
		for (int m=0 ; m<60 ; m++) {
			System.out.println(h+":"+m);
		}
	}

for (int mon=1 ; mon<12 ; mon++) {
	for (int day=1 ; day<=30 ; day++) {
		System.out.println(mon+" - "+day);
	}
}
	
for(int h=0; h<24; h++) {
    for(int m=0; m<60; m++) {
        if (m<10) {
        System.out.println(h+":0"+m);
        }else {System.out.println(h+":"+m);}
        }
}

for (int c=0 ; c<=9 ; c++) {
	for (int d=0 ; d<=9 ; d++) {
		for (int e=0 ; e<=9 ; e++) {
			for (int f=0 ; f<=9 ; f++) {
				
				System.out.println(c+""+d+""+e+""+f);
			}
			
		}
		
	}
}


}}
