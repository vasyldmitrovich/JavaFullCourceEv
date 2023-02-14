package com.softserve.edu08.hw;

public class Main {
    public static void main(String[] args) {
        Student first = new Student(new FullName("Will", "Smith"), 19, 2);
        Student second = new Student(new FullName("Bruce", "Willis"), 22, 1);

        System.out.println(first.info());
        System.out.println(first.activity());
        System.out.println("==========================");
        System.out.println(second.info());
        System.out.println(second.activity());

        Student third = null;
        try {
            third = (Student) first.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        third.setCourse(3);
        System.out.println("==============================");
        System.out.println(third.info());
        System.out.println(third.activity());
    }
}
