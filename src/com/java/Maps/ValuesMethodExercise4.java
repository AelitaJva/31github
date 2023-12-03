package com.java.Maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ValuesMethodExercise4 {
    public static void main(String[] args) {
        Map<String, String> attendanceList = new HashMap<>(Map.of("Student1","2023-10-20", "Student2","2023-10-05", "Student3","2023-10-05"));
        String date = "2023-10-05";
        System.out.println(countPresentOnDate(attendanceList, date));
    }

    public static int countPresentOnDate(Map<String, String> students, String date) {

        Collection<String> dates = students.values();
        int count = 0;

        for (String currentDate : dates) {
            if (currentDate.equals(date)) {
                count++;
            }
        }

        return count;
    }
}
