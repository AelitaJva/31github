package com.java.Week10_WrapperClass;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetContainsMethodExercise3 {
    public static void main(String[] args) {
        Set<String> phonesDataBase = new HashSet<>(Arrays.asList("+1234567890", "+1987654321", "+17778889999"));
        String newPhone = "+1555555555";
        System.out.println(calculateDiscount(phonesDataBase, newPhone));
    }

    public static int calculateDiscount (Set<String> phonesDataBase, String newPhone) {

        if(!phonesDataBase.contains(newPhone)) {
            return 15;
        } else {
            return 0;
        }
    }
}
