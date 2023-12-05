package com.java.Week10_WrapperClass;

import java.util.ArrayList;
import java.util.List;

public class RemoveMethodExercise2 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        ArrayList<Integer> list2 = new ArrayList<>(List.of(10, 20, 10, 35, 22, 40, 10));
        ArrayList<Integer> list3 = new ArrayList<>(List.of(5, 1, 5, 20, -99, 0, 1, 6, 5, 1));

        System.out.println(removeDuplicates(list1)); // Returns [1, 2, 3, 4, 5]
        System.out.println(removeDuplicates(list2)); // Returns [20, 35, 22, 40]
        System.out.println(removeDuplicates(list3)); // Returns [5, 1, 20, -99, 0, 6]



    }
    public static List<Integer> removeDuplicates (List<Integer> numbers) {


        for (int i = 0; i < numbers.size(); i++) {

            int current = numbers.get(i);

            for (int j = 1 + i; j < numbers.size(); j++) {
                if(current == numbers.get(j)) {
                    numbers.remove(j);
                    j--;
                }
            }
        }

        return numbers;
    }
}
