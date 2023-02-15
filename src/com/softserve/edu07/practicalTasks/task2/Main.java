package com.softserve.edu07.practicalTasks.task2;

public class Main {
    public static void main(String[] args) {
        Person student = new Student("Ivan", "student");
        Person cleaner = new Cleaner(500, "Stas");
        Person teacher = new Teacher(700, "Oleh");

        Person persons[] = {student, cleaner, teacher};

        for (Person person : persons) {
            person.print();
            if(person instanceof Staff){
                ((Staff) person).salary();
            }
        }
    }
}
