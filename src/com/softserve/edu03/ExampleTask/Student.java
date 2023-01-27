package com.softserve.edu03.ExampleTask;

public class Student {
    private static int studentCount;
    private String name;
    private double rating;

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

    public Student() {
        studentCount++;
    }

    public static int getStudentCount() {
        return studentCount;
    }

    public Student(String name, double rating) {
        this();
        this.name = name;
        this.rating = rating;
    }


    /*private static double avrRating() {

    }

   /* private static boolean isBetterStudent(Student x) {
        double[] ratingList = new double[getStudentCount()];
        for (int j = 0; j < getStudentCount(); j++) {
            ratingList[j] = new Student().getRating();
        }
        double max = ratingList[0];
        for (int i = 0; i < getStudentCount(); i++) {
            if (ratingList[i] >= max) {
                max = ratingList[i];
            }
        } return x.getRating() >= max;
    }*/

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                '}';
    }

    public static void main(String[] args) {
        Student firstStudent = new Student("Naruto Uzumaki", 4.5);
        Student secondStudent = new Student("Sasuke Uchiha", 5.0);
        Student thirdStudent = new Student("Sakura Haruno", 4.8);

        System.out.println("Total amount of students is " + getStudentCount() + ":");
        System.out.println(firstStudent);
        System.out.println(secondStudent);
        System.out.println(thirdStudent);




    }
}


