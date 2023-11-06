package com.java.Arrays;

public class JExercise3 {
    public static void main(String[] args) {
        double[] dailyExpenses = {50.0, 75.5, 120.75, 90.25, 150.0, 85.5, 200.0};
        findMostExpensiveDay(dailyExpenses);
    }

    public static void findMostExpensiveDay (double[] arr) {

        double maxExpenses = arr[0];
        int dayWithMaxExpenses = 1;

        for(int i=2; i<arr.length; i++) {
            if(maxExpenses < arr[i]) {
                maxExpenses = arr[i];
                dayWithMaxExpenses = i + 1;
            }
        }

        System.out.println("The highest expenses were $" + maxExpenses + " on day " + dayWithMaxExpenses);
    }
}
