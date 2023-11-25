package com.java.WrapperClass;

import java.util.HashSet;
import java.util.Set;

public class SetSizeMethodExercise1 {
    public static void main(String[] args) {
        System.out.println(getSize());

        addGift("Toy");
        addGift("Book");
        addGift("Candle");

        System.out.println(isWishlistEmpty());
        System.out.println(getSize());

        clearWishlist();

        System.out.println(getSize());
        System.out.println(isWishlistEmpty());
    }


    private static Set<String> wishlist = new HashSet<>();

    // complete all static methods below
    public static void addGift(String gift) {
        // complete the method
        wishlist.add(gift);

    }

    public static int getSize() {
        // complete the method
        return wishlist.size();

    }

    public static void clearWishlist() {
        // complete the method
        wishlist.clear();
    }

    public static boolean isWishlistEmpty() {
        // complete the method

        return wishlist.isEmpty();
    }

}
