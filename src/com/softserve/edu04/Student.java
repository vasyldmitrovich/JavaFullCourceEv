package com.softserve.edu04;

import java.util.ArrayList;

public class Student {
    private static int studentCount;
    private String name;
    private int rating;
    /*That arr must be in another class not in that class*/
    private static final ArrayList<Student> allStudents = new ArrayList<>();

    /*First constructors after get set methods and after that all another methods*/

    public String getName()
    {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public static int getStudentCount() {
        return studentCount;
    }

    public static int getTotalRating() {
        int totalRating = 0;

        for (Student student : allStudents) {
            totalRating += student.getRating();
        }
        return totalRating;
    }

    public static int getAvrRating() {
        return Student.getTotalRating() / allStudents.size();
    }

    public static boolean betterStudent(Student x) {
        int rating;

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

    public Student(String name, int rating) {
        this();
        this.name = name;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Student name is - " + getName() + "! Rating is - " + getRating();
    }
}