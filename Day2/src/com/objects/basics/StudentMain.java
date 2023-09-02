package com.objects.basics;
import java.util.Scanner;
public class StudentMain {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter Student 1 Name: ");
        String name1 = scanner.nextLine();
        System.out.print("Enter Student 1 Department: ");
        String department1 = scanner.nextLine();
        System.out.print("Enter Student 1 Marks (separated by spaces): ");
        String marksInput1 = scanner.nextLine();
        
        System.out.print("Enter Student 2 Name: ");
        String name2 = scanner.nextLine();
        System.out.print("Enter Student 2 Department: ");
        String department2 = scanner.nextLine();
        System.out.print("Enter Student 2 Marks (separated by spaces): ");
        String marksInput2 = scanner.nextLine();
        
        scanner.close();

}
}