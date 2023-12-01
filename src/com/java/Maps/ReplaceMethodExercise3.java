package com.java.Maps;

import java.util.HashMap;
import java.util.Map;

public class ReplaceMethodExercise3 {
    public static void main(String[] args) {
        Map<String, String> employees = new HashMap<>(Map.of("E101","John Doe,Manager,60000", "E102","Jane Smith,Engineer,75000"));
        String employeeID = "E101";
        String newInfo = "John Doe,Manager,70000";

        System.out.println(updateEmployeeInfo(employees, employeeID, newInfo));
    }

    public static Map<String, String> updateEmployeeInfo(Map<String, String> employees, String employeeID, String newInfo) {

        if(!employees.containsKey(employeeID)) {
            employees.put(employeeID, newInfo);
        } else {
            employees.replace(employeeID, newInfo);
        }

        return employees;
    }
}
