package com.class18;

public class Deneme {

	
	
	String fly() {
		System.out.println("flying");
		return "fly";

	}
	
	public static void main(String[] args) {
		
		Deneme fly1=new Deneme();
		fly1.fly();

		fly1.ucmak(9, "sev");
	}
		String ucmak(int num,String name) {
			System.out.println(name + num);
			return "hooo";
		}
	}

