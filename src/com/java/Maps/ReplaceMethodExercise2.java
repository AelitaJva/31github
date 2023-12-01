package com.java.Maps;

import java.util.HashMap;
import java.util.Map;

public class ReplaceMethodExercise2 {
    public static void main(String[] args) {
        Map<String, Double> products = new HashMap<>(Map.of("Laptop", 899.99, "Phone", 599.99));
        String productName = "Laptop";
        Double newPrice = 799.99;
        System.out.println(adjustProductPrices(products, productName, newPrice));
    }

    public static Map<String, Double> adjustProductPrices(Map<String, Double> products, String productName, double newPrice) {

        Map<String, Double> updatedMap = new HashMap<>();

        if (!products.containsKey(productName)) {
            return products;
        } else {
            products.replace(productName, newPrice);
            return products;
        }
    }
}
