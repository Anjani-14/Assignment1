package com.assignments.basics;

public class Duplicates {
	    public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 2, 4, 5, 4, 6, 7, 8, 7, 9};
	        countAndPrintDuplicates(arr);
	    }
	    public static void countAndPrintDuplicates(int[] arr) {
	        int n = arr.length;
	        for (int i = 0; i < n; i++) {
	            if (arr[i] != Integer.MIN_VALUE) {
	                int count = 1;
	                for (int j = i + 1; j < n; j++) {
	                    if (arr[i] == arr[j]) {
	                        count++;
	                        arr[j] = Integer.MIN_VALUE;
	                    }
	                }
	                if (count > 1) {
	                    System.out.println("Element: " + arr[i] + ", Count: " + count);
	                }
	            }
	        }
	    }
}
