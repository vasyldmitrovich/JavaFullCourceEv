package com.softserve.edu07.sort;

public class TestInterface implements Volumetric, Volum{
    @Override
    public double getVolume() {
        System.out.println("This text is from class TestInterface");
        return 0;
    }


    @Override
    public void printSomeDate() {
        System.out.println("That text from class Test");

    }
}
