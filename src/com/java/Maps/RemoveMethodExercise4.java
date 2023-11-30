package com.java.Maps;

import java.util.HashMap;
import java.util.Map;

public class RemoveMethodExercise4 {
    public static void main(String[] args) {
        Map<String, Integer> visitors = new HashMap<>(Map.of("Visitor1", 15, "Visitor2", 45, "Visitor3", 45));
        String removeVisit = "Visitor1";
        System.out.println(cleanupVisitorLog(visitors, removeVisit));

    }

    public static Map<String, Integer> cleanupVisitorLog(Map<String, Integer> visitors, String removeVisit) {


        if (visitors.containsKey(removeVisit)) {
            int daysSinceLastVisit = visitors.get(removeVisit);

            if (daysSinceLastVisit > 30) {
                visitors.remove(visitors);
            }
        }

        return visitors;
    }
}
