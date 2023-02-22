package com.softserve.edu10.homework.task3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        fillList(studentList);

        System.out.println("\n--List of students");
        printList(studentList);

        studentList.sort(new Comparator<>() {
            @Override
            public int compare(Student student1, Student student2) {
                return student1.getName().compareTo(student2.getName());
            }
        });

        System.out.println("\n--List of students sorted by name");
        printList(studentList);

        studentList.sort(new Comparator<>() {
            @Override
            public int compare(Student student1, Student student2) {
                return student1.getCourse() - student2.getCourse();
            }
        });

        System.out.println("\n--List of students sorted by course");
        printList(studentList);

        Student.printStudent(studentList, 2);
    }

    public static void fillList(List<Student> list){
        list.add(new Student("Ivan", 2));
        list.add(new Student("Stas", 1));
        list.add(new Student("Dima", 2));
        list.add(new Student("Oleh", 4));
        list.add(new Student("Tanya", 3));
    }

    public static void printList(List<Student> list){
        System.out.println();
        for(Student student : list){
            System.out.println(student);
        }
    }
}
