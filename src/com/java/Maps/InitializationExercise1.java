package com.java.Maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class InitializationExercise1 {
    public static void main(String[] args) {

    }

    public static Map<Character, String> createMap1 () {
         Map<Character, String> map = new HashMap<>();
         return map;
    }

    public static Map<Character, Double> createMap2 () {
        Map<Character, Double> map1 = new LinkedHashMap<>();
        return map1;
    }

    public static Map<String, Boolean> createMap () {
        Map<String, Boolean> map1 = new LinkedHashMap<>();
        return map1;
    }
}
