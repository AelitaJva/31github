package com.java.WrapperClass;

import java.util.HashSet;
import java.util.Set;

public class SetThroughLoop {
    public static void main(String[] args) {

        Set<String> usernames = new HashSet<>();
        usernames.add("abc@apple.com");
        usernames.add("bcs@google.com");
        usernames.add("oab@amazon.com");


        // no specific index because of unordered elements
        // set collection is a collection of unordered elements,
        // and it isn't possible to get an access an element based on index


        for(String username : usernames) {
            System.out.println(username);
        }

    }
}
