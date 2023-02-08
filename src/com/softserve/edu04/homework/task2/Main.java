package com.softserve.edu04.homework.task2;

public class Main {
    public static void main(String[] args) {
        Dog shepherd = new Dog("Mike", "Shepherd", 4);
        Dog doberman = new Dog("Jack", "Doberman", 7);
        Dog bichon = new Dog("Daisy", "Bichon", 2);

        if (shepherd.equalsName(doberman) || shepherd.equalsName(bichon) || doberman.equalsName(bichon)) {
            System.out.println("Some dogs have the same names\n");
        } else {
            System.out.println("Dogs have different names\n");
        }

        shepherd.maxAge(doberman, bichon);
    }
}
