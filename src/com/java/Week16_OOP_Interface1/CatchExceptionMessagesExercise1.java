package com.java.Week16_OOP_Interface1;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class CatchExceptionMessagesExercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner("");
        String nextElement = readNextElement(scanner);
        System.out.println(nextElement);
    }

    public static String readNextElement(Scanner scanner) {

        try {
            return scanner.next();
        } catch (NoSuchElementException e) {
            System.out.println("Error: No more elements to read.");
            return "";
        }

    }
}
