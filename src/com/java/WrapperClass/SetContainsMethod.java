package com.java.WrapperClass;

import java.util.HashSet;
import java.util.Set;

public class SetContainsMethod {
    public static void main(String[] args) {

        Set<String> usernames = new HashSet<>();
        usernames.add("elon@spacex.com");
        usernames.add("bill@microsoft.com");

        if(usernames.contains("alex@microsoft.com")) {
            System.out.println("Contains");            // will return return statement if only that condition is true
        }
    }
}
