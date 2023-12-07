package com.java.Week12_OOP;

public class StaticVariables {
    public static void main(String[] args) {
        Sample obj1 = new Sample();
        Sample obj2 = new Sample();
        Sample obj3 = new Sample();
        Sample obj4 = new Sample();

        System.out.println(Sample.count);
        System.out.println(Sample.companyName);

        // all objects sharing single count,
        // that's why all objects print the same answer
        // Sample.count = 10;
//        System.out.println(obj1.count);
//        System.out.println(obj2.count);
//        System.out.println(obj3.count);
    }
}

class Sample {
    // global var = means can be invoke from anywhere(from hundred on classes)
    // store the value only once here using the static keyword
    // and call that var anywhere to use that value
    // if need some changes, go here and change only one var and use it multiple time and anywhere
    // static var : global var, constant value
    public static int count;
    public static String companyName= "WEDEVX.COM INC";

    public Sample () {
        count++;
    }
}
