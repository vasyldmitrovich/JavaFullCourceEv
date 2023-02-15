package com.softserve.edu07.practicalTasks.task2;

public class Main {
    public static void main(String[] args) {
        Person persons[] = {
                new Student("Ivan", "student"),
                new Cleaner(500, "Stas"),
                new Teacher(700, "Oleh")
        };

        for (Person person : persons) {
            person.print();
            if(person instanceof Staff){
                ((Staff) person).salary();
            }
        }
    }
}
