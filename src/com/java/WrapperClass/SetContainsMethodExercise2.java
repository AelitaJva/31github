package com.java.WrapperClass;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetContainsMethodExercise2 {
    public static void main(String[] args) {

        Set<String> leakedPasswords = new HashSet<>(Arrays.asList("password123", "qwerty", "12345678"));
        String password = "pAsSwOrD123";
        System.out.println(isSecurePassword(leakedPasswords, password));
    }

    public static boolean isSecurePassword(Set<String> leakedPasswords, String password) {

        if (password.length() < 8) {
            return false;
        }

        // convert the password to lowercase for case-sensitive comparison
        String lowerCasePassword = password.toLowerCase();

        if (leakedPasswords.contains(lowerCasePassword)) {
            return false;
        }

        // in any case return true
        return true;

    }
}
