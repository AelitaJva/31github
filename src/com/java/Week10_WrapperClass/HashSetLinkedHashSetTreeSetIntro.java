package com.java.Week10_WrapperClass;

import java.util.*;

public class HashSetLinkedHashSetTreeSetIntro {
    public static void main(String[] args) {
        // Create a list of fruits
        List<String> listOfFruits = Arrays.asList("Dragon fruit", "Cherry", "Banana", "Apple");


        /* HashSet does not maintain insertion order, eliminates duplicates,
        and provides constant-time performance for basic operations */
        HashSet<String> hashExample = new HashSet<>(listOfFruits);
        /* LinkedHashSet maintains the insertion order, eliminates duplicates,
        and has slightly slower performance compared to HashSet */


        LinkedHashSet<String> linkedHashExample = new LinkedHashSet<>(listOfFruits);
        /* TreeSet sorts the elements in natural order (if they are Comparable)
        or by a Comparator provided at TreeSet construction time */


        TreeSet<String> treeExample = new TreeSet<>(listOfFruits);

        System.out.println("HashSet:\t" + hashExample);
        System.out.println("LinkedHashSet:\t" + linkedHashExample);
        System.out.println("TreeSet:\t" + treeExample);
    }
}
