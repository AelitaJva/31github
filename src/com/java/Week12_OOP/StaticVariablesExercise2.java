package com.java.Week12_OOP;

public class StaticVariablesExercise2 {
    public static void main(String[] args) {
        Passenger.setAirlineName("XYZ Airlines");

        Passenger passenger1 = new Passenger(1, "John Doe", 30, true);
        passenger1.displayPassengerDetails();

        Passenger passenger2 = new Passenger(2, "Jane Smith", 25, false);
        passenger2.displayPassengerDetails();

        System.out.println("Total Passengers: " + Passenger.getTotalPassengers());
        System.out.println("Airline Name: " + Passenger.getAirlineName());
    }
}

class Passenger {
    public static final int MAX_CAPACITY = 200;
    public static final String  PASSENGER_TYPE = "Regular";

    private int passengerId;
    private String passengerName;
    private int age;
    private boolean isFrequentFlyer;

    private static int totalPassenger = 0;
    private static String airlineName = " ";

    public static int getTotalPassengers () {
        return totalPassenger;
    }

    public static String getAirlineName () {
        return airlineName;
    }

    public static void setAirlineName (String airlineName) {
        Passenger.airlineName = airlineName;
    }


    // CONSTRUCTOR
    public Passenger (int passengerId, String passengerName, int age, boolean isFrequentFlyer) {
        this.passengerId = passengerId;
        this.passengerName = passengerName;
        this.age = age;
        this.isFrequentFlyer = isFrequentFlyer;

        totalPassenger++;
    }

    public void displayPassengerDetails () {
        System.out.println("Passenger Details:");
        System.out.println("Passenger ID: " + passengerId);
        System.out.println("Name: " + passengerName);
        System.out.println("Age: " + age);
        System.out.println("Frequent Flyer: " + isFrequentFlyer);
    }

    public void printPassengerType () {
        System.out.println("Passenger Type: " + Passenger.PASSENGER_TYPE);
    }

    public void changePassengerName (String newName) {
        this.passengerName = newName;
    }
}
