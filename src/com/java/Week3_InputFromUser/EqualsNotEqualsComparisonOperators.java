package com.java.Week3_InputFromUser;

public class EqualsNotEqualsComparisonOperators {
    public static void main(String[] args) {

        // == -> return true when both condition are true
        int num1 = 20;
        int num2 = 20;

        boolean areEqual = num1 == num2;
        System.out.println(areEqual);

        int currentTime = 6;
        int setTimeForAlarm = 6;
        boolean shouldKickAlarm = currentTime == setTimeForAlarm;

        System.out.println("Kick off alarm? " + shouldKickAlarm);


        // != - return true when two sides are not equal
        int num4 = 5;
        int num5 = 7;

        boolean areEqual2 = num4 != num5;
        System.out.println(areEqual2);

        int numberOfCompletedExercisesThisWeek = 5;
        boolean shouldICloseAccessToMentors = numberOfCompletedExercisesThisWeek != 5;
        System.out.println(shouldICloseAccessToMentors);
    }
}
