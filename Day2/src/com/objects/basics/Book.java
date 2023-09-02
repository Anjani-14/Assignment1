package com.objects.basics;

public class Book {
	String title;
    String author;
    double price;
    
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    
    public void getDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Category: " + checkBookType());
    }
    
    public String checkBookType() {
        if (price > 500) {
            return "Premium Book";
        } else {
            return "Standard Book";
        }
    }

}
