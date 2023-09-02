package com.objects.basics;

public class BookMain {
	public static void main(String[] args) {
        Book book1 = new Book("Two States", "Chethan Bhagath", 750.0);
        Book book2 = new Book("Harry Potter", "J.K Rowling", 300.0);
        
        System.out.println("Details of Book 1:");
        book1.getDetails();
        
        System.out.println("\nDetails of Book 2:");
        book2.getDetails();
    }
}
