package com.java.Week11_Maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ValuesMethodExercise2 {
    public static void main(String[] args) {
        Map<String, Integer> inventory = new HashMap<>(Map.of("Apples", 50, "Bananas",30, "Oranges",40));

        int result = calculateTotalItems(inventory);
        System.out.println(result);

    }

    public static int calculateTotalItems (Map<String, Integer> inventory) {

        Collection<Integer> quantities = inventory.values();

        int sum = 0;
        for(Integer quantity : quantities) {
            sum+=quantity;
        }

        return sum;
    }
}
