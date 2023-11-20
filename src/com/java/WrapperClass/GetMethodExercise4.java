package com.java.WrapperClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GetMethodExercise4 {
    public static void main(String[] args) {
        List<String> books = new ArrayList<>(Arrays.asList("Book 1", "Book 2", "Book 3", "Book 4", "Book 5"));
        int bookIndex = 3;
        System.out.println(getBook(books, bookIndex));
    }

    public static String getBook (List<String> books, int bookIndex) {
        return books.get(bookIndex);
    }
}
