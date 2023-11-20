package com.java.WrapperClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GetMethodExercise1 {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 2));
        int index1 = 3;
        System.out.println(getListElement(list1, index1));

    }

    public static int getListElement (List<Integer> listNumbers, int index) {

        if(index < 0 || index >= listNumbers.size()) {
            return -1;
        }
        return listNumbers.get(index);
    }
}
