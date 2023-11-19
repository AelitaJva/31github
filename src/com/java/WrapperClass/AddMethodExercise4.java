package com.java.WrapperClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddMethodExercise4 {
    public static void main(String[] args) {
        List<String> employees = new ArrayList<>(Arrays.asList("John Smith", "Mary Johnson", "James Brown"));
        String newEmployee = "Emily Davis";
        System.out.println(addEmployee(employees, newEmployee));
    }

    public static List<String> addEmployee(List<String> employees, String newEmployee) {

        employees.add(newEmployee);
        return employees;
    }
}
