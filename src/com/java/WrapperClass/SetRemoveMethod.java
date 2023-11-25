package com.java.WrapperClass;

import java.util.HashSet;
import java.util.Set;

public class SetRemoveMethod {
    public static void main(String[] args) {

        Set<Integer> ids = new HashSet<>();
        ids.add(1);
        ids.add(2);
        ids.add(3);
        ids.add(4);
        System.out.println(ids);

        boolean result1 = ids.remove(3);
        System.out.println(result1);      // returns true bc the set collection contains 3

        boolean result2 = ids.remove(9);
        System.out.println(result2);     // false


        // negate`
        if(!ids.remove(12)) {
            System.out.println("The user doesn't exist");
        }

    }
}
