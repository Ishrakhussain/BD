package com.bit.test;

public class Reverse {
	public static void main(String[] args) {
		String r= reverse("Jhilam");
		System.out.println(r);
	}

	public static String reverse(String s) {
		char[] letters= new char[s.length()];
		
		for(int i=0; i<s.length(); i++) {
			
			System.out.println(s.charAt(i)); 
		}
		
		return s;
		
	}

	
}

