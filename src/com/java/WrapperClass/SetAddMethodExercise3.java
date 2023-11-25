package com.java.WrapperClass;

import java.util.*;

public class SetAddMethodExercise3 {
    public static void main(String[] args) {

        LinkedHashSet recipe = new LinkedHashSet<>(Arrays.asList("flour", "sugar"));
        String newIngredient = "water";
        System.out.println(addIngredient(recipe, newIngredient));
    }

    public static LinkedHashSet<String> addIngredient (LinkedHashSet<String> ingredients, String newIngredient) {

        LinkedHashSet<String> updatedRecipe = new LinkedHashSet<>(ingredients);
        updatedRecipe.add(newIngredient);
        return updatedRecipe;
    }
}
