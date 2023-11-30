package com.java.Maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MapContainsKeyMethodExercise2 {
    public static void main(String[] args) {
        Map<String, String> phoneBook =  new HashMap<>(Map.of("John Doe","123-456-7890", "Alice Smith","987-654-3210"));
        String name = "John Doe";
        System.out.println(searchContact(phoneBook, name));
    }

    public static String searchContact(Map<String, String> phoneBook, String name) {

        boolean exist = phoneBook.containsKey(name);

        if(exist) {
            return phoneBook.get(name);
        } else {
            return "Contact not found";
        }
    }
}
