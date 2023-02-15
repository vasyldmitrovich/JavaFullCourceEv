package com.softserve.edu07.practicalTasks.task1;

public class Main {
    public static void main(String[] args) {
        Animal cat1 = new Cat();
        Animal cat2 = new Cat();

        Animal dog1 = new Dog();
        Animal dog2 = new Dog();

        Animal animals[] = {cat1, dog1, cat2, dog2};
        String food[] = {"fish", "bone", "watermelon", "meat"};

        for (int i = 0; i < animals.length; i++) {
            animals[i].voice();
            animals[i].feed(food[i]);
        }
    }
}
