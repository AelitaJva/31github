package com.java.Week3_InputFromUser;

public class CompoundOperators {
    public static void main(String[] args) {

        // += add the previous value of a variable with a new value
        // and updates the value of a variable  with a new value

        int num = 10;
        num+=5;      // int num = num + 10;
        System.out.println(num);

        num+=10;      // num = num + 10;
        System.out.println(num);

        num+=2;
        System.out.println(num);


        // -=
        int num2 = 100;
        num2-=25;
        System.out.println(num2);

        num2-=10;
        System.out.println(num2);


        // *=
        int num3 = 200;
        num3*=2;
        System.out.println(num3);

        // /=
        int num4 = 400;
        num4/=4;
        System.out.println(num4);

        int num5 = 90;
        num5%=10;
        System.out.println(num5);

    }
}
