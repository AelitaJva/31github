package com.java.Week10_WrapperClass;

import java.util.*;

public class SetRetainAllMethod {
    public static void main(String[] args) {

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
            System.out.println("Ready to send all registered Speakers onboard docs");
        } else {
            System.out.println("Someone is trying to sneak in ... please double all registered speakers and remove the ones" +
                    "who are not invited");

            List<String> speakersToRemove = new ArrayList<>();
            for (String speaker : registeredSpeakers) {

                if (!invitedSpeakers.contains(speaker)) {
                    System.out.println(speaker + " is trying to sneak in");
                    System.out.println("removing the " + speaker );
                    speakersToRemove.add(speaker);
                }
            }
            registeredSpeakers.removeAll(speakersToRemove);

        }
        System.out.println(registeredSpeakers);

        System.out.println(registeredSpeakers);


        System.out.println("================================================");

        Set<String> invitedSpeakers2 = new HashSet<>();
        invitedSpeakers2.add("Elon");
        invitedSpeakers2.add("Jeff");
        invitedSpeakers2.add("Steve");
        invitedSpeakers2.add("Michele");


        Set<String> registeredSpeakers2 = new HashSet<>();
        registeredSpeakers2.add("Jeff");
        registeredSpeakers2.add("Michele");
        registeredSpeakers2.add("Bill");


        if (invitedSpeakers2.containsAll(registeredSpeakers2)) {
            System.out.println("2 - Ready to send all registered Speakers onboard docs");
        } else {
            registeredSpeakers2.retainAll(invitedSpeakers2);
        }

        System.out.println(registeredSpeakers2);

    }
}
