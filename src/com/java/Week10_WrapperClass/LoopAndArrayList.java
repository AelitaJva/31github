package com.java.Week10_WrapperClass;

import java.util.ArrayList;
import java.util.List;

public class LoopAndArrayList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Lambo");
        list.add("Ferrari");
        list.add("Bugatti");
        System.out.println(list);

        // you can use a traditional for loops
        // for each lop
        // while loop


        // 1. for loop (with specific indexes)
        for (int i = 0; i < list.size(); i++) {
            // arr[i]
            //list.get(i);
            System.out.println(list.get(i));
        }


        // 2. for each loop (without specific indexes), and this way is much clear
        for (String var : list) {
            System.out.println(var);
        }

        // skip ferrari

        for (int i = 0; i < list.size(); i++) {
            // arr[i]
            //list.get(i);

            String var = list.get(i);
            if (!var.equalsIgnoreCase("Ferrari")) {
                System.out.println(var);
            }
        }


        for (String var : list) {
            if(!var.equalsIgnoreCase("Ferrari")) {
                System.out.println(var);
            }
        }
    }
}
