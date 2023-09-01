package com.assignments.basics;

public class Even {

	public static void main(String[] args) {
		int []arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,25,16,17,18,19,20};
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println(arr[i]);
			}
		}
	}

}
