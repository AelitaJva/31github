package com.java.WrapperClass;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class SetRemoveMethodExercise1 {
    public static void main(String[] args) {
        LinkedHashSet<String> usersWithSubscriptions = new LinkedHashSet<>(Arrays.asList("User1", "User2", "User3", "User4"));
        String userToRemoveSubscription = "User3";
        System.out.println(removeSubscriber(usersWithSubscriptions, userToRemoveSubscription));
    }

    public static LinkedHashSet<String> removeSubscriber (LinkedHashSet<String> subscribers, String userID) {
        subscribers.remove(userID);
        return subscribers;
    }
}
