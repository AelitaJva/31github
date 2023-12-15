package com.java.Week16_OOP_Interface1;

public class MultipleCatchBlocks {
    public static void main(String[] args) {
        method1();
    }

    public static void method1() {
        try {
            System.out.println("Try start");

            // NullPointerException
            String var = null;
            var.toLowerCase();
            System.out.println("Done with String");

            // ClassNotFoundException
            Class.forName("fhksfh");
            System.out.println("Done with Class for Name");

            // ArithmeticException
            double result = 10 / 0;
        } catch (ClassNotFoundException e) {
            System.out.println("Could not find the class");
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught");
            System.out.println(e);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught");
            System.out.println(e);
        } catch (Exception e) {
            // Generic catch block for any other exceptions
            System.out.println("Generic Exception caught");
            System.out.println(e);
            e.printStackTrace();
        }
    }
}
