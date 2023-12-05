package com.java.Week10_WrapperClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SizeMethodExercise1 {
    public static void main(String[] args) {
       List<String> animalNames = new ArrayList<>(Arrays.asList("Lion", "Elephant", "Tiger", "Giraffe", "Leopard", "Zebra"));
        String specificLetter = "L";
        System.out.println(filterAnimals(animalNames, specificLetter ));


    }

    public static List<String> filterAnimals(List<String> animalNames, String specificLetter) {
        if (!specificLetter.matches("[a-zA-Z]")) {
            List<String> notAllowedList = new ArrayList<>();
            notAllowedList.add("Not allowed");
            return notAllowedList;
        }

        List<String> filteredList = new ArrayList<>();

        for(String animal : animalNames) {
            String lowerCaseAnimal = animal.toLowerCase();

            if(lowerCaseAnimal.startsWith(specificLetter.toLowerCase())) {
                filteredList.add(animal);
            }
        }

        return filteredList;
    }
}
