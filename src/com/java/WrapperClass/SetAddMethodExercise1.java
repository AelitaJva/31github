package com.java.WrapperClass;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class SetAddMethodExercise1 {

    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(uniqueCharacters(str));
    }


    public static LinkedHashSet<Character> uniqueCharacters (String str) {

        List<Character> list = new ArrayList<>();

        for(int i=0; i<str.length(); i++) {
            char character = str.charAt(i);
            list.add(character);
        }

        LinkedHashSet<Character> characters = new LinkedHashSet<>(list);
        return characters;
    }
}
