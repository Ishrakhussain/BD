package com.bit.test;

public class Highest {
	public static void main(String[] args) {
		int a[]= {6,6,4,76,45,3,3,3};
		int h=a[0];
		int sh=a[1];
		if (h<sh) {
			h=a[1];
			sh=a[0];
			
		}
		for (int i=2; i<a.length; i++) {
			if(a[i]>h) {
				sh=h;
				h=a[i];
			} else if(a[i]<h&&a[i]>sh) {
				sh=a[i];
				
			}
			
		}
		
System.out.println(sh);		
	}
	
} 

