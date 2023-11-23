package com.java.WrapperClass;

import java.util.ArrayList;

public class ArrayListSetMethod {
    public static void main(String[] args) {
        ArrayList<String> colorList = new ArrayList<String>(5);

        colorList.add("White");
        colorList.add("Black");
        colorList.add("Red");
        colorList.add("White");
        colorList.add("Yellow");

        colorList.set(2, new String("Violet"));

        for(int i=0; i<5; i++) {
            System.out.println(colorList.get(i).toString());
        }
    }
}
