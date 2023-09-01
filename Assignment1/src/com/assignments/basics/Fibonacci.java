package com.assignments.basics;

public class Fibonacci {

	public static void main(String[] args) {
		int number = 10;
		FibonacciSeries(number);
	}
	static void FibonacciSeries(int n) {
		int first = 0;
		int second = 1;
		for(int i=0; i<n ;i++) {
			System.out.println(first + " ");
			int next = first + second;
			first = second;
			second = next;
		}
	}

}
