package com.softserve.edu07.practical.task2;

public class Application {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        Application.printPersonInfo(createPersons());
    }

    public static Object [] createPersons () {
        Person[] allPersons = new Person[3];
        allPersons[0] = new Student("Alex");
        allPersons[1] = new Cleaner("Sofia", 160, 100);
        allPersons[2] = new Teacher("Laura", 20000);
        return allPersons;
    }

    public static void printPersonInfo (Object [] objects) {
        for (Object human : objects) {
            if (human instanceof Person person) {
                person.print();
            }
            if (human instanceof Staff staff) {
                staff.salary();
            }
        }
    }
}
