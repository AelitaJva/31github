package com.java.Maps;

import java.util.HashMap;
import java.util.Map;

public class RemoveMethodExercise3 {
    public static void main(String[] args) {
        Map<Integer, String> toDo = new HashMap<>(Map.of(1, "Buy groceries", 2, "Finish project", 3, "Schedule the Interview"));
        Integer removeItem = 1;
        System.out.println(toDo);
        System.out.println(removeOutdated(toDo, removeItem));
    }

    public static Map<Integer, String> removeOutdated (Map<Integer, String> toDo, Integer removedID) {

        toDo.remove(removedID);
        return toDo;
    }

}
