package com.softserve.edu04.Homework.Task_2;

public class Dog {
    String name;
    Breed breed;
    int age;

    public Dog(String name, String breed, int age){
        this.name = name;
        this.age = age;

        switch(breed){
            case "Shepherd" -> this.breed = Breed.SHEPHERD;
            case "Doberman" -> this.breed = Breed.DOBERMAN;
            case "Bichon" ->this.breed = Breed.BICHON;
        }
    }

    public boolean equalsName(Dog dog){
        return this.getName().equals(dog.getName());
    }

    public void maxAge(Dog dog_1, Dog dog_2){
        System.out.println("--Dog with the greatest age");
        if (dog_1.age <= this.age && dog_2.age <= this.age)
            System.out.println("Name: " + this.name + "\nBreed: " + this.breed);
        else if (dog_1.age <= dog_2.age && this.age <= dog_2.age)
            System.out.println("Name: " + dog_2.name + "\nBreed: " + dog_2.breed);
        else
            System.out.println("Name: " + dog_1.name + "\nBreed: " + dog_1.breed);
    }

    // Getter

    public String getName() {
        return name;
    }
}
