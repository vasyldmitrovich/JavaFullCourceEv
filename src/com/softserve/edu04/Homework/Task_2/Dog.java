package com.softserve.edu04.Homework.Task_2;

public class Dog {
    private String name;
    private Breed breed;
    private int age;

    public Dog() {
    }

    public Dog(String name, String breed, int age) {
        this.name = name;
        this.age = age;

        switch (breed) {
            case "Shepherd" -> this.breed = Breed.SHEPHERD;
            case "Doberman" -> this.breed = Breed.DOBERMAN;
            case "Bichon" -> this.breed = Breed.BICHON;
        }
    }

    // Getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Main methods

    public boolean equalsName(Dog dog) {
        return this.getName().equals(dog.getName());
    }

    public void maxAge(Dog dog_1, Dog dog_2) {
        System.out.println("--Dog with the greatest age");
        if ((dog_1.age <= this.age) && (dog_2.age <= this.age)) {
            System.out.println("Name: " + this.name + "\nBreed: " + this.breed);
        } else if ((dog_1.age <= dog_2.age) && (this.age <= dog_2.age)) {
            System.out.println("Name: " + dog_2.name + "\nBreed: " + dog_2.breed);
        } else {
            System.out.println("Name: " + dog_1.name + "\nBreed: " + dog_1.breed);
        }
    }
}
