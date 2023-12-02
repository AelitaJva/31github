package com.java.Maps;

import java.util.HashMap;
import java.util.Map;

public class ClearMethodExercise1 {
    public static void main(String[] args) {
        Map<String, Integer> cart = new HashMap<>(Map.of("Apples", 3, "Bananas", 2, "Chocolates", 5));
        boolean clear = true;
        System.out.println(resetCart(cart, clear));
    }

    public static Map<String, Integer> resetCart(Map<String, Integer> cart, boolean clear) {

        if (clear) {
            cart.clear();
            return new HashMap<>();  // return an empty map
        } else {
            return cart;             // otherwise
        }
    }
}
