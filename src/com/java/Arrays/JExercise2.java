package com.java.Arrays;

public class JExercise2 {

    public static void main(String[] args) {
        int[] temp = {75, 82, 79, 88, 92, 86, 98};
        findMaxTemperature(temp);
    }
    public static void findMaxTemperature (int[] arr) {
        int leftArr = arr[0];
        int rightArr = arr[1];
        int dayWIthMAxTemp = 0;

        for(int i=2; i<arr.length; i++) {
            if(leftArr < rightArr) {
                leftArr = rightArr;
            }
            rightArr = arr[i];
            dayWIthMAxTemp=i;
        }
        dayWIthMAxTemp++;

        System.out.println("The highest temperature was " + rightArr + " on the day " + dayWIthMAxTemp);

    }
}
