package com.java.Week10_WrapperClass;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetRemoveAllMethod {
    public static void main(String[] args) {

        Set<Double> nums1 = new HashSet<>(Arrays.asList(12.3, 33.4, 23.5));
        Set<Double> nums2 = new HashSet<>(Arrays.asList(78.5, 87.4, 55.5, 23.5));

        nums1.removeAll(nums2);
        System.out.println("removed set" + nums1);
        System.out.println("not removed set, bc that removeAll method can't manage other var" + nums2);


        // removeAll - removes all matching elements between 2 collections
        // only that collections that being called by methods can be manipulated
        // here nums2 can't be manipulated
    }
}
