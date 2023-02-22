package com.softserve.edu10.practicalTask;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> employeeMap = new HashMap<>(7);

        fillMap(employeeMap);
        outMap(employeeMap);
        checkKey(employeeMap);
        checkValue(employeeMap);
    }

    public static void fillMap(Map<Integer, String> map){
        map.put(777, "Ivan");
        map.put(808, "Stas");
        map.put(123, "Orest");
        map.put(432, "Oleh");
        map.put(502, "Dima");
        map.put(283, "Tanya");
        map.put(199, "Igor");
    }

    public static void outMap(Map<Integer, String> map){
        for(Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println("Key: " + entry.getKey() + ", value: " + entry.getValue());
        }
    }

    public static void checkKey(Map<Integer, String> map){
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter the key: ");
        int receivedKey = scanner.nextInt();

        Set<Integer> keys = map.keySet();

        boolean isID = false;
        for(Integer key : keys){
            if(receivedKey == key){
                System.out.println("Person with this ID: " + map.get(key));
                isID = true;
            }
        }

        if(!isID){
            System.out.println("There is not person with this ID in our database...");
        }
    }

    public static void checkValue(Map<Integer, String> map){
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter the name: ");
        String name = scanner.nextLine();

        boolean isName = false;
        for(Map.Entry<Integer, String> entry : map.entrySet()){
            if(entry.getValue().equals(name)){
                System.out.println("Person with this name has ID: " + entry.getKey());
                isName = true;
            }
        }

        if(!isName){
            System.out.println("There is not person with this name in our database...");
        }
    }
}
