package com.softserve.edu04.homeWork;

public class Dog {
    private String dogsName;
    private String breed;
    private int age;
    private static int count; //  = 0;

    static {
        count = 0;
    }

    public Dog() {
        breed = "";
        age = 0;
        count++;
    }

    public Dog(String dogsName, String breed, int age) {
        this();
        this.dogsName = dogsName;
        this.breed = breed;
        this.age = age;
    }
    public String dogsName() {
        return dogsName;
    }

    public String breed() {
        return breed;
    }
    public int age() {
        return age;
    }

    public void setDogsName(String dogsName) {
        this.dogsName = dogsName;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setAge(int age) {
        this.age = age;
    }
        public int getAge() {
            return age;
        }

    @Override
    public String toString() {
        return "Dog{" + dogsName +
                "breed=" + breed +
                ", age='" + age + '\'' +
                '}';
    }
}


