package com.bit.test;

public class Prime {
	public static void main(String[] args) {
		int number = 5;
	    boolean exp = false;
	    for (int i = 2; i <= number / 2; i++) {
	      // condition for nonprime number
	      if (number % i == 0) {
	        exp = true;
	        break;
	      }
	    }

	    if (!exp)
	      System.out.println(number + " is a prime number.");
	    else
	      System.out.println(number + " is not a prime number.");
	}
	
	
		
	
	public void SwapTwoNum() {
		int a=10;
		int b=20;
		b=b-a;
		a=a+b;
		System.out.println(a);
		System.out.println(b); 
	}

}
