package com.java.WrapperClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class RemoveMethodExercise3 {

    public static void main(String[] args) {
        List<String> guests = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie"));
        String checkedOutGuest = "Bob";

        System.out.println(checkOutGuests(guests, checkedOutGuest));
    }

    public static List<String> checkOutGuests(List<String> guests, String guestName) {

        for (int i = 0; i < guests.size(); i++) {
            String currentGuestName = guests.get(i);

            if (currentGuestName.equals(guestName)) {
                guests.remove(i);
                i--;
            }
        }

        return guests;
    }


    List<String> guests = new ArrayList<>();
    ArrayList <String> students = new ArrayList<>();
}
