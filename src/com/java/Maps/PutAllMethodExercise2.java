package com.java.Maps;

import java.util.HashMap;
import java.util.Map;

public class PutAllMethodExercise2 {
    public static void main(String[] args) {
        Map<String, String> originalMap = new HashMap<>(Map.of("101", "John", "102", "Alice", "103", "Bob"));
        Map<String, String> updateMap = new HashMap<>(Map.of("102", "Eve", "104", "Charlie"));

        Map<String, String> updatedNewMap = updateValuesWithPutAll(originalMap, updateMap);
        System.out.println(updatedNewMap);


    }

    public static Map<String, String> updateValuesWithPutAll(Map<String, String> originalMap, Map<String, String> updatedMap) {
        originalMap.putAll(updatedMap);
        return originalMap;
    }
}
