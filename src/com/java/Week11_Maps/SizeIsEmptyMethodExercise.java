package com.java.Week11_Maps;

import java.util.HashMap;
import java.util.Map;

public class SizeIsEmptyMethodExercise {
    public static void main(String[] args) {
        String phoneNumbers = "023-456-7890, 555-5555, 0876543210, 0123456789";
        System.out.println(validatePhoneNumbers(phoneNumbers));
    }

    public static Map<String, String> validatePhoneNumbers (String phoneNumberList) {

        Map<String, String> newUpdatedPhoneNumbers = new HashMap<>();

        String[] phoneNumbers = phoneNumberList.split(",");

        int index = 0;

        for (String phoneNumber : phoneNumbers) {
            String cleanedPhoneNumber = phoneNumber.replaceAll("[^0-9]", ""); // Remove non-digits

            if (isValidPhoneNumber(cleanedPhoneNumber)) {
                newUpdatedPhoneNumbers.put(cleanedPhoneNumber, String.valueOf(index));
            }

            index++;
        }

        if (newUpdatedPhoneNumbers.isEmpty()) {
            newUpdatedPhoneNumbers.put("0", "EMPTY");
        }

        return newUpdatedPhoneNumbers;
    }

    private static boolean isValidPhoneNumber(String phoneNumber) {
        return phoneNumber.length() == 10 && phoneNumber.startsWith("0") && !phoneNumber.endsWith("9");
    }


}
