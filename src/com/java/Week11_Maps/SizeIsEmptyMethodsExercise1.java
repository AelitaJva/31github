package com.java.Week11_Maps;

import java.util.HashMap;
import java.util.Map;

public class SizeIsEmptyMethodsExercise1 {
    public static void main(String[] args) {
        Map<String, Integer> library = new HashMap<>(Map.of("Item 1", 2, "Item 2",10));
        String result = cleanShoppingCart(library);
        System.out.println(result);
    }

    public static String cleanShoppingCart (Map<String, Integer> library) {

        if(library.isEmpty()) {
            return "The cart is empty";
        } else {
            return "Removed from the cart: " + library;
        }
    }
}
