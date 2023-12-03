package com.java.Maps;

import java.util.HashMap;
import java.util.Map;

public class EntrySetMethodExercise1 {
    public static void main(String[] args) {
        Map<String, Integer> cityPopulationMap = new HashMap<>();
        cityPopulationMap.put("Chicago", 2697000);
        cityPopulationMap.put("Los-Angeles", 3849000);
        cityPopulationMap.put("Houston", 2288000);

        findLargestCity(cityPopulationMap);
    }

    public static void findLargestCity(Map<String, Integer> phoneBook) {

        if (phoneBook.isEmpty()) {
            System.out.println("The map is empty");
            return;
        }

        String largestCity = null;
        int maxPopulation = Integer.MIN_VALUE;


        for (Map.Entry<String, Integer> entry : phoneBook.entrySet()) {
            String city = entry.getKey();
            int population = entry.getValue();

            if (population > maxPopulation) {
                maxPopulation = population;
                largestCity = city;
            }
        }

        if (largestCity != null) {
            System.out.println("The city with the highest population is " + largestCity + " with a population of " + maxPopulation);
        } else {
            System.out.println("No city data available.");
        }
    }
}
