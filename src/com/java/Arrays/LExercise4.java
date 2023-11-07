package com.java.Arrays;

import java.util.Arrays;

public class LExercise4 {
    public static void main(String[] args) {
        String[] toDoList = {"Buy groceries", "Call the doctor", "Finish the report", "Pay bills"};
        printLastTask(toDoList);
    }

    public static void printLastTask(String[] toDoList) {
        if (toDoList.length > 0) {
            String lastTask = toDoList[toDoList.length - 1];
            System.out.println("Last Task: " + lastTask);
        } else {
            System.out.println("Your to-do list is empty");
        }
    }
}

