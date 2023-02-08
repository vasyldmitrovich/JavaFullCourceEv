package com.softserve.edu03.homework.task1;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        System.out.println(person1.toString());
        System.out.println("Age: " + person1.getAge());

        Person person2 = new Person("Ivan", "Poroh");
        person2.setBirthYear(2008);
        System.out.println(person2.toString());

        Person person3 = new Person("Dima", "Hyduma");
        person3.changeName("Igor");
        person3.setBirthYear(1996);
        System.out.println(person3.toString());

        Person person4 = new Person();
        person4.changeName("Stas", "Cvas");
        System.out.println(person4.toString());

        Person person5 = new Person("Nameless", "Admin");
        person5.setBirthYear(1988);
        System.out.println(person5.toString());
        System.out.println("Age: " + person5.getAge());
    }
}
