package com.softserve.edu10.homework.task2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<>(10);

        fillMap(personMap);
        inputMap(personMap);

        checkSameKey(personMap);

        deleteFirstName(personMap, "Orest");
        System.out.println("\n--After removing Orest\n");
        inputMap(personMap);
    }

    public static void fillMap(Map<String, String> map) {
        map.put("Havalevich", "Ivan");
        map.put("Khmilovsky", "Stas");
        map.put("Soltysak", "Oleh");
        map.put("Onyshkevich", "Tanya");
        map.put("Chipko", "Marta");

        map.put("Moh", "Marian");
        map.put("Mytsko", "Anna");
        map.put("Lazurko", "Ilya");
        map.put("Kozack", "Orest");
        map.put("Hrynovets", "Oleh");
    }

    public static void inputMap(Map<String, String> map){
        System.out.println();
        for(Map.Entry<String, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    public static void checkSameKey(Map<String, String> map){
        Set<String> firstNames = new HashSet<>(map.values());

        if(firstNames.size() == map.size()){
            System.out.println("\nMap has no duplicate first name");
        } else{
            System.out.println("\nMap has duplicate first name");
        }
    }

    public static void deleteFirstName(Map<String, String> map, String name){
        for(Map.Entry<String, String> entry : map.entrySet()){
            if(entry.getValue().equals(name)){
                map.remove(entry.getKey());
            }
        }
    }
}
