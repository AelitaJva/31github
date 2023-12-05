package com.java.Week10_WrapperClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> taskList = new ArrayList<>();
        boolean isRunning = true;


        do {
            System.out.println("What do you want to do?");
            System.out.println("1. Add a task");
            System.out.println("2. Complete a task");
            System.out.println("3. Print all tasks");
            System.out.println("4. Quit");

            String input = sc.nextLine();

            if (input.equalsIgnoreCase("add a task") || input.equalsIgnoreCase("1")) {
                System.out.println("enter your task: ");
                String task = sc.nextLine();
                taskList.add(task);
            } else if (input.equalsIgnoreCase("complete a task") || input.equalsIgnoreCase("2")) {
                System.out.println("enter the task you completed: ");
                String taskCompleted = sc.nextLine();
                // taskList.remove(taskCompleted);

                for (int i = 0; i < taskList.size(); i++) {
                    if (taskList.get(i).equalsIgnoreCase(taskCompleted)) {
                        taskList.remove(i);
                    }
                }
                // remove(int index)
                // remove (element)
                // in two ways you can remove the element
            } else if (input.equalsIgnoreCase("print all tasks") || input.equalsIgnoreCase("3")) {
                System.out.println(taskList);
            } else if (input.equalsIgnoreCase("quit") || input.equalsIgnoreCase("4")) {
                isRunning = false;
            } else {

            }

        } while (isRunning);
    }


}
