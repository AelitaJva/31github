package com.java.Maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
// Description: Implement a method called getKeysGreaterThanDivision() that takes a Map<String, Integer> and a Double as input.
// The method should calculate the sum of all values in the map and divide it by the Double input.
// It should then return an array of all keys from the map where the corresponding value is greater than the division result.
// If the Double input is 0, it should return an array of all keys from the map.
//Params:
//Map<String, Integer>: A map with string keys and integer values.
//Double: A double value used for division.
//Return: An array of strings containing keys from the map where the value is greater than the division result. If the Double input is 0, it should return an array of all keys from the map.

public class EntrySetMethodExercise5 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 5);
        map.put("banana", 10);
        map.put("cherry", 15);
        map.put("dog", 8);
        map.put("elephant", 20);

        double divisionValue = 10.0;

        String[] result = getKeysGreaterThanDivision(map, divisionValue);

        System.out.println("Result: " + arrayToString(result));
    }
    public static String[] getKeysGreaterThanDivision(Map<String, Integer> map, Double division) {

        List<String> allKeys = new ArrayList<>();
        int sumOfKeys = 0;
        for(int value : map.values()) {
            sumOfKeys+=value;
        }

        double divisionResult;
        if(division != 0.0) {
            divisionResult = sumOfKeys / division;
        } else {
            divisionResult = 0.0;
        }

        List<String> result = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if(entry.getValue() > divisionResult) {
                result.add(entry.getKey());
            }
        }

        return result.toArray(new String[0]);
    }

    private static String arrayToString(String[] array) {
        return "[" + String.join(", ", array) + "]";
    }

}
