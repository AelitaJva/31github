package com.java.Week11_Maps;

import java.util.*;

public class ValuesMethodExercise1 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");
        map.put(4, "grapefruit");
        map.put(5, "Orange");
        map.put(6, "Pineapple");

        String[] result1 = searchValue(map, "an");
        System.out.println(Arrays.toString(result1));

        String[] result2 = searchValue(map, "E");
        System.out.println(Arrays.toString(result2));

        String[] result3 = searchValue(map, "kiwi");
        System.out.println(Arrays.toString(result3));
    }

    public static String[] searchValue (Map<Integer, String> map, String searchStr) {

        List<String> result = new ArrayList<>();
        Collection<String> values = map.values();

        for(String value : values) {
            if(value.toLowerCase().contains(searchStr.toLowerCase())) {
                result.add(value);
            }
        }

        // convert the list to an array
        return result.toArray(new String[0]);
    }
}
