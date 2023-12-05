package com.java.Week11_Maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ValuesMethod {
    public static void main(String[] args) {

        Map<Integer, String> countryCodesEU = new HashMap<>();
        countryCodesEU.put(44, "United Kingdom");
        countryCodesEU.put(33, "France");
        countryCodesEU.put(49, "Germany");

        // pull out the values somehow

        // Collection<String>
        Collection<String> values = countryCodesEU.values();
        System.out.println(values);

        int index = 1;
        for(String value : values) {
            System.out.println(index + ": " + value);
        }
    }
}
