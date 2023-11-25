package com.java.WrapperClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListPracticeExercise1 {
    public static void main(String[] args) {
        ArrayList<Integer> scores = new ArrayList<>(Arrays.asList(78, 92, 85, 64));
        System.out.println(calculateStatistics(scores).toString());
    }

    public static ArrayList<Integer> calculateStatistics(ArrayList<Integer> scores) {

        if (scores.size() == 0) {
            ArrayList<Integer> emptyArrayList = new ArrayList<>(Arrays.asList(0, 0, 0));
            return emptyArrayList;
        }

        int highestScore = scores.get(0);
        int lowestScore = scores.get(0);


        for (int i = 0; i < scores.size(); i++) {
            int score = scores.get(i);
            if (score > highestScore) {
                highestScore = score;
            }
            if (score < lowestScore) {
                lowestScore = score;
            }
        }

        int averageScore = (highestScore + lowestScore) / 2;

        ArrayList<Integer> updateListWithStatistics = new ArrayList<>();
        updateListWithStatistics.add(averageScore);
        updateListWithStatistics.add(highestScore);
        updateListWithStatistics.add(lowestScore);

        return updateListWithStatistics;
    }
}
