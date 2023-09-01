package com.assignments.basics;

public class Prime {

	public static void main(String[] args) {
		int num=5;
		if(isPrime(num)) {
			System.out.println(num + " is a prime number.");
		}
		else { System.out.println(num + "is not a prime number.");
	}
	}
	public static boolean isPrime(int x) {
		if(x <=1 ) {
			return false;
		}
		for(int i = 2; i<= Math.sqrt(x); i++) {
			if(x % i == 0) {
				return false;
			}
		}
		return true;
	}
}
