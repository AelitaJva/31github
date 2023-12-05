package com.java.Week10_WrapperClass;

import java.util.ArrayList;
import java.util.List;

public class ArrayListAddMethod {
    public static void main(String[] args) {

        // 1. add(element); => it adds the given element to end of arrayList
        // 2. add(int index,element); => adds the specified element at the specified index in the list
        // the index should exist in the array, in any case will get indexOutOfBoundException error
        // second method gives you flexibility to add an element at a certain index,
        // and everything moves to the right position
        // but you don't use it over to use much, bc effects the precision of the task



        List<String> list = new ArrayList<>();
        list.add("Lombo");
        System.out.println(list);

        list.add("Ferrari");
        System.out.println(list);

        list.add("Bugatti");
        list.add(0, "JJJ");
        System.out.println(list);

        List<Double> monthlyRevenue = new ArrayList<>();

        monthlyRevenue.add(15555.66);
        System.out.println(monthlyRevenue);

        monthlyRevenue.add(679345.67);
        System.out.println(monthlyRevenue);


        // 2. index,element

        List<Integer> numList = new ArrayList<>();
        numList.add(23);
        numList.add(13);
        numList.add(59);
        System.out.println(numList);

        numList.add(1, 56);
        System.out.println(numList);


    }
}
