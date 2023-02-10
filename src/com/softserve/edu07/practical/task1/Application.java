package com.softserve.edu07.practical.task1;

import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {
        run();
        // run2();
    }

    public static void run() {
        Application.printAnimalActions(createAnimals());
    }

    public static ArrayList<Object> createAnimals () {
        ArrayList<Object> pets = new ArrayList<>();
        pets.add(new Cat("Attila", "Karakal"));
        pets.add(new Cat("Zara", "Sphynx"));
        pets.add(new Dog("Airy", "Alaskan Malamute"));
        pets.add(new Dog("Benji", "Akita"));
        return pets;
    }


    public static void printAnimalActions (ArrayList<Object> objects) {
        for (Object pet : objects) {
            if (pet instanceof Animal animal) {
                animal.voice();
                animal.feed();
            }
        }
    }

   /* public static void run2() {
        ArrayList<Animal> allAnimals = new ArrayList<>();
        allAnimals.add(new Cat("Attila", "Karakal"));
        allAnimals.add(new Cat("Zara", "Sphynx"));
        allAnimals.add(new Dog("Airy", "Alaskan Malamute"));
        allAnimals.add(new Dog("Benji", "Akita"));

        for (Animal animal : allAnimals) {
            animal.voice();
            animal.feed();
        }
    } */
}
