package com.java.Arrays;

public class EExercise2 {

    public static double calculateTotalCost(int[] quantities, String[] names, double[] costs) {

        if (names.length != quantities.length || names.length != costs.length) {
            return -1.0;
        }

        double totalCost = 0.0;

        for (int i = 0; i < quantities.length; i++) {
            if (quantities[i] < 0 || costs[i] < 0) {
                return 0.0;
            }

            totalCost += quantities[i] * costs[i];
        }
        return totalCost;
    }

    public static void main(String[] args) {
        int[] quantities1 = {2, 3, 4};
        String[] itemNames1 = {"apple", "banana", "orange"};
        double[] itemCosts1 = {0.5, 0.25, 0.75};
        System.out.println(calculateTotalCost(quantities1, itemNames1, itemCosts1)); // Should print 4.75

        int[] quantities2 = {1, 0, 2};
        String[] itemNames2 = {"pizza", "spaghetti", "soda"};
        double[] itemCosts2 = {10.0, 8.0, 2.0};
        System.out.println(calculateTotalCost(quantities2, itemNames2, itemCosts2)); // Should print 14.0

        int[] quantities3 = {1, 2, 3};
        String[] itemNames3 = {"shirt", "pants", "shoes"};
        double[] itemCosts3 = {20.0, -10.0, 30.0};
        System.out.println(calculateTotalCost(quantities3, itemNames3, itemCosts3)); // Should print 0.0

        int[] quantities4 = {1, 2, 3};
        String[] itemNames4 = {"shirt", "pants"};
        double[] itemCosts4 = {20.0, 30.0, 40.0};
        System.out.println(calculateTotalCost(quantities4, itemNames4, itemCosts4)); // Should print -1.0
    }

}
