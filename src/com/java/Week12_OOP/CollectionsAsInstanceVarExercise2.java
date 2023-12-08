package com.java.Week12_OOP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionsAsInstanceVarExercise2 {
    public static void main(String[] args) {
        Students students = new Students("2000");
        students.addStudent("Aelita");
        students.addStudent("Adelina");

        students.addMarks("Math", 90);
        students.addMarks("Science", 85);
        students.addMarks("English", 98);


        List<String> studentList = Students.getStudentList();
        System.out.println("Student List: " + studentList);


        Map<String, Integer> marks = students.getMarks();
        System.out.println("Marks: " + marks);

        String yearOfBirth = students.getYearOfBirth();
        System.out.println("Year of Birth: " + yearOfBirth);
    }
}

class Students {
    private static List<String> studentList = new ArrayList<>();
    private Map<String, Integer> marks = new HashMap<>();
    private final String yearOfBirth;

    public Students (String yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public static List<String> getStudentList () {
        return studentList;
    }

    public Map<String, Integer> getMarks () {
        return marks;
    }

    public String getYearOfBirth () {
        return yearOfBirth;
    }

    public void addStudent (String student) {
        studentList.add(student);
    }

    public void addMarks (String subject, int marks) {

        if(marks >= 0 && marks <= 100) {
            this.marks.put(subject, marks);
        } else {
            System.out.println("Invalid marks! Marks should be between 0 and 100");
        }
    }

}

