package com.java.WrapperClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveMethodExercise1 {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(10, -5, 7, -2, 0));
        System.out.println(removeNegativeNumbers(numbers));
    }
    public static List<Integer> removeNegativeNumbers (List<Integer> numbers) {

        for (int i = numbers.size() -1; i>= 0; i--) {
            if(numbers.get(i) < 0) {
                numbers.remove(i);
            }
        }

        return numbers;
    }
}
