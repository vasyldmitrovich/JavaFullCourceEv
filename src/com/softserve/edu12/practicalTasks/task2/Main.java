package com.softserve.edu12.practicalTasks.task2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Plant> plants = new ArrayList<>(5);

        addPlant(plants, 5, "RED", "FLOWER");
        addPlant(plants, 10, "BROWN", "TREE");
        addPlant(plants, 7, "GREE", "BUSH");    // I entered the wrong color
        addPlant(plants, 4, "RED", "FLOWE");    // I entered the wrong Type
        addPlant(plants, 6, "YELLOW", "BUSH");
    }

    public static void addPlant(ArrayList<Plant> plants, int size, String color, String type){
        try {
            Plant plant = new Plant(size, color, type);
            plants.add(plant);
            System.out.println(plant + "\n");
        } catch (ColorException e){
            System.out.println("Wrong Color :/\n");
        } catch (TypeException e){
            System.out.println("Wrong Type :/\n");
        }
    }
}