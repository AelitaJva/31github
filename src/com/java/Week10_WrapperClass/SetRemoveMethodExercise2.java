package com.java.Week10_WrapperClass;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetRemoveMethodExercise2 {
    public static void main(String[] args) {
        Set<String> shoppingCart = new HashSet<>(Arrays.asList("carrot", "water", "potato"));
        boolean isAdd = false;
        String item = "chocolate";
        System.out.println(manageCart(shoppingCart, isAdd, item));
    }

    public static Set<String> manageCart (Set<String> shoppingCart, boolean isAdd, String item) {

        if(isAdd == true) {
            shoppingCart.add(item);
        } else {
            shoppingCart.remove(item);
        }

        return shoppingCart;
    }
}
