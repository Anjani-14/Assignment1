package com.assignments.basics;

public class Smaller {

	public static void main(String[] args) {
		int []arr = {13,25,10,12,13};
		int min = arr[0];
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<min)
			min = arr[i];
		}
			System.out.println("Smallest Element is" + min);
		
	}

}
