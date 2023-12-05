package com.java.Week10_WrapperClass;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExercise1 {
    public static void main(String[] args) {
        String str = "Hello 123 World!";
        System.out.println(addToList(str));
    }

    public static List<String> addToList(String str) {

        List<String> list1 = new ArrayList<>();
        if(str.isEmpty() || str == null) {
            return list1;
        }

        list1.add(str);
        return list1;
    }
}
