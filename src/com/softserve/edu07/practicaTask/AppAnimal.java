package com.softserve.edu07.practicaTask;

public class AppAnimal {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        Animal[] animals = {new Cat07(),
                new Dog07()};
        for (Animal temp : animals) {
            temp.feed();
            temp.voice();
        }

    }
}
