package com.softserve.project;

import java.io.Serializable;
import java.util.*;
import java.io.*;
import java.util.Scanner;


public class Animal {
    public static void main(String[] args) {
//        Dog jack = new Dog("jack", "black", 5);
//        jack.input();
//        jack.print();
//        System.out.println(jack.toString());
//
//        jack.makeSound();
//
//        Cat miki = new Cat("miki", "brown", 9);
//        miki.makeSound();
//        miki.input();
//        miki.print();
//        System.out.println(miki.toString());
//    }
        // Creating a list of animals
        List<Animal> animals = new ArrayList<>();

        // Adding animals to the list
        animals.add(new Dog("Jack", "Black", 5));
        animals.add(new Cat("Miki", "Brown", 9));
        animals.add(new Dog("Buddy", "White", 3));
        animals.add(new Cat("Lucy", "Black", 2));
        animals.add(new Dog("Rocky", "Brown", 4));

        // Printing the information of the animals with black color
        System.out.println("Animals with black color:");
        for (Animal animal : animals) {
            if (animal.getColor().equalsIgnoreCase("black")) {
                System.out.println(animal.toString());
            }
        }
        try {
            Collections.sort(animals, Comparator.comparing(Animal::getName));
            File file = new File("animals.txt");
            FileWriter writer = new FileWriter(file);
            for (Animal animal : animals) {
                writer.write(animal.getName() + " (" + animal.getType() + ")\n");
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
        // Serialize and deserialize animal list to XML
        try {
            FileOutputStream fos = new FileOutputStream("animals.xml");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(animals);
            oos.close();

            FileInputStream fis = new FileInputStream("animals.xml");
            ObjectInputStream ois = new ObjectInputStream(fis);
            List<Animal> deserializedAnimals = (List<Animal>) ois.readObject();
            ois.close();

            System.out.println("Deserialized animals:");
            for (Animal animal : deserializedAnimals) {
                System.out.println(animal.getName() + " (" + animal.getType() + ", " + animal.getColor() + ")");
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error serializing/deserializing: " + e.getMessage());
        }
    }


    private String getType() {
        return null;
    }


    private String name;
        private String color;
        private int age;

    public Animal(String name, String color, int age){
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void makeSound(){
        System.out.println("The animal makes sound");
    }


    public void input (){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the animal: ");
        this.name = scanner.nextLine();
        System.out.print("Enter the color of the animal: ");
        this.color = scanner.nextLine();
        System.out.print("Enter the age of the animal: ");
        this.age = Integer.parseInt(scanner.nextLine());

    }
    public void print(){
        System.out.println("Name of the animal: " + this.name);
        System.out.println("Color of the animal: " + this.color);
        System.out.println("Age of the animal: " + this.age);
    }
    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age='" + age + '\'' +
                '}';
    }


}





