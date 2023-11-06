package com.java.Arrays;

public class EExercise4 {
    public static void analyzeMonthlyBudget(double[] incomes, double[] expenses) {

        for (int i = 0; i < incomes.length; i++) {

            double surplus = 0.0;
            double deficit = 0.0;

            for (int j = 0; j < expenses.length; j++) {
                if (incomes[i] > expenses[j]) {
                    surplus = incomes[i] - expenses[j];
                } else {
                    deficit = expenses[j] - incomes[i];
                }
            }

            System.out.println("Month " + (i + 1) + ": " + "Surplus of $" + surplus);
            System.out.println("Month " + (i + 1) + ": " + "Deficit of $" + deficit);
        }


        double totalIncome = 0.0;
        for (double tIncome : incomes) {
            totalIncome += tIncome;
        }

        double totalExpenses = 0.0;
        for (double tExpenses : expenses) {
            totalExpenses += tExpenses;
        }

        double totalForTheYear = totalIncome - totalExpenses;
        System.out.println("Total Surplus/Deficit for the Year: $" + totalForTheYear);
    }

    public static void main(String[] args) {
        double[] income = {2500.0, 2400.0, 2200.0, 2100.0, 2300.0, 2400.0, 2500.0, 2600.0, 2700.0, 2800.0, 2500.0, 2400.0};
        double[] expenses = {2600.0, 2700.0, 2800.0, 2900.0, 2800.0, 2600.0, 2400.0, 2300.0, 2400.0, 2500.0, 2700.0, 2600.0};

        analyzeMonthlyBudget(income, expenses);
    }
}

