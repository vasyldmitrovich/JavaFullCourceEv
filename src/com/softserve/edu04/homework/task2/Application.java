package com.softserve.edu04.homework.task2;

public class Application {
    public static void main(String[] args) {
        Dog firstDog = new Dog();
        Dog secondDog = new Dog("Hannibal");
        Dog thirdDog = new Dog("Wolverine",Breed.CANE_CORSO,5);
        firstDog.setName("Benjamin");
        firstDog.setAge(1);
        firstDog.setBreed(Breed.AKITA);
        secondDog.setBreed(Breed.TIBETAN_MASTIFF);
        secondDog.setAge(6);

        System.out.println(Dog.oldestDog());
        System.out.println("Is there dogs with the same name? \n" + Dog.isSameName());
    }
}
