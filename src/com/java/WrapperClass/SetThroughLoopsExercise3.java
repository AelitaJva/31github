package com.java.WrapperClass;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetThroughLoopsExercise3 {

    public static void main(String[] args) {
        String message = "Get rich quick with our lottery deals!";
        Set<String> spamWordsList = new HashSet<>(Arrays.asList("lottery", "rich", "gun", "drugs"));
        System.out.println(filterSpam(message, spamWordsList));
    }

    public static boolean filterSpam(String message, Set<String> spamWordsList) {


        for(String spam : spamWordsList) {
          if(message.toLowerCase().contains(spam.toLowerCase())) {
              return true;
          }
        }

        return false;
    }
}
