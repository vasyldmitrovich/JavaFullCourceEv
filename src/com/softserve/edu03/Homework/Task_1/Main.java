package com.softserve.edu03.Homework.Task_1;

public class Main {
    public static void main(String[] args) {
        Person person_1 = new Person();
        person_1.output();
        System.out.println("Age: " + person_1.getAge());

        Person person_2 = new Person("Ivan", "Poroh");
        person_2.setBirthYear(2008);
        person_2.output();

        Person person_3 = new Person("Dima", "Hyduma");
        person_3.changeName("Igor");
        person_3.setBirthYear(1996);
        person_3.output();

        Person person_4 = new Person();
        person_4.changeName("Stas", "Cvas");
        person_4.output();

        Person person_5 = new Person("Nameless", "Admin");
        person_5.setBirthYear(1988);
        person_5.output();
        System.out.println("Age: " + person_5.getAge());
    }
}
