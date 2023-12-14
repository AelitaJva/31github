package com.java.Week16_OOP_Interface1;

public class DefaultMethodsInInterfaceExercise1 {
    public static void main(String[] args) {
        Weapon sword = new Weapon("Sword", 80);
        System.out.println("Weapon Type: " + sword.getWeaponType()); // Weapon Type: Sword
        System.out.println("Durability: " + sword.getDurability()); // Durability: 80

        sword.setWeaponType("Axe");
        sword.setDurability(150); // Setting durability above the maximum value
        System.out.println("Weapon Type: " + sword.getWeaponType()); // Weapon Type: Axe
        System.out.println("Durability: " + sword.getDurability()); // Durability: 100

        sword.setDurability(-20); // Setting durability below the minimum value
        System.out.println("Weapon Type: " + sword.getWeaponType()); // Weapon Type: Axe
        System.out.println("Durability: " + sword.getDurability()); // Durability: 100
        sword.setDurability(30); // Durability: 30
        System.out.println("Durability: " + sword.getDurability()); // Durability: 30

        sword.resetWeaponType();
        sword.repair();
        System.out.println("Weapon Type: " + sword.getWeaponType()); // Weapon Type: Default
        System.out.println("Durability: " + sword.getDurability()); // Durability: 100
    }
}


interface WeaponType {
    String getWeaponType();

    void setWeaponType(String weaponType);

    default void resetWeaponType() {
        System.out.println("Weapon Type: Default");
    }

}

interface Damageable {
    int getDurability();

    void setDurability(int durability);
    default void repair() {
        System.out.println("Durability: 100");
    }
}

class Weapon implements WeaponType, Damageable {
    String weaponType;
    int durability;

    public Weapon(String weaponType, int durability) {
        this.weaponType = weaponType;
        this.durability = durability;
    }

    @Override
    public String getWeaponType() {
        return weaponType;
    }

    @Override
    public void setWeaponType(String weaponType) {
        if(weaponType != null) {
            this.weaponType = weaponType;
        } else {
            WeaponType.super.resetWeaponType();
        }
    }

//    @Override
//    public void resetWeaponType() {
//        WeaponType.super.resetWeaponType();
//    }

    @Override
    public int getDurability() {
        return durability;
    }

    @Override
    public void setDurability(int durability) {
        if(durability >= 0) {
            this.durability = Math.max(0, Math.min(100, durability));
        } else {
            Damageable.super.repair();
        }
    }

    @Override
    public void repair() {
        Damageable.super.repair();
    }
}