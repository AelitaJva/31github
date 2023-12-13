package com.java.Week14_OOP_Polymorphism;

public class FinalKeywordInMethods {
    public static void main(String[] args) {

        // final keyword in java
        // 1. var can be declared as final - that variables can only be initialized once
        // 2. class can be declared final -> no other class extend from that from final class
        // 3. method can be declared final -> the method can not be overriding


        Animal2 obj = new Animal2();
        String str = obj.toString();
        System.out.println(str);
    }
}


class Animal2 {
    public final void eat () {
        System.out.println("Eat");
    }
}


class Dog2 extends  Animal2 {
//    public final void eat () {
//        System.out.println("Eat");
//    }
}