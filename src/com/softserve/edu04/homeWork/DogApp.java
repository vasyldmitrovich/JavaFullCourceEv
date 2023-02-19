package com.softserve.edu04.homeWork;

public class DogApp {
    public static void main(String[] args) {
        enum breed {
            German_Shepherd, Smooth_Fox_Terrier, Dachshund
        }
        Dog dog0 = new Dog("Rex", "German Shepherd", 14);
        Dog dog1 = new Dog("Jessi", "Smooth Fox Terrier", 7);
        Dog dog2 = new Dog("Sausage", "Dachshund", 10);

        String[] arr1 = {dog0.dogsName(), dog1.dogsName(), dog2.dogsName()};
        if (dog0.dogsName() == dog1.dogsName() || dog0.dogsName() == dog2.dogsName()) {
            System.out.println("A dog with that name already exists");
        } else {
            System.out.println("There is no dog with that name");
        }

        int[] arr = {dog0.age(), dog1.age(), dog2.age()};
        int max = arr[0];
        int i = 0;
        while (i < arr.length) {
            if (arr[i] > max) {
                max = arr[i];
            }
            i++;
        }

        if (max == dog0.age())
            System.out.println("The oldest dog is - " + dog0.dogsName() + " " + "    this is a dog breed  " + dog0.breed());
        else if (max == dog1.age())
            System.out.println("The oldest dog is - " + dog1.dogsName() + " " + "    this is a dog breed  " + dog1.breed());
        else if (max == dog2.age())
            System.out.println("The oldest dog is - " + dog2.dogsName() + " " + "    this is a dog breed  " + dog2.breed());

    }
}
