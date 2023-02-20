package com.softserve.edu03.exampleTask;

public class Application {
    public static void main(String[] args) {
        Student firstStudent = new Student("Naruto Uzumaki", 4.5);
        Student secondStudent = new Student("Sasuke Uchiha");
        Student thirdStudent = new Student();

        secondStudent.setRating(5.0);
        thirdStudent.setName("Sakura Haruno");
        thirdStudent.setRating(4.8);

        System.out.println("\nTotal amount of students is " + Student.getStudentCount() + ":\n");
        System.out.println(firstStudent);
        System.out.println(secondStudent);
        System.out.println(thirdStudent);

        System.out.println("\nTotal rating is " + Student.getTotalRating());
        System.out.println("Average rating of all students is " + Student.getAvrRating() + "\n");

        System.out.println(firstStudent.getName() + " is the best student?  -  " + Student.isBetterStudent(firstStudent));
        System.out.println(secondStudent.getName() + " is the best student?  -  " + Student.isBetterStudent(secondStudent));
        System.out.println(thirdStudent.getName() + " is the best student?  -  " + Student.isBetterStudent(thirdStudent));
    }
}
