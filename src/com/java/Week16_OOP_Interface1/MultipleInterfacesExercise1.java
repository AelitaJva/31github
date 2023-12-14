package com.java.Week16_OOP_Interface1;

public class MultipleInterfacesExercise1 {
    public static void main(String[] args) {
        Park centralPark = new Park("Central Park", 10000);
        centralPark.visit();
        centralPark.relax();
        centralPark.plantTrees();
        centralPark.waterPlants();
        centralPark.showParkDetails();

        Park prospectPark = new Park("Prospect Park", 8000);
        prospectPark.visit();
        prospectPark.relax();
        prospectPark.plantTrees();
        prospectPark.waterPlants();
        prospectPark.showParkDetails();

        Park goldenGatePark = new Park("Golden Gate Park", 12000);
        goldenGatePark.visit();
        goldenGatePark.relax();
        goldenGatePark.plantTrees();
        goldenGatePark.waterPlants();
        goldenGatePark.showParkDetails();
    }
}


interface PublicSpace {
    void visit();

    void relax();
}

interface GreenSpace {
    void plantTrees();

    void waterPlants();
}

class Park implements PublicSpace, GreenSpace {
    String parkName;
    int area;

    public Park(String parkName, int area) {
        this.parkName = parkName;
        this.area = area;
    }

    @Override
    public void visit() {
        System.out.println("Visiting " + parkName + " park");
    }

    @Override
    public void relax() {
        System.out.println("Relaxing in " + parkName + " park");

    }

    @Override
    public void plantTrees() {
        System.out.println("Planting trees in " + parkName + " park");
    }

    @Override
    public void waterPlants() {
        System.out.println("Watering plants in " + parkName + " park");

    }

    public void showParkDetails() {
        System.out.println("Park: " + parkName);
        System.out.println("Area: " + area + " square meters");
    }

}
