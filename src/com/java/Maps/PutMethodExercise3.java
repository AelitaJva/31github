package com.java.Maps;

import com.sun.source.tree.Tree;

import java.util.Map;
import java.util.TreeMap;

public class PutMethodExercise3 {
    public static void main(String[] args) {
        int num = 18;
        System.out.println(checkPrimeNumbers(num));

    }

    public static Map<Integer, Boolean> checkPrimeNumbers(int number) {

        TreeMap<Integer, Boolean> checkingCollection = new TreeMap<>();

        int start;
        int end;

        if (number >= 0) {
            start = 1;
            end = number + 1;
        } else {
            start = number;
            end = 0;
        }

        for (int i = start; i < end; i++) {
            boolean isPrime = isPrimeNumber(i);
            checkingCollection.put(i, isPrime);
        }

        return checkingCollection;
    }
//        for(int i=1; i<number; i++) {
//            boolean isPrime = isPrimeNumber(i);
//            checkingCollection.put(i, isPrime);
//        }
//
//        return checkingCollection;



    public static boolean isPrimeNumber(int num) {

        if (num <= 1) {
            return false;
        }

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
