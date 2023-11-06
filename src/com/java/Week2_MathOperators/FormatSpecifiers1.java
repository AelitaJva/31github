package com.java.Week2_MathOperators;

public class FormatSpecifiers1 {
    public static void main(String[] args) {
        // specifier %s

        String hello = "Hello World!";


        // "%" = specifies that we want to replace this %s (specifier) with a String
        // and the string that we specify is going to be replaced as is without any changes or additions

        System.out.printf("%s", hello);


        String carMake = "Tesla";
        String carModel = "X";
        System.out.printf("\n%s %s", carMake, carModel);

        String carMake2 = "Rolls Royce";
        String carModel2 = "Cullinan";
        String price = "350k";


        // here you have choice, but in IT industry most professinals use printf
        System.out.printf("\n%s %s costs $%s ", carMake2, carModel2, price);
        System.out.println(carMake2 + " " + carModel2 + " costs $" + price);

    }
}
