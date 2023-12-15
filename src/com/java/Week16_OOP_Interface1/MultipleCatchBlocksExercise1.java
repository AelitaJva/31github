package com.java.Week16_OOP_Interface1;

public class MultipleCatchBlocksExercise1 {
    public static void main(String[] args) {
        Object obj = 42;
        performObjectOperations(obj);
    }

    public static void performObjectOperations(Object obj) {


        try {
            int result = (Integer) obj / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Error: ArithmeticException - Division by zero");
        } catch (NullPointerException e) {
            System.out.println("Error: NullPointerException - Object is null");
        } catch (ClassCastException e) {
            System.out.println("Error: ClassCastException - Invalid type casting");
        }
    }
}
