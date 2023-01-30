package com.softserve.edu04.hw;
public class Task2 {
    public static void main(String[] args) {
        Dog tuzik = new Dog("Tuzik", Breed.DACHSHUND, 3);
        Dog sharik = new Dog("Sharik", Breed.BULLDOG, 5);
        Dog lucky = new Dog("Lucky", Breed.LABRADOR, 4);
        if((tuzik.getName().equals(sharik.getName()))||(tuzik.getName().equals(lucky.getName()))){
            System.out.println("there are dogs with the same name");
        } else if(sharik.getName().equals(lucky.getName())){
            System.out.println("there are dogs with the same name");
        } else System.out.println("no dogs have the same name");
        if(tuzik.getAge() > sharik.getAge()){
            System.out.println((tuzik.getAge() > lucky.getAge()) ? tuzik.toString() : lucky.toString());
        } else System.out.println((sharik.getAge() > lucky.getAge()) ? sharik.toString() : lucky.toString());

    }

}
enum Breed{
    GERMAN_SHEPHERD, BULLDOG, LABRADOR, DACHSHUND
}
class Dog{
    private String name;
    private Breed breed;
    private int age;

    public Dog(String name, Breed breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

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

    @Override
    public String toString() {
        return "SnoopDog{" +
                "name='" + name + '\'' +
                ", breed=" + breed +
                ", age=" + age +
                '}';
    }
}