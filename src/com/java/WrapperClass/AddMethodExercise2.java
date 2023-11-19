package com.java.WrapperClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddMethodExercise2 {
    public static void main(String[] args) {
        List<String> touristsList = new ArrayList<>(Arrays.asList("Anna Smith", "John Johnson", "Maria Garcia", "Michael Brown"));
        String newTourist = "Sarah Martinez";
        System.out.println(touristsList);

        List<String> updatedList = registerParticipants(touristsList, newTourist);
        System.out.println(updatedList);
    }

    public static List<String> registerParticipants(List<String> registeredParticipants, String newParticipant) {

        registeredParticipants.add(newParticipant);
        return registeredParticipants;
    }
}
