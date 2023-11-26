package com.java.WrapperClass;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetContainsAllMethod {
    public static void main(String[] args) {

        Set<Integer> nums1 = new HashSet<>(Arrays.asList(1, 2, 3, 45, 64));
        Set<Integer> nums2 = new HashSet<>(Arrays.asList(2, 64));

        // containsAll(takesAnotherSet)
        // return true if set1Contains all elements in the Set 2

        boolean result = nums1.contains(nums2);
        System.out.println(result);

        // conference
        // invited 5 speakers
        // Elon, Jeff, Steve, Michele
        // registered speakers

//        Set<String> invitedSpeakers = new HashSet<>(Arrays.asList("Elon", "Jeff", "Steve", "Michele"));
//        Set<String> registeredSpeakers = new HashSet<>(Arrays.asList("Jeff", "Michele"));

        Set<String> invitedSpeakers = new HashSet<>();
        invitedSpeakers.add("Elon");
        invitedSpeakers.add("Jeff");
        invitedSpeakers.add("Steve");
        invitedSpeakers.add("Michele");


        Set<String> registeredSpeakers = new HashSet<>();
        registeredSpeakers.add("Jeff");
        registeredSpeakers.add("Michele");
        registeredSpeakers.add("Bill");


        if (invitedSpeakers.containsAll(registeredSpeakers)) {
            System.out.println("Ready to send all registered Speakers onboarding docs");
        } else {
            System.out.println("Someone is trying to sneak in ... please double all registered speakers and remove the ones" +
                    "who are not invited");
        }


    }
}
