package com.java.Week10_WrapperClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SetMethodExercise3 {
    public static void main(String[] args) {

        // sentence work table keyboard run program word dawn
        //
        //word
        //
        //sword

        List<String> sentence = new ArrayList<>(Arrays.asList("sentence", "work", "table", "keyboard", "run", "program", "word", "dawn"));        String target = "word";
        String replacement = "sword";
        System.out.println(updateCart(sentence, target, replacement));

    }

    public static List<String> updateCart (List<String> sentence, String target, String replacement) {

        List<String> updatedList = new ArrayList<>();

        if(sentence.size() == 0) {
            return updatedList;
        }



        for(int i=0; i<sentence.size(); i++) {
            String currentWord = sentence.get(i);

            if(currentWord.equalsIgnoreCase(target)) {
                updatedList.add(replacement);
            } else {
                updatedList.add(currentWord);
            }
        }


        return updatedList;
    }
}
