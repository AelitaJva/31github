package com.java.Maps;

import java.util.Map;
import java.util.TreeMap;

public class EntrySetMethodExercise4 {
    public static void main(String[] args) {
        TreeMap<String, Integer> originalMap = new TreeMap<>();
        originalMap.put("apple", 1);
        originalMap.put("banana", 2);
        originalMap.put("cherry", 3);

        TreeMap<Integer, String> swappedMap = swapKeysAndValues(originalMap);

        System.out.println(swappedMap);
    }

    public static TreeMap<Integer, String> swapKeysAndValues(TreeMap<String, Integer> originalMap) {

        TreeMap<Integer, String> resultMap = new TreeMap<>();

        for (Map.Entry<String, Integer> entry : originalMap.entrySet()) {
            resultMap.put(entry.getValue(), entry.getKey());
        }

        return resultMap;
    }
}
