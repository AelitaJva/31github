package com.java.Maps;

import java.util.HashMap;
import java.util.Map;

public class SizeEmptyMethodsExercise2 {
    public static void main(String[] args) {
        Map<String, String> registrationData = new HashMap<>(Map.of("JohnDoe", "NotGoodPassword123"));
        String result = registerUser(registrationData);
        System.out.println(result);
    }

    public static String registerUser(Map<String, String> registrationData) {

        if (registrationData.isEmpty()) {
            return "Username and password cannot be empty";
        }

        if (registrationData.size() != 1) {
            return "Invalid registration data";
        }
        return "Registration successful";

    }
}
