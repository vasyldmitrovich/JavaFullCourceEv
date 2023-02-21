package com.softserve.edu08.homework;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person ivan = new Student(new FullName("Orest", "Kozak"), 19, 2);
        Person stas = new Student(new FullName("Stas", "Khmilovsky"), 20, 4);
        Person ivan2 = (Student)ivan.clone();
        ((Student) ivan2).setCourse(3);

        Person[] students = {ivan, stas, ivan2};

        for(Person person : students){
            System.out.println(person.info());
            System.out.println(person.activity());
        }
    }
}
