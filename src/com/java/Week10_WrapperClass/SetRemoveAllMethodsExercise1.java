package com.java.Week10_WrapperClass;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetRemoveAllMethodsExercise1 {
    public static void main(String[] args) {
        String str1 = "Each word here is prepared to practice Collections";
        String str2 = "Collections word is here";

        String[] result1 = compareWordCollections(str1, str2);
        System.out.println(Arrays.toString(result1)); // Should print []

        String str3 = "Some word is here";
        String[] result2 = compareWordCollections(str1, str3);
        System.out.println(Arrays.toString(result2)); // Should print [here, is, word]
    }

    public static String[] compareWordCollections(String str1, String str2) {

        //  Set<String> set1 = new HashSet<>(Arrays.asList(str1.split("\\s+")));
        Set<String> set1 = new HashSet<>(Arrays.asList(str1.split("\\s+")));
        Set<String> set2 = new HashSet<>(Arrays.asList(str2.split("\\s+")));

        if (set1.containsAll(set2)) {
            return new String[0];
        } else {
            set1.retainAll(set2);
//            return set1.toArray(new String[set1.size()]);  = new version of String[0]
            return set1.toArray(new String[0]);
        }
    }
}
