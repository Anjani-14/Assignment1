package com.assignments.basics;
import java.util.Scanner;
public class Reverse {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        System.out.print("Enter a number: ");        
	        int number = input.nextInt();
	        int reversedNumber = reverse(number);        
	        System.out.println("Reversed number: " + reversedNumber);       
	        input.close();
	    }   
	    public static int reverse(int number) {
	        int reversedNumber = 0;
	        while (number != 0) {
	            int lastDigit = number % 10;
	            reversedNumber = reversedNumber * 10 + lastDigit;
	            number /= 10;
	        }
	        return reversedNumber;
	    }
	}


