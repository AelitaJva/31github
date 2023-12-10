package com.java.Week12_OOP_Encapsulation;

import java.util.*;

public class ObjectAsInstanceVarExercise2 {
    public static void main(String[] args) {
        // Create House object
        House house = new House("123 Main St.");

        // Create Room object
        Room room1 = new Room(1, new Door("White"), new Window("Glass"));
        Room room2 = new Room(2, new Door("Black"), new Window("Glass"));
        Room room3 = new Room(5, new Door("Gold"), new Window("Glass"));

        // Add Room to House
        house.addRoom(room1);
        room2.setRoomNumber(1);
        house.addRoom(room2);

        // Access and print details using reflection
//        printClassDetails(House.class);
//        printClassDetails(Room.class);
//        printClassDetails(Door.class);
//        printClassDetails(Window.class);

        // Print House details
        System.out.println("House Address: " + house.getAddress());

        // Print Room details
        System.out.println("Room Number: " + room1.getRoomNumber());
        System.out.println("Room Door Color: " + room1.getDoor().getColor());
        System.out.println("Room Window Type: " + room1.getWindow().getType());
        System.out.println();
        // Print Room details
        System.out.println("Room Number: " + room2.getRoomNumber());
        System.out.println("Room Door Color: " + room2.getDoor().getColor());
        System.out.println("Room Window Type: " + room2.getWindow().getType());
    }


    private static Map<String, String> createOpenHours() {
        Map<String, String> openHours = new HashMap<>();
        openHours.put("Monday", "7am-9pm");
        openHours.put("Tuesday", "7am-9pm");
        openHours.put("Wednesday", "7am-9pm");
        openHours.put("Thursday", "7am-9pm");
        openHours.put("Friday", "7am-9pm");
        openHours.put("Saturday", "9am-5pm");
        openHours.put("Sunday", "Closed");
        return openHours;
    }

    private static Set<Floor> createFloors() {
        Set<Floor> floors = new HashSet<>();
        floors.add(createFloor("Floor 1"));
        floors.add(createFloor("Floor 2"));
        return floors;
    }

    private static Floor createFloor(String floorName) {
        return new Floor(10, floorName, false);
    }
}

class House {
    private String address;
    private List<Room> rooms;

    public House (String address) {
        this.address = address;
        this.rooms = new ArrayList<>();
    }

    public void addRoom (Room room) {
        rooms.add(room);
    }

    public Room getRoom(int roomNumber) {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber) {
                return room;
            }
        }
        return null;  // Room not found
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }


}
class Room {
    private int roomNumber;
    private Door door;
    private  Window window;


    public Room(int roomNumber, Door door, Window window) {
        if (roomNumber <= 0) {
            throw new IllegalArgumentException("Room number must be a positive integer.");
        }
        this.roomNumber = roomNumber;
        this.door = door;
        this.window = window;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Door getDoor() {
        return door;
    }

    public void setDoor(Door door) {
        this.door = door;
    }

    public Window getWindow() {
        return window;
    }

    public void setWindow(Window window) {
        this.window = window;
    }
}

class Door {
    private String color;

    public Door (String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

class Window {

    private String type;

    public Window (String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}