package com.java.Week10_WrapperClass;

import java.util.HashSet;
import java.util.Set;

public class SetThroughLoopsExercise2 {
    // prime number is greater than 1
    // that has no positive divisors other than 1 and itself

    public static void main(String[] args) {
        int start = 1;
        int end = 10;

        Set<Integer> primes = findPrimesInRange(start, end);
        System.out.println("Prime numbers in the range: " + primes);
    }

    public static Set<Integer> findPrimesInRange(int start, int end) {

        Set<Integer> primeNumbers = new HashSet<>();

        for (int i = start; i < end; i++) {
            if (isPrime(i)) {
                primeNumbers.add(i);
            }
        }

        return primeNumbers;
    }

    public static boolean isPrime(int num) {
        // Initial Check: if (num <= 1) -
        // The method begins by checking if num is less than or equal to 1.
        // If num is 1 or less, the method immediately returns false because,
        // by definition, prime numbers must be greater than 1.
        if (num <= 1) {
            return false;
        }


        // 2. The loop starts with i set to 2, the smallest prime number.
        //The loop continues as long as i * i is less than or equal to num.
        // This is an optimization, equivalent to checking up to the square root of num.
        //In each iteration, it checks if num is divisible evenly by i (i.e., num % i == 0).
        //If num is divisible by i, the method immediately returns false because num is not prime.
        //The loop increments i after each iteration.

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

}
