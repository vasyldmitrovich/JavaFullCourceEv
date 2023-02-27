package com.softserve.edu12.pt.task2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws ColorException, TypeException {
        run();
    }
    public static void run() throws ColorException, TypeException {
        List<Plant> plants = new ArrayList<>();
        plants.add(new Plant("tree", "blue", 17));
        plants.add(new Plant("bush", "white", 5));
        plants.add(new Plant("fruit", "yellow", 9));
        plants.add(new Plant("herbal", "red", 23));
        plants.add(new Plant("tree", "black", 11)); // violet

        plants.forEach(System.out::println);
    }


}
