package com.softserve.edu07.pt.task1;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {new Cat(),new Dog()};
        for (Animal temp: animals) {
            temp.feed();
            temp.voice();
        }
    }
}
