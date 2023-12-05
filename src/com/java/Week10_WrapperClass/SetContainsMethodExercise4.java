package com.java.Week10_WrapperClass;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetContainsMethodExercise4 {
    public static void main(String[] args) {
        LinkedHashSet<String> shoppingList = new LinkedHashSet<>(Arrays.asList("Milk", "Bread", "Eggs"));
        String itemToAdd = "Milk";

        System.out.println(organizeShoppingList(shoppingList, itemToAdd));
    }

    public static LinkedHashSet<String> organizeShoppingList(LinkedHashSet<String> shoppingList, String itemToAdd) {

        Set<String> updatedShoppingList = new HashSet<>();


        if (!shoppingList.contains(itemToAdd)) {
            shoppingList.add(itemToAdd);

        } else {
            System.out.println("Item '" + itemToAdd + "' is already in the list");
        }

        return shoppingList;
    }
}
