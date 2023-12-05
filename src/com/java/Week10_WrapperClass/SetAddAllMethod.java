package com.java.Week10_WrapperClass;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetAddAllMethod {
    public static void main(String[] args) {

        Set<Double> nums1 = new HashSet<>(Arrays.asList(12.3, 33.4, 23.5));
        Set<Double> num2 = new HashSet<>(Arrays.asList(78.5, 87.4, 55.5, 23.5));
        System.out.println(nums1);

        nums1.addAll(num2);
        System.out.println(nums1);

    }
}
