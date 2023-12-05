package com.java.Week10_WrapperClass;

public class ParseMethods {

    public static void main(String[] args) {

        // you can take a value from String and do some calculation
        // parseByte(String str);
        String str = "25";
        byte num = Byte.parseByte(str); // u can use to make some calculation
        System.out.println(str);
        System.out.println(num);

        int a = num + 10;
        System.out.println(a);


        // every primitive d.t has a byte method.
        String str2 = "2500";
        short num2 = Short.parseShort(str2);
        System.out.println(num2);

        int sum2 = num2 * 10;
        System.out.println(sum2);

        String str3 = "10000";
        int num3 = Integer.parseInt(str3);
        System.out.println(num3 + 10);


        String str4 = "12.5";
        double d = Double.parseDouble(str4);
        System.out.println(d-0.5);

        String str5 = "true";
        boolean b = Boolean.parseBoolean(str5);
        System.out.println(b);

//        if(b) {
//
//        }

        String str6 = "C";
        char ch = str6.charAt(0);
    }
}
