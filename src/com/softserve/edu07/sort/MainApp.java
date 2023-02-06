package com.softserve.edu07.sort;

public class MainApp {

    public static void main(String[] args) {
        TestInterface testInterface = new TestInterface();
        testInterface.getVolume();

        Volumetric volumetric = new TestInterface();


        volumetric.getVolume();
        System.out.println(volumetric.info());
        System.out.println(Volumetric.PI);
        System.out.println(Volumetric.getPI());
        TestInterface testInterface1 = (TestInterface) volumetric;
        testInterface1.printSomeDate();
        Volumetric volum = testInterface1;

    }

}
