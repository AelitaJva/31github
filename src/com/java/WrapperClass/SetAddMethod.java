package com.java.WrapperClass;

import java.util.Set;
import java.util.HashSet;

public class SetAddMethod {
    public static void main(String[] args) {


        // method returns true if the set does not contain the specified element
        // and returns false if the set already contains the specified element

        Set<String> names = new HashSet<>();
        boolean result1 = names.add("Elon");
        boolean result2 = names.add("Steve");

        System.out.println(result1);
        System.out.println(result2);

        boolean result3 = names.add("Elon");
        System.out.println(result3);

        System.out.println(names);


        Set<String> usernames = new HashSet<>();
        usernames.add("elon@spacex.com");
        usernames.add("bill@microsoft.com");

        if(!usernames.add("elon@spacex.com")) {
            System.out.println("The username is already taken");
        }

    }
}
