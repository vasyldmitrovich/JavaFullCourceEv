package com.softserve.edu06.homework.task2;

public class Main {
    public static void main(String[] args){
        /*I recommend you at once create objects in array for example
        * Employee devs[] = {new Developer("Marian", 20, 700, "beginner", "java"),
        *                       new Developer("Ivan", 24, 1500, "middle", "C++"), etc...};*/
        Employee devs[] = {new Developer("Marian", 20, 700, "beginner", "java"),
                                new Developer("Ivan", 24, 1500, "middle", "C++"),
                                new Developer("Stas", 27, 3000, "senior", "Python")};

        for(Employee dev : devs){
            System.out.println(dev.report());
        }
    }
}
