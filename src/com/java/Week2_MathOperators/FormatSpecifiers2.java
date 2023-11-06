package com.java.Week2_MathOperators;

public class FormatSpecifiers2 {
    public static void main(String[] args) {

        // problems while using the specifiers
        String firstName = "Ilon";
        String lastName = "Musk";

        System.out.printf("First name: %s Second %s", firstName, lastName);
        String quote = "I don't give a damn about your diploma";

        System.out.printf("\n\"%s\"", quote);
    }
}
