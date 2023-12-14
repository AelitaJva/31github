package com.java.Week16_OOP_Interface1;

public class MultipleInterfacesExercise2 {
    public static void main(String[] args) {
        Body body = new Body(10, 5);
        body.displaySize(); // Current size: Height=10, Width=5

        body.moveForward(3);
        body.displaySize(); // Current size: Height=13, Width=5

        body.moveBackward(2);
        body.displaySize(); // Current size: Height=11, Width=5

        body.increaseSize(2);
        body.displaySize(); // Current size: Height=22, Width=10

        body.decreaseSize(3);
        body.displaySize(); // Current size: Height=7, Width=3
    }
}


interface Movable {
    void moveForward(int distance);
    void moveBackward(int distance);
}

interface Resizable {
    void increaseSize(int factor);
    void decreaseSize(int factor);
}

class Body implements  Movable, Resizable {
    int height;
    int width;

    public Body(int height, int width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public void moveForward(int distance) {
        this.height+=distance;
    }

    @Override
    public void moveBackward(int distance) {
        this.height-=distance;
    }

    @Override
    public void increaseSize(int factor) {
        this.height*=factor;
        this.width*=factor;
    }

    @Override
    public void decreaseSize(int factor) {
        this.height/=factor;
        this.width/=factor;
    }

    public void displaySize () {
        System.out.println("Current size: Height=" + height + ", Width=" + width);
    }
}