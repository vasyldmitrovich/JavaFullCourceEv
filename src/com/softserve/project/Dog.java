package com.softserve.project;

import java.util.Scanner;

public

class Dog extends Animal {

        public Dog(String name, String color, int age){
            super(name, color, age);
        }

        @Override
        public void makeSound() {
            System.out.println(this.getName() + " " + "bark bark");
        }
        @Override
        public void input () {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the name of the dog: ");
            this.setName(scanner.nextLine());
            System.out.print("Enter the color of the dog: ");
            this.setColor(scanner.nextLine());
            System.out.print("Enter the age of the dog: ");
            this.setAge(Integer.parseInt(scanner.nextLine()));
        }
        @Override
        public void print() {
            System.out.println("Name of the dog: " + this.getName());
            System.out.println("Color of the dog: " + this.getColor());
            System.out.println("Age of the dog: " + this.getAge());
        }


    }

