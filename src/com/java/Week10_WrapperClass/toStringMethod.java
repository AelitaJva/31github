package com.java.Week10_WrapperClass;

public class toStringMethod {
    public static void main(String[] args) {

        // all primitive d.t has this method

        // 1. The toString() method returns the String representation of the object:
        //
        //The toString() method is something you can use in programming (especially in languages like Java or JavaScript).
        //When you apply toString() to an object, it gives you a text (String) version that represents what the object is.
        //2. If the method takes a primitive data type as an argument:
        //
        //"Primitive data types" are simple types of data like numbers or characters (e.g., integers or letters).
        //"As an argument" means you provide one of these simple types when using the toString() method.
        //3. Then the String object representing the primitive data type value is returned:
        //
        //If you use toString() with a simple type (like a number), it will give you a String version of that number.
        //For example, if you have the number 42 and you use toString() on it, you get the String "42".
        // toString() is a method that can turn an object or a simple piece of data into a text version of itself,
        // making it easier to work with or display. If you use it with a basic piece of information, like a number,
        // it will give you the number in a text form.


        int b = 100;
        String str = Integer.toString(b);
        System.out.println(str + "a");

        double a = 12.4;
        String str2 = Double.toString(a);
        System.out.println(str2 + "---------------");
    }
}
