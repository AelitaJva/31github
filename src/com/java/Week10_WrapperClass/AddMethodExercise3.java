package com.java.Week10_WrapperClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddMethodExercise3 {
    public static void main(String[] args) {
        List<String> books = new ArrayList<>(Arrays.asList("Book 1", "Book 2", "Book 3"));
        System.out.println("Previous list of books: " + books);


        String newBook = "Book 4";
        List<String> updatedBookshelf = addBook(books, newBook);
        System.out.println("Updated list of books: " + updatedBookshelf);
    }

    public static List<String> addBook(List<String> books, String newBook) {

        books.add(newBook);
        return books;
    }
}
