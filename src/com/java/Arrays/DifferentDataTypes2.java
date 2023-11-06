package com.java.Arrays;

public class DifferentDataTypes2 {
    public static void main(String[] args) {

        double[] ratings = {4.5, 4.6, 5.6, 3.5};
        System.out.println(ratings[1]);


        double[] salaries = new double[4];
        // int -> -
        // double -> 0.0
        // char ->
        // string -> null
        // nul is basically means nothing
        // boolean -> false
        System.out.println(salaries[0]);


        char[] grades = {'A', 'B', 'C', 'A', 'F', 'D'};
        System.out.println(grades[3]);
        char[] grades2 = new char[5];
        System.out.println(grades2[0]);


        String[] employeeNames = {"Aelita", "Dastan", "Ulan", "Avaz"};
        System.out.println(employeeNames[0]);
        String[] employeeSurnames = new String[7];
        System.out.println(employeeSurnames[4]);


        boolean[] answers = {true, false, true, false, true};
        System.out.println(answers[1]);
        boolean[] questions = new boolean[7];
        System.out.println(questions[3]);

    }
}
