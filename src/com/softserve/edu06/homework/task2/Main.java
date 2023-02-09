package com.softserve.edu06.homework.task2;

public class Main {
    public static void main(String[] args){
        Employee dev1 = new Developer("Marian", 20, 700, "beginner", "java");
        Employee dev2 = new Developer("Ivan", 24, 1500, "middle", "C++");
        Employee dev3 = new Developer("Stas", 27, 3000, "senior", "Python");

        Employee devs[] = {dev1, dev2, dev3};

        for(Employee dev : devs){
            System.out.println(dev.report());
        }
    }
}
