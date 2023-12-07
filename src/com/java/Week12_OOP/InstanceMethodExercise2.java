package com.java.Week12_OOP;

public class InstanceMethodExercise2 {
    public static void main(String[] args) {

    }
}
class Crypto {
    // Instance Variables
    private String name;
    private String symbol;
    private double price;
    private long marketCap;
    private int rank;

    // Constructor
    public Crypto(String name, String symbol, double price, long marketCap, int rank) {
        this.name = name;
        this.symbol = symbol;
        this.price = price;

        // Check and set non-negative marketCap
        if (marketCap >= 0) {
            this.marketCap = marketCap;
        } else {
            System.out.println("Error: Market capitalization cannot be negative. Setting to 0.");
            this.marketCap = 0;
        }

        // Check and set non-negative rank
        if (rank >= 0) {
            this.rank = rank;
        } else {
            System.out.println("Error: Rank cannot be negative. Setting to 0.");
            this.rank = 0;
        }
    }

    // Getter Methods
    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }

    public double getPrice() {
        return price;
    }

    public long getMarketCap() {
        return marketCap;
    }

    public int getRank() {
        return rank;
    }

    // Setter Methods
    public void setName(String name) {
        if (name.length() >= 3) {
            this.name = name;
        }
    }

    public void setSymbol(String symbol) {
        if (symbol.length() >= 3 && symbol.length() <= 5) {
            this.symbol = symbol;
        } else {
            System.out.println("Error: Symbol must be between 3 and 5 characters long. Current value not changed.");
        }
    }

    public void setPrice(double price) {
        if (price >= 0.0) {
            this.price = price;
        }
    }

    public void setMarket(long marketCap) {
        if (marketCap >= 0) {
            this.marketCap = marketCap;
        }
    }

    public void setRank(int rank) {
        if (rank >= 0) {
            this.rank = rank;
        }
    }

    // Additional Instance Methods
    public double calculateTotalValue(double quantity) {
        if (quantity < 0) {
            return 0.0;
        } else {
            return price * quantity;
        }
    }

    public void printCryptoDetails() {
        System.out.println(name + " (" + symbol + ") - Price: " + price + " USD, Market Cap: " + marketCap + ", Rank: " + rank);
    }

}
