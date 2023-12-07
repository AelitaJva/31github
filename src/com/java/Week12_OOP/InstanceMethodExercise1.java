package com.java.Week12_OOP;

public class InstanceMethodExercise1 {
    public static void main(String[] args) {

    }

    class Phone {
        private String brand;
        private String model;
        private int price;

        public Phone () {
            this.brand = brand;
            this.model = model;
            this.price = price;
        }

        public String getBrand () {
            return brand;
        }

        public String getModel () {
            return model;
        }

        public int getPrice () {
            return price;
        }

        public void setBrand (String brand) {
            if(!brand.isEmpty() || brand.length() != 0) {
                this.brand = brand;
            }
        }

        public void setModel (String model) {
            if(!model.isEmpty() || model.length() != 0) {
                this.model = model;
            }
        }

        public void setPrice (int price) {
            if(price >= 0) {
                this.price = price;
            }
        }

        public void displayPhoneDetails () {
            System.out.println("Brand: " + brand + ", Model: " + model + ", Price: " + price);
        }

        public void call (String phoneNumber) {
            System.out.println("Calling " + phoneNumber);
        }

        public void sendMessage(String phoneNumber, String sendMessage) {
            System.out.println("Sending message to " + phoneNumber + ": " + sendMessage);
        }

        public void increasePrice (int amount) {
            if(amount >= 0) {
                price+=amount;
                System.out.println("Price increased by " + amount);
            } else {
                System.out.println("Invalid amount");
            }
        }

    }
}
