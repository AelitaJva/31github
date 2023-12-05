package com.java.Week10_WrapperClass;

public class BExercise3 {
    public static void main(String[] args) {
// Example #1
        int age1 = 25;
        int drivingExperience1 = 3;
        double income1 = 45000.00;
        System.out.println(decideRentalApproval(age1, drivingExperience1, income1));  // Output: true

        // Example #2
        int age2 = 22;
        int drivingExperience2 = 1;
        double income2 = 40000.00;
        System.out.println(decideRentalApproval(age2, drivingExperience2, income2));
    }

    public static String decideRentalApproval(int age, int drivingExperience, double income) {


        if (age >= 21 && drivingExperience >= 2 && income >= 40.000) {
            return "true";
        } else {
            return "false";
        }

    }
}
