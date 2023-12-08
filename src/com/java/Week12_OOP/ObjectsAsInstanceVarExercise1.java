package com.java.Week12_OOP;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ObjectsAsInstanceVarExercise1 {
    public static void main(String[] args) {
        // Create floors
        Floor floor1 = new Floor(10, "First Floor", false);
        Floor floor2 = new Floor(15, "Second Floor", true);

        // Create an employee
        Employee1 librarian = new Employee1("Librarian", 30, 50000.0, floor1);

        // Create a library
        Library myLibrary = new Library("My Library", getOpenHours());
        myLibrary.setEmployee1(librarian);

        // Add floors to the library
        Set<Floor> libraryFloors = new HashSet<>();
        libraryFloors.add(floor1);
        libraryFloors.add(floor2);
        myLibrary.setFloors(libraryFloors);

        // Print library details
        System.out.println("Library Details:");
        System.out.println("Name: " + myLibrary.getName());
        System.out.println("Open Hours: " + myLibrary.getOpenHours());
        System.out.println("Employee: " + myLibrary.getEmployee1().getTitle());
        System.out.println("Floors: " + myLibrary.getFloors());


        // Update employee details
        librarian.setTitle("Head Librarian");
        librarian.setSalary(60000.0);

        // Print updated employee details
        System.out.println("\nUpdated Employee Details:");
        System.out.println("Title: " + librarian.getTitle());
        System.out.println("Salary: $" + librarian.getSalary());
    }

    private static Map<String, String> getOpenHours() {
        Map<String, String> openHours = new HashMap<>();
        openHours.put("Monday", "7am-9pm");
        openHours.put("Tuesday", "7am-9pm");
        // Add more days as needed
        return openHours;
    }
    }


class Library {


    private  Employee1 employee1;
    private String name;
    private Map<String, String> openHours;
    private Set<Floor> floors;

    public Library (String name, Map openHours) {
        this.name = name;
        this.openHours = openHours;
    }

    public Employee1 getEmployee1() {
        return employee1;
    }

    public void setEmployee1(Employee1 employee1) {
        this.employee1 = employee1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, String> getOpenHours() {
        return openHours;
    }

    public void setOpenHours(Map<String, String> openHours) {
        this.openHours = openHours;
    }

    public Set<Floor> getFloors() {
        return floors;
    }

    public void setFloors(Set<Floor> floors) {
        this.floors = floors;
    }


}

class Employee1 {

    private String title;
    private int age;
    private  double salary;
    private Floor floor;

    public Employee1 (String title, int age, double salary, Floor floor) {
        this.title = title;
        this.age = age;
        this.salary = salary;
        this.floor = floor;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Floor getFloor() {
        return floor;
    }

    public void setFloor(Floor floor) {
        this.floor = floor;
    }
}


class Floor {
    private int numberOfRooms;
    private String floorName;
    private boolean isBusy;

    public Floor (int numberOfRooms, String floorName, boolean isBusy) {
        this.numberOfRooms = numberOfRooms;
        this.floorName = floorName;
        this.isBusy = isBusy;
    }

    public int getNumberOfRooms () {
        return numberOfRooms;
    }

    public void setNumberOfRooms (int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public String getFloorName () {
        return floorName;
    }
    public void setFloorName (String floorName) {
        this.floorName = floorName;
    }

    public boolean isBusy () {
        return  isBusy;
    }

    public void setBusy (boolean busy) {
        this.isBusy = busy;
    }

    @Override
    public String toString() {
        return "Floor: " + floorName + ", Rooms: " + numberOfRooms + ", Busy: " + isBusy;
    }

}