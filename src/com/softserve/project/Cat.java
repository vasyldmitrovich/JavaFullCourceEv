package com.softserve.project;

import java.util.Scanner;

public class Cat extends Animal{
        public Cat(String name, String color, int age){
            super(name, color, age);
        }

        @Override
        public void makeSound(){
            System.out.println(this.getName() + " " + "mau mau");
        }
        @Override
        public void input () {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the name of the cat: ");
            this.setName(scanner.nextLine());
            System.out.print("Enter the color of the cat: ");
            this.setColor(scanner.nextLine());
            System.out.print("Enter the age of the cat: ");
            this.setAge(Integer.parseInt(scanner.nextLine()));
        }
        @Override
        public void print(){
            System.out.println("Name of the cat: " + this.getName());
            System.out.println("Color of the cat: " + this.getColor());
            System.out.println("Age of the cat: " + this.getAge());


        }}

