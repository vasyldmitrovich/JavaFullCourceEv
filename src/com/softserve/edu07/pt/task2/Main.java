package com.softserve.edu07.pt.task2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Vasyl", "student");
        Student student2 = new Student("Petro", "student");
        Teacher teacher1 = new Teacher("Stepan", "teacher");
        Teacher teacher2 = new Teacher("Mykola", "teacher");
        Cleaner cleaner1 = new Cleaner("Igor", "cleaner");
        Cleaner cleaner2 = new Cleaner("Bogdan", "cleaner");

        List<Person> people = new ArrayList<>();
        people.add(student1);
        people.add(student2);
        people.add(teacher1);
        people.add(teacher2);
        people.add(cleaner1);
        people.add(cleaner2);

        for (Person temp: people) {
            temp.print();
            if(temp instanceof Staff){
                System.out.print("\tSalary = " + ((Staff) temp).salary());
            }
            System.out.println();
        }
    }
}
