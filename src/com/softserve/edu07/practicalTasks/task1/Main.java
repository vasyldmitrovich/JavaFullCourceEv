package com.softserve.edu07.practicalTasks.task1;

public class Main {
    public static void main(String[] args) {
        Animal animals[] = {new Cat(), new Cat(), new Dog(), new Dog()};
        String food[] = {"fish", "bone", "watermelon", "meat"};

        for (int i = 0; i < animals.length; i++) {
            animals[i].voice();
            animals[i].feed(food[i]);
        }
    }
}
