package com.java.Week13_OOP_Inheritance;

public class MethodOverridingExercise2 {
    public static void main(String[] args) {
        Book book = new Book("The Great Gatsby", "F. Scott Fitzgerald", 15.99);
        EBook eBook = new EBook("The Catcher in the Rye", "J.D. Salinger", 12.99, "PDF");

        System.out.println("Book Details:");
        book.displayDetails();

        System.out.println("\nEBook Details:");
        eBook.displayDetails();
    }
}


class Book {
    protected String title;
    protected String author;
    protected double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }
}

class EBook extends Book {
    private String format;

    public EBook(String title, String author, double price, String format) {
        super(title, author, price);
        this.format = format;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Format: " + format);
    }
}