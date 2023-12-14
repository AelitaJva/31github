package com.java.Week15_OOP_Abstraction;

public class AbstractionIntroExercise2 {
    public static void main(String[] args) {
        Guitar guitar = new Guitar(6);
        Piano piano = new Piano(88);
        guitar.play();
        piano.play();

        guitar.displayInfo();
        piano.displayInfo();


    }
}


abstract class Instrument {
    public abstract void play();

    public abstract void displayInfo();
}

class Guitar extends Instrument {
    int strings;

    public Guitar(int strings) {
        this.strings = strings;
    }

    public void play() {
        System.out.println("The guitar melody");
    }

    public void displayInfo () {
        System.out.println("This is a guitar with " + strings + " strings");
    }
}

class Piano extends Instrument {
    int keys;

    public Piano(int keys) {
        this.keys = keys;
    }

    public void play() {
        System.out.println("The piano melody");
    }

    public void displayInfo () {
        System.out.println("This is a piano with " + keys + " keys");
    }
}