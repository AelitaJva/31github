package com.java.Week11_Maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ValuesMethodExercise3 {
    public static void main(String[] args) {
        Map<String, Integer> library = new HashMap<>(Map.of("Book A",5, "Book B",3, "Book C",8));

        System.out.println(calculateCatalogSize(library));
    }

    public static int calculateCatalogSize(Map<String, Integer> library) {

        Collection<Integer> booksQuantity = library.values();

        int sumOfTotalBooks = 0;

        for (Integer book : booksQuantity) {
            sumOfTotalBooks+=book;
        }

        return sumOfTotalBooks;
    }
}
