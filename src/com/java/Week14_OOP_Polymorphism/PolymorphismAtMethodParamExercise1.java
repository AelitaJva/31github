package com.java.Week14_OOP_Polymorphism;

public class PolymorphismAtMethodParamExercise1 {
    public static void main(String[] args) {
        Game actionGame = new ActionGame("ActionGame1", 49.99);
        Game puzzleGame = new PuzzleGame("PuzzleGame1", 29.99);

        Game[] games = {actionGame, puzzleGame};
        double totalPrice = GameStore.calculateTotalPrice(games);

        System.out.println(totalPrice);
    }
}

class GameStore {

    public static double calculateTotalPrice (Game[] games) {
        double totalPrice = 0.0;

        for (Game game : games) {
            totalPrice+=game.getPrice();
        }
        return totalPrice;
    }
}

class Game {
    String title;
    double price;

    public Game(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }
}

class ActionGame extends Game {
    public ActionGame (String title, double price) {
        super(title, price);
    }
}

class PuzzleGame extends Game {
    public PuzzleGame (String title, double price) {
        super(title, price);
    }
}