package com.java.Week11_Maps;

import java.util.HashMap;
import java.util.Map;

public class SetKeyExercise1 {
    public static void main(String[] args) {
        Map<String, Integer> scoreboard = new HashMap<>(Map.of("Bob",1200, "Alice",950, "Charlie",800, "David",1050));

        displayScoreboard(scoreboard);
    }

    public static void displayScoreboard(Map<String, Integer> scoreboard) {


        //Set<String> setOfPlayerNames = scoreboard.keySet();

        int index = 0;
        for(String name : scoreboard.keySet()) {
            System.out.println(index + ". " + name);
            index++;
        }
    }
}
