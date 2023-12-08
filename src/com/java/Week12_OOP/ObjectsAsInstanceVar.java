package com.java.Week12_OOP;

import java.util.ArrayList;
import java.util.List;

public class ObjectsAsInstanceVar {
    public static void main(String[] args) {

        Address c1Address = new Address("Asanbay 38", "Bishkek", 678, "KG");
        Address c2Address = new Address("Osh Bazaar", "Bishkek", 684, "KG");
        Address c3Address = new Address("Alamedin Bazaar", "Bishkek", 123, "KG");
        List<Customer> customerList = new ArrayList<>();

        Customer c1 = new Customer("Aelita Jelden", c1Address);
        Customer c2 = new Customer("Adelina Talant", c2Address);
        Customer c3 = new Customer("Albina Askar", c3Address);

        customerList.add(c1);
        customerList.add(c2);
        customerList.add(c3);

        Bank chaseBank = new Bank("Chase", customerList);

        System.out.println(chaseBank.getName());

        List<Customer> cList = chaseBank.getCustomerList();
        for (Customer obj : cList) {
            if (obj.getName().equalsIgnoreCase("Aelita Jelden")) {
                System.out.println(obj.getName());
                System.out.println(obj.getAddress().getStreet());
                System.out.println(obj.getAddress().getCity());
                System.out.println(obj.getAddress().getZipcode());
                System.out.println(obj.getAddress().getCity());
            }
        }


    }
}

// I want to store information about Bank
// Bank should have the following information:
// Bank {
// name : "Chase";
// customers : [{Aelita Jelden}, {Adelina Talant}, {Albina Askar}];
// }


class Customer {

    private String name;

    private Address address;

    public Customer(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}

class Address {

    private String street;
    private String city;
    private int zipcode;
    private String country;

    public Address(String street, String city, int zipcode, String country) {
        this.street = street;
        this.city = city;
        this.zipcode = zipcode;
        this.country = country;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}

class Bank {


    private String name;
    private List<Customer> customerList;

    public Bank(String name, List<Customer> customerList) {
        this.name = name;
        this.customerList = customerList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }
}