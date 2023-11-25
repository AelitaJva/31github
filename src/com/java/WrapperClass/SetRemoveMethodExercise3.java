package com.java.WrapperClass;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetRemoveMethodExercise3 {
    public static void main(String[] args) {

        Set<String> userList = new HashSet<>(Arrays.asList("alice", "bob", "carol"));
        String oldUsername = "bob";
        String newUsername = "dave";
        System.out.println(updateUserList(userList, oldUsername, newUsername));
    }

    public static Set<String> updateUserList(Set<String> userList, String oldUserName, String newUserName) {

        boolean result = userList.remove(oldUserName);

        if(result == true) {
            userList.remove(oldUserName);
            userList.add(newUserName);
        } else {
            return userList;
        }

        return userList;
    }
}
