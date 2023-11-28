package com.java.Maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Initialization {
    public static void main(String[] args) {

        // inside diamonds,
        // we need to provide data type of
        // key and value

        // beginner level creation of Maps
        HashMap<Integer, String> students = new HashMap<>();
        LinkedHashMap<Integer, String> students2 = new LinkedHashMap<>();
        TreeMap<Integer, String> students3 = new TreeMap<>();


        // High level of initialization
        // Polymorphism
        // List<String> var = new ArrayList<>();
        // Set<String> vay = new HashSet<>();

        Map<Integer, String> students4 = new HashMap<>();
        Map<Integer, String> students5 = new LinkedHashMap<>();
        Map<Integer, String> students6 = new TreeMap<>();
    }
}
