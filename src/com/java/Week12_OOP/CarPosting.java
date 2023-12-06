package com.java.Week12_OOP;

// CONSTRUCTOR OVERLOADING
public class CarPosting {

    public String make;
    public String model;
    public int year;
    public double askingPrice;
    public int mileage;
    public String drive;
    public String color;
    public boolean isCleanTitle;

    // constructors are used to initialize an object
    // constructors are used to initialize the instance variables (characteristics)


    // in params d.t must match
    public CarPosting(String carMake, String carModel, int carYear, double carAskingPrice,
                      int carMileage, String carDrive, String carColor,
                      boolean isCarCleanTitle) {
        make = carMake;
        model = carModel;
        year = carYear;
        askingPrice = carAskingPrice;
        mileage = carMileage;
        drive = carDrive;
        color = carColor;
        isCleanTitle = isCarCleanTitle;
    }

    // constructor overloading gives you an ability to create multiple constructors
    // with different set of parameters
    // is it ok to use duplicated param names in different two constructors
    // they don't know each other, bc they are in two different scope

    public CarPosting(String carMake, String carModel, int carYear, double carAskingPrice) {
        make = carMake;
        model = carModel;
        year = carYear;
        askingPrice = carAskingPrice;
    }


    // there is no limit, you can create as many diff combinations of cons
    // to take from user to create an object
    public CarPosting (double carAskingPrice, int carMileage) {
        askingPrice = carAskingPrice;
        mileage = carMileage;
    }
}


class Main4 {
    public static void main(String[] args) {
        // pass the 7 different value inside parantesis
        CarPosting post1 = new CarPosting("Ferrari", "418", 2022,
                350000.00, 100, "RWD", "Red", true);

        System.out.println(post1.askingPrice);
        System.out.println(post1.color);


        CarPosting post2 = new CarPosting("Rolls Royce", "Cullinan", 2023, 450000.00);
        CarPosting post3 = new CarPosting(10000.00, 50000);

        System.out.println(post2.askingPrice);
        System.out.println(post3.mileage);


        // if no initialize some param then returns default value of that d.t
        System.out.println(post2.color);
    }
}
