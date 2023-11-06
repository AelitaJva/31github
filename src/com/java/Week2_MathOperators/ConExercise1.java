package com.java.Week2_MathOperators;

public class ConExercise1 {
    public static void main(String[] args) {
        System.out.println("========== Exercise 1 ==========");
        String street = "1 Infinite Loop";
        String city = "Cupertino";
        String state = "California";
        String zipCode = "98765";
        System.out.println(street + ", " + city + ", " + state + ", " + zipCode);

        System.out.println("========== Exercise 2 ==========");
        String company = "Apple";
        String iphone14 = "iPhone 14";
        String mackbookPro = "Mackbook Pro";
        String appleWatch = "Apple Watch";
        String ipad = "iPad";

        System.out.println(company + "'s product line includes: " + iphone14 + ", " + mackbookPro + ", " + appleWatch + ", " + ipad);

        System.out.println("========== Exercise 3 ==========");

        String productName = "Notebook";
        int quantity = 2;
        double price = 1500.0;

        double  totalAmount = quantity * price;

        String invoice =  "Invoice for: " + productName + "\n" +
                          "Quantity: "    + quantity + "\n"    +
                          "Price: $"     + price + "\n"       +
                          "Total: $"     + totalAmount;

        System.out.println(invoice);


        System.out.println("========== Exercise 4 ==========");

        String inviter = "Steve Jobs";
        String invitee = "WeDevX Student";
        String topic = "Apple Pay Planning";


        String invitationEmail = "Dear " + invitee + ", " + "\n" +
                                  inviter + " is inviting you to " + topic + " meeting.";

        System.out.println(invitationEmail);

        System.out.println("========== Exercise 5 ==========");

        String candidateName = "WeDevX Graduatae";
        double salary = 180000.00;
        int stockOptions = 2340;
        int annualBonus = 15000;

        String offerLetter = "Dear " + candidateName + ", " + "\n" +
                              "Apple is delighted to offer you the position of Software Quality Engineer." + "\n" +
                              "You will receive an annual salary of $" + salary + "\n" +
                              stockOptions + " stock options and annual bonus of " + annualBonus;

        System.out.println(offerLetter);

    }
}
