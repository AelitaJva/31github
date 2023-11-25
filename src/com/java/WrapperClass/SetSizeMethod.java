package com.java.WrapperClass;

import java.util.HashSet;
import java.util.Set;

public class SetSizeMethod {
    public static void main(String[] args) {
        Set<Double> prices = new HashSet<>();
        prices.add(12.44);
        prices.add(5.22);
        prices.add(55.11);
        prices.add(234.45);
        prices.add(33.22);
        System.out.println(prices);
        System.out.println(prices.size());  // size method

        prices.clear();                     // clear method
        System.out.println(prices);

        // One of the most fastest data is collection, and always store in var to avoid losing it accidentally using clear method

        if(prices.isEmpty()) {
            System.out.println("It's empty"); // empty method
        }



    }


}
