package com.java.Week11_Maps;

import java.util.*;

public class MapAndListExercise4 {
    public static void main(String[] args) {
        Map<String, List<String>> orders = new HashMap<>();
        orders.put("Alice", new ArrayList<>(Arrays.asList("Item A", "Item B")));
        orders.put("Bob", new ArrayList<>(Arrays.asList("Item X")));


        String usernameX = "Alice";
        List<String> orderToChange = new ArrayList<>(Arrays.asList("Item C", "Item D"));

        System.out.println(recordOrder(orders, usernameX, orderToChange));


    }

    public static String recordOrder(Map<String, List<String>> orders, String username, List<String> orderToChange) {

        if (!orders.containsKey(username)) {
            orders.put(username, new ArrayList<>());
        }

        orders.get(username).addAll(orderToChange);
        return "Customer " + username + " has placed orders for " + orders.get(username);
    }

}
