package com.java.Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class KeySet {
    public static void main(String[] args) {
        Map<Integer, String> countryCodesEU = new HashMap<>();
        countryCodesEU.put(44, "United Kingdom");
        countryCodesEU.put(33, "France");
        countryCodesEU.put(49, "Germany");


        // Set<Integer> keys =  keySet();
        Set<Integer> countryCodeKeys = countryCodesEU.keySet();
        System.out.println(countryCodeKeys);
        for(Integer key : countryCodeKeys) {
            System.out.println(key);
        }

//        Map<String, String> demoMap = new HashMap<>();
//        Set<String> set = demoMap.keySet();
    }
}
