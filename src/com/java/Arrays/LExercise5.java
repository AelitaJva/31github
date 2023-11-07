package com.java.Arrays;

public class LExercise5 {

    public static void main(String[] args) {
        String[] runners = {"Alice", "Bob", "Charlie", "David", "Eve"};
        printRaceResults(runners);
    }

    public static void printRaceResults(String[] racers) {

        if (racers.length == 0 || racers == null) {
            System.out.println("No runners in the race");
        } else if (racers.length == 1) {
            System.out.println("One participant: " + racers[0]);
        } else {
            int winnerIndex = 0;
            int lastPlaceIndex = 0;


            for (int i = 1; i < racers.length; i++) {
                if (racers[i].length() > racers[winnerIndex].length()) {
                    winnerIndex = i;
                } else if (racers[i].length() < racers[lastPlaceIndex].length()) {
                    lastPlaceIndex = i;
                }
            }
            System.out.println("Winner: " + racers[winnerIndex]);
            System.out.println("Last Place: " + racers[lastPlaceIndex]);

        }
    }
}
