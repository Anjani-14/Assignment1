package com.assignments.basics;

public class LargeSecond {

	public static void main(String[] args) {
		int[] array = { 11, 8, 35, 70, 22, 50 };

        int large = Integer.MIN_VALUE;
        int secondLarge = Integer.MIN_VALUE;

        for (int num : array) {
            if (num > large) {
                secondLarge = large;
                large = num;
            } else if (num > secondLarge && num != large) {
                secondLarge = num;
            }
        }

        System.out.println("The second Largest element in the array is: " + secondLarge);
	}

}
