package com.assignments.basics;

public class SmallSecond {
	public static void main(String[] args) {
		
	int[] array = { 11, 8, 35, 70, 22, 50 };

    int small = Integer.MAX_VALUE;
    int secondSmall = Integer.MAX_VALUE;

    for (int num : array) {
        if (num < small) {
            secondSmall = small;
            small = num;
        } else if (num < secondSmall && num != small) {
            secondSmall = num;
        }
    }
    System.out.println("The second Smallest element in the array is: " + secondSmall);
}
}
