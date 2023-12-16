package com.java.Week16_OOP_Interface1;

import com.sun.source.tree.NewArrayTree;

import javax.lang.model.element.Element;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FinallyBlockExercise {
    //private static ArrayList<Object> filteredResult = new ArrayList<>();

    public static void main(String[] args) {
        Object[] objects = {50.1, 25.9, 80.0, 0.1, 'a', 123, 3.14, true, -5};
        double threshold = 2.5;

        ArrayList<Object> result = filterGreaterValues(objects, threshold);
        if (result != null) {
            System.out.println("Filtered Result: " + Arrays.toString(new ArrayList[]{result}));
        }
    }

    public static ArrayList<Object> filterGreaterValues(Object[] objects, double threshold) {

        List<Object> filteredResult = new ArrayList<>();
        try {
            for (Object obj : objects) {
                double value = Double.parseDouble(obj.toString());

                if (value > threshold) {
                    filteredResult.add(value);
                } else {
                    filteredResult.add(0);
                }
            }
        } catch (Exception e) {
            System.out.println("Exception caught. Current result: " + filteredResult);
        } finally {
            System.out.println("Finally clause caught");
        }
        return (ArrayList<Object>) filteredResult;
    }

}
