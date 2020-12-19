package com.bit.test;

public class Repeat {
	public static void main(String[] args) {
		
	int num[]= {7,33,23,23};
	int highestnum =num[0];
	int smallestnum=num[1];
	if(smallestnum>highestnum) {
		
		highestnum=num[1];
		smallestnum=num[0];
				
	}
	 for (int i=2; i<num.length; i++) {
		 if(num[i]>highestnum) {
			 smallestnum=highestnum;
			 highestnum=num[i];
			 
		 } else if (num[i]<highestnum&&num[i]>smallestnum) {
			 smallestnum=num[i];
			 
		 }
		 
	 }
	 System.out.println(smallestnum); 
	
	
	
	
	}
	

}
