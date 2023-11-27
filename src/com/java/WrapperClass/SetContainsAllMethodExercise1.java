package com.java.WrapperClass;

import java.util.Set;

public class SetContainsAllMethodExercise1 {
    public static void main(String[] args) {
        Set<String> recipe1 = Set.of("Ingredient1", "Ingredient2", "Ingredient3");
        Set<String> recipe2 = Set.of("Ingredient2", "Ingredient3", "Ingredient4");

        matchIngredients(recipe1, recipe2);
    }

    public static void matchIngredients(Set<String> recipe1, Set<String> recipe2) {
        if (recipe1.containsAll(recipe2)) {
            System.out.println("Recipe [1] contains all ingredients from Recipe [2].");
        } else if (recipe2.containsAll(recipe1)) {
            System.out.println("Recipe [2] contains all ingredients from Recipe [1].");
        } else {
            System.out.println("Neither recipe contains all ingredients from the other.");
        }
    }
}
