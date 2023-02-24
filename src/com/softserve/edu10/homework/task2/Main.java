package com.softserve.edu10.homework.task2;

import com.softserve.edu10.homework.task3.Student;

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
        map.put("Havalevich", "Oleh");
        map.put("Khmilovsky", "Orest");
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
        Collection<String> names = map.values();
        Set<String> namesSet = new HashSet<>(names);

        for(String s : namesSet) {
            names.remove(s);
        }

        Set<String> repeatedNames = new HashSet<>(names);

        System.out.println("\n--Repeated names");

        for(String name : repeatedNames){
            System.out.println(name + " is " + (Collections.frequency(names, name) + 1) + " times in map");
        }
    }

    public static void deleteFirstName(Map<String, String> map, String name) {
        for(Map.Entry<String, String> entry : map.entrySet()){
            if(entry.getValue().equals(name)){
                map.remove(entry.getKey());
            }
        }

        // The second way, have ConcurrentModificationException as well

//        Iterator<String> iterator = map.values().iterator();
//
//        String nextName;
//
//        while (iterator.hasNext()){
//            nextName = iterator.next();
//
//            if(nextName.equals(name)){
//                for(String key : map.keySet()){
//                    if(map.get(key).equals(name)){
//                        System.out.println("\n" + key);
//                        map.remove(key);
//                    }
//                }
//            }
//        }
    }
}
