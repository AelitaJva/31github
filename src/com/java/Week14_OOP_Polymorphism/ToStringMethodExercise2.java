package com.java.Week14_OOP_Polymorphism;

public class ToStringMethodExercise2 {
    public static void main(String[] args) {
        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", 1960, "Classic Fiction");
        Book book2 = new Book("1984", "George Orwell", 1949, "Dystopian Fiction");

        System.out.println(book1);
        System.out.println();
        System.out.println(book2);
    }
}


class Book {
    String title;
    String author;
    int year;
    String genre;

    public Book(String title, String author, int year, String genre) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Title: " + title + "\nAuthor: " + author + "\nPublication Year: " + year + "\nGenre: " + genre;
    }
}