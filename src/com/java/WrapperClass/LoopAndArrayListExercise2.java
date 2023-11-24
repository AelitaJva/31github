package com.java.WrapperClass;

import java.util.ArrayList;
import java.util.Arrays;

public class LoopAndArrayListExercise2 {
    public static void main(String[] args) {
        ArrayList<Integer> population = new ArrayList<>(Arrays.asList(100000, 120000, 150000));
        printPopulationData(population);
    }

    public static void printPopulationData (ArrayList<Integer> populationList) {

        for(int i=0; i< populationList.size(); i++) {

            System.out.println(i + " - " + populationList.get(i));
        }
    }
}
