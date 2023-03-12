package com.softserve.edu10.homeWork.hw3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainStudent10 {
    private static Object Student10;

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        List<Student10> students = new ArrayList<>();
        MainStudent10.toFill(students);
        Collections.sort(students, new Comparator<Student10>() {
            @Override
            public int compare(Student10 o1, Student10 o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println(Student10);

        Collections.sort(students, new Comparator<Student10>() {
            @Override
            public int compare(Student10 o1, Student10 o2) {
                return o1.getCourse() - o2.getCourse();
            }
        });
        System.out.println(students);
        System.out.println(new Student10().printStudents(students, 2));
    }

    public static void toFill(List<Student10> list) {
        list.add(new Student10("Kolya", 3));
        list.add(new Student10("Ivan", 5));
        list.add(new Student10("Stepan", 2));
        list.add(new Student10("Olya", 4));
        list.add(new Student10("Inna", 3));

    }
}
