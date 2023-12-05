package com.java.Week10_WrapperClass;

import java.util.*;

public class InitializingSets {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        // set can take different forms: hash, tree, linkedHash (polymorphism)
        // hashset = unique, unordered
        // treeset = unique, ordered based on logic you provided
        // linkedhashset = unique, ordered based on insertion order

        Set<String> namesSet = new HashSet<>();
        Set<String> treeSet = new TreeSet<>();
        Set<String> linkedSet = new LinkedHashSet<>();


        List<String> list = new ArrayList<>();
        list.add("Salam");
        list.add("Hello");
        list.add("Merhaba");
        list.add("Salam Aleikum");
        list.add("Salam");
        System.out.println(list);


        // convert list into set
        // if in list any duplicated element, set will remove it from the set and returns only unique elements
        // here output will be definitely in unordered format from original list order

        Set<String> set = new HashSet<>(list);
        System.out.println(set);


        // the order will be the same as in original
        Set<String> set2 = new LinkedHashSet<>(list);
        System.out.println(set2);
    }
}
