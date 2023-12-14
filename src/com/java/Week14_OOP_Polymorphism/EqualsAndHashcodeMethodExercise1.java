package com.java.Week14_OOP_Polymorphism;

import javax.management.ObjectName;
import java.util.Objects;

public class EqualsAndHashcodeMethodExercise1 {
    public static void main(String[] args) {
        Book2 book1 = new Book2("To Kill a Mockingbird", "Harper Lee", 1960, "Classic Fiction");
        Book2 book2 = new Book2("to kill a mockingbird", "harper lee", 1960, "classic fiction");
        Book2 book3 = new Book2("1984", "George Orwell", 1949, "Dystopian Fiction");

        System.out.println("Comparing book1 and book2: " + book1.equals(book2));
        System.out.println("Comparing book1 and book3: " + book1.equals(book3));
        System.out.println("Hash code of book1: " + book1.hashCode());
        System.out.println("Hash code of book2: " + book2.hashCode());
        System.out.println("Hash code of book3: " + book3.hashCode());
    }
}


class Book2 {
    static int lastId;
    int id;
    String title;
    String author;
    int year;
    String genre;

    public Book2(String title, String author, int year, String genre) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.genre = genre;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title.toLowerCase(), author.toLowerCase(), genre.toLowerCase(), year);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Book2 other = (Book2) obj;

        return year == other.year &&
                title.equalsIgnoreCase(other.title) &&
                author.equalsIgnoreCase(other.author) &&
                genre.equalsIgnoreCase(other.genre);

    }
}
