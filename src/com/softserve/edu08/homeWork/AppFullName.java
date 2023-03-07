package com.softserve.edu08.homeWork;

public class AppFullName {
    public static void main(String[] args) {
        run();
    }

    public static void run() {

        Student08 student = new Student08(new FullName("Yriy", "Stepanovich"), 23, 5);
        Student08 student1 = new Student08(new FullName("Olga", "Petrivna"), 24, 3);

        System.out.println(student.info());
        System.out.println(student.activity());
        System.out.println("_____________________");
        System.out.println(student1.info());
        System.out.println(student1.activity());

        Student08 student2;
        try {
            student2 = (Student08) student.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        student2.setCourse(3);
        System.out.println("_____________________");
        System.out.println(student2.info());
        System.out.println(student2.activity());
    }
}



