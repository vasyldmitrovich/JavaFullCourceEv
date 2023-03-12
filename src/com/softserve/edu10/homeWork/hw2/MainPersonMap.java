package com.softserve.edu10.homeWork.hw2;

import java.util.*;

public class MainPersonMap {
    public static void main(String[] args) {
        run();
    }

    public static void run() {

        Map<String, String> personMap = new HashMap<>();
        MainPersonMap.toFill(personMap);
        System.out.println(personMap);
        Set<String> personSet = new HashSet<>(personMap.values());
        personSet.addAll(personMap.values());

        if (personSet.size() == personMap.size()) {
            System.out.println("There are no identical names");
        } else System.out.println("The map has the same names");

        for (Map.Entry<String, String> temp : personMap.entrySet()) {
            if (temp.getValue().equals("Ivan")) {
                personMap.remove(temp.getKey());
            }
        }
        System.out.println(personMap);
    }

    public static void toFill(Map<String, String> map) {
        map.put("Koloduyk", "Ioan");
        map.put("Stepanyk", "Oleg");
        map.put("Boyko", "Ivan");
        map.put("Zozylay", "Oleg");
        map.put("Kuc", "Volodya");
        map.put("Kovalenko", "Viktotiya");
        map.put("Zozulenko", "Tamara");
        map.put("Vasulevuch", "Inna");
        map.put("Kondratenko", "Vanga");
        map.put("Zybrova", "Ganna");
    }
}
