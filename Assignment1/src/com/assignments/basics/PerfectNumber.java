package com.assignments.basics;

public class PerfectNumber {
	    public static void main(String[] args) {
	        int limit = 10000; 
	        System.out.println("Perfect numbers within the range 1 to " + limit + ":");
	        for (int i = 1; i <= limit; i++) {
	            if (isPerfectNumber(i)) {
	                System.out.println(i);
	            }
	        }
	    }
	    public static boolean isPerfectNumber(int num) {
	        if (num <= 0) {
	            return false;
	        }
	        int sumOfDivisors = 0;
	        for (int i = 1; i <= num / 2; i++) {
	            if (num % i == 0) {
	                sumOfDivisors += i;
	            }
	        }
	        return sumOfDivisors == num;
	    }
	}
