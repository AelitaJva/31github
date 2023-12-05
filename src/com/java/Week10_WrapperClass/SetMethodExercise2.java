package com.java.Week10_WrapperClass;

import java.util.ArrayList;
import java.util.List;

public class SetMethodExercise2 {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(4);
        numbers.add(66);
        numbers.add(80);
        numbers.add(45);
        numbers.add(-90);
        numbers.add(42);
        numbers.add(0);
        numbers.add(8);

        System.out.println(manipulateIntegers(numbers));
    }

    public static List<Integer> manipulateIntegers(List<Integer> numbers) {

        List<Integer> updatedList = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++) {
            int currentNumber = numbers.get(i);

            if (currentNumber % 2 == 0) {
                numbers.set(i, currentNumber * 2);
            } else {
                numbers.set(i, currentNumber / 2);
            }

            if (currentNumber % 5 == 0) {
                numbers.remove(i);
                i--;  // When you remove an element from the list, the size of the list decreases,
            }
        }

        return numbers;
    }
}
