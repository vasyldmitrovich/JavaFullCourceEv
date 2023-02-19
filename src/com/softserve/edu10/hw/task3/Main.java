package com.softserve.edu10.hw.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Main.toFill(students);
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println(students);

        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getCourse() - o2.getCourse();
            }
        });
        System.out.println(students);
        System.out.println(new Student().printStudents(students, 2));

    }
    public static void toFill(List<Student> list){
        list.add(new Student("Bob", 1));
        list.add(new Student("Tom", 2));
        list.add(new Student("Sam", 3));
        list.add(new Student("John", 2));
        list.add(new Student("Jack", 1));
    }
}
