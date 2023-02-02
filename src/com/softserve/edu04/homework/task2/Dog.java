package com.softserve.edu04.homework.task2;

import java.util.ArrayList;
import java.util.Objects;

public class Dog {
        private String name;
        private Breed breed;
        private int age;
        private static final ArrayList<Dog> allDogs = new ArrayList<>();

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

        public Dog() {
                allDogs.add(this);
        }

        public Dog(String name) {
                this();
                this.name = name;
        }

        public Dog(String name, Breed breed, int age) {
                this();
                this.name = name;
                this.breed = breed;
                this.age = age;
        }

        @Override
        public String toString() {
                return "Dog name is " + getName() + "! " + getName() + " is " + getBreed() + ", age is " + getAge() + " years old.";
        }

        @Override
        public boolean equals(Object o) {
                if (this == o) return true;
                if (!(o instanceof Dog dog)) return false;
                return getAge() == dog.getAge() && Objects.equals(getName(), dog.getName()) && getBreed() == dog.getBreed();
        }

        @Override
        public int hashCode() {
                return Objects.hash(getName(), getBreed(), getAge());
        }

        public static String oldestDog () {
                int max = allDogs.get(0).getAge();
                String result = allDogs.get(0).getName();
                for (Dog dog : allDogs) {
                        if (dog.getAge() > max) {
                                max = dog.getAge();
                                result = "The oldest dog is - " + dog.getName() + ". Breed - " + dog.getBreed() + ".";
                        }
                }
                return result;
        }

        public static boolean isSameName () {
                boolean result = true;
                String name = allDogs.get(0).getName();
                for (Dog dog : allDogs) {
                        if (!dog.getName().equalsIgnoreCase(name)) {
                                name = dog.getName();
                                result = false;
                        } else {
                                result = true;
                        }
                } return result;
        }
}
