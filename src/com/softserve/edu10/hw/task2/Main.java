package com.softserve.edu10.hw.task2;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<String, String> personMap = new HashMap<>();
        Main.toFill(personMap);
        System.out.println(personMap);
        Set<String> personSet = new HashSet<>();
        personSet.addAll(personMap.values());

        if(personSet.size() == personMap.size()){
            System.out.println("There are no identical names");
        } else System.out.println("the map has the same names");

        for (Map.Entry<String, String> temp: personMap.entrySet()) {
            if(temp.getValue().equals("Orest")){
                personMap.remove(temp.getKey());
            }
        }
        System.out.println(personMap);
    }

    public static void toFill(Map map){
        map.put("Smith", "Will");
        map.put("Willis", "Bruce");
        map.put("Hanks", "Tom");
        map.put("Cruise", "Tom");
        map.put("Stallone", "Silvester");
        map.put("Diesel", "Vin");
        map.put("Statham", "Jason");
        map.put("Johnson", "Dwayne");
        map.put("Reynolds", "Ryan");
        map.put("Hmys", "Orest");
    }
}
