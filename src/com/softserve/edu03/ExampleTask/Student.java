package com.softserve.edu03.ExampleTask;

import java.util.ArrayList;

public class Student {
    private static int studentCount;
    private String name;
    private double rating;
    private static final ArrayList <Student> allStudents = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public static int getStudentCount() {
        return studentCount;
    }

    public static double getTotalRating() {
        double totalRating = 0.0;
        for (Student student : allStudents) {
            totalRating += student.getRating();
        }
        return totalRating;
    }

    public static double getAvrRating() {
        return Student.getTotalRating()/allStudents.size();
    }

    public static boolean isBetterStudent(Student x) {
        double rating;
        for (Student student : allStudents) {
            rating = student.getRating();
            if (rating > x.getRating())
                return false;
        }
        return true;
    }

    public Student() {
        studentCount++;
        allStudents.add(this);
    }
    public Student(String name) {
        this();
        this.name = name;
    }
    public Student(String name, double rating) {
        this();
        this.name = name;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Student name is - " + getName() + "! Rating is - " + getRating();
    }
}


