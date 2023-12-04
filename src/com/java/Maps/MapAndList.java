package com.java.Maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapAndList {
    public static void main(String[] args) {

        // Manager name ---> list of employees names Mapping
        // String

        Map<String, List<String>> managersAndEmployees = new HashMap<>();
        // Elon --> [Steve, Alice, Bill, Jane]


        List<String> elonsEmployees = new ArrayList<>();
        elonsEmployees.add("Steve");
        elonsEmployees.add("Alice");
        elonsEmployees.add("Bill");
        elonsEmployees.add("Jane");

        managersAndEmployees.put("Elon", elonsEmployees);
        System.out.println(managersAndEmployees);


        // Askar --> Aelita, Adina, Akmaral, Chirag

        List<String> askarsEmployees = new ArrayList<>();
        askarsEmployees.add("Aelita");
        askarsEmployees.add("Adina");
        askarsEmployees.add("Akmaral");
        askarsEmployees.add("Chirag");

        managersAndEmployees.put("Askar", askarsEmployees);
        System.out.println(managersAndEmployees);
    }
}
