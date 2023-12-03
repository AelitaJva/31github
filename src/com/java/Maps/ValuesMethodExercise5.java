package com.java.Maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ValuesMethodExercise5 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Rainbow sunset )");

        map.put(2, "This is a test.");

        map.put(3, "Java Programming");

        System.out.println(countUnevenValues(map));
    }

    public static int countUnevenValues (Map<Integer, String> map) {

        Collection<String> mapValues = map.values();
        int countUnevenLength = 0;

        for(String sentence : mapValues) {
            String ignoreCases = sentence.replaceAll("[\\s,\\.]", "");
            if(ignoreCases.length() % 2 != 0) {
                countUnevenLength++;
            }
        }

        return countUnevenLength;
    }
}
