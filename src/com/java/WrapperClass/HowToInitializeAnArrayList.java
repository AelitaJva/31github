package com.java.WrapperClass;

import java.util.ArrayList;
import java.util.List;

public class HowToInitializeAnArrayList {
    public static void main(String[] args) {
        // evolution of arrayList initialization

        // rule 1: you must have import statement for ArrayLists
        // import java.util.ArrayList;


        // arrayList can include mixed values, data types
        // the problem here is with the following the initialization is that
        // 1. I am not specifying the data type of elements
        ArrayList list1 = new ArrayList();

        // add(); will add elements to the end of the arrayList
        list1.add("Elon");
        System.out.println(list1);
        list1.add(1);
        System.out.println(list1);


        // when you are initialize ArrayList you don't specify the size
        // I am only going to store one data type
        // initialize and restrict to only String elements
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Steve");
        System.out.println(list2);
        //  list2.add(2);  // not allowed: compilation error: bc this array can hold only String


        list2.add("Michelle");
        System.out.println(list2);


        // initialize with only one diamond
        // once you declare it as String, you don't need to put it in the initialization part: ArrayList<String> list2 = new ArrayList<String>();


        // arrayList can work only with wrapper classes(objects)
        // here don't put the d.t inside second diamond, bc there is no change at all from functional perspective
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(3);
        list3.add(345);
        list3.add(3534);
        list3.add(3234);
        System.out.println(list3);
        // list3.add("String");  ---> only integers can be allowed


        // 2. Initialize with interface
        // ArrayList is an implementation of List interface
        // this is the industry standard, yuo need to initialize arrayList always in this way
        List<String> list4 = new ArrayList<>();
        list4.add("Hello");
        list4.add("World");
        System.out.println(list4);


    }
}
