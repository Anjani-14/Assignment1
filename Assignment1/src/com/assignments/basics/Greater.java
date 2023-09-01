package com.assignments.basics;

public class Greater {

	public static void main(String[] args) {
		int []arr = {23,45,10,12,13};
		int max = arr[0];
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
			max = arr[i];
		}
			System.out.println("Greatest Element is" + max);
		
	}

}
