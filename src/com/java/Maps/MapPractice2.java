package com.java.Maps;

import java.util.*;

public class MapPractice2 {
    public static void main(String[] args) {
        Map<String, List<Integer>> inputMap = new HashMap<>();
        inputMap.put("A", Arrays.asList(9, 12, 4, 7));
        inputMap.put("B", Arrays.asList(6, 3, 8, 15));

        Map<String, List<Integer>> result = sortAndFilterMap(inputMap);

        // Print the result
        System.out.println(result);
    }

    public static Map<String, List<Integer>> sortAndFilterMap (Map<String, List<Integer>> inputMap) {

     Map<String,List<Integer>> resultMap = new HashMap<>();

     for(Map.Entry<String, List<Integer>> entry : inputMap.entrySet()) {
         List<Integer> values = entry.getValue();


         Collections.sort(values);

         List<Integer> filteredValues = new ArrayList<>();

         for(int value : values) {
             if(value % 3 == 0) {
                 filteredValues.add(value);
             }
         }
         resultMap.put(entry.getKey(), filteredValues);
     }

     return resultMap;
    }
}
