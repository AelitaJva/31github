package com.java.Maps;

import java.util.HashMap;
import java.util.Map;

public class MapContainsKeyExercise3 {
    public static void main(String[] args) {

        Map<String, Integer> productAvailability = new HashMap<>(Map.of("Laptop",5, "Phone", 0, "Tablet", 10));
        String productName = "Laptop";
        System.out.println(isProductAvailable(productAvailability, productName));
    }

    public static int isProductAvailable (Map<String, Integer> productAvailability, String productName) {


        boolean isExistProduct = productAvailability.containsKey(productName);

        return isExistProduct ? productAvailability.get(productName) : 0;


        // if true -> ?
        // if false -> ? 0
        // else : 0
    }
}
