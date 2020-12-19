package com.bit.test;

public class Array {
	public static void main(String[] args) {
		
	
		int [] array = {300,304,100,470,230};
		int sum =500;
		for(int i =0;i<array.length;i++) {
			for(int j=i+1; j<array.length;j++) {
				if(array[j]== sum-array[i]) {
					
				}
				System.out.println("pairs of sum are "+array[i]+","+array[j]);
				}
			
			}
		}
	
}


	

