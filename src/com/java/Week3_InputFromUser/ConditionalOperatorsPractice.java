package com.java.Week3_InputFromUser;

import java.util.Scanner;

public class ConditionalOperatorsPractice {
    public static void main(String[] args) {
         // credit valid numbers are between 300 and 850 inclusive
        // write a program that tell us whether the number is a valid credit score

        int creditScore = 980;
        boolean isValidCreditScore = creditScore >= 300 && creditScore <= 850;
        System.out.println(isValidCreditScore);

        System.out.println("==============================================================");

        // a person must be a citizen
        // and must bed over 18 y.o in order to be able to vote

        boolean isCitizen = false;
        int age = 20;
                    // false
        boolean canVote = isCitizen && age >= 18;
        System.out.println("Can we vote: " + canVote);

        System.out.println("==============================================================");

        // must be married
        // age must be between 21 and 35
        // weight must be between 70 and 80
        // height should be taller than 180

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your age");
        int agePerson = sc.nextInt();

        System.out.println("Please enter your height");
        double height = sc.nextDouble();

        System.out.println("Please enter your weigh");
        double weight = sc.nextDouble();

        System.out.println("Are you married?");
        boolean isMarried = sc.nextBoolean();

        boolean isJamesBond = age >= 21 && age <= 35
                && height > 180  && weight >= 70 && weight <= 80
                && isMarried;

        System.out.println("Is person a James Bonk? " + isJamesBond);
    }

}
