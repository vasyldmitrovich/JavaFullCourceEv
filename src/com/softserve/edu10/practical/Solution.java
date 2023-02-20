package com.softserve.edu10.practical;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
    static Scanner scanner = new Scanner(System.in);
    private static final Map<Integer, String> employeeMap = new HashMap<>(7);
    private static final int first = 10000000;
    private static final int last = 89999999;

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        // Add to employeeMap seven pairs (ID, name) of some persons.
        addID();
        // Display the map on the screen.
        displayMap();
        // Ask user to enter ID, then find and write corresponding name from your map.
        // If you can't find this ID - say about it to user (use function containsKey()).
        getNameByID();
        // Ask user to enter name, verify than you have name in your map and write corresponding ID.
        // If you can't find this name - say about it to user (use function containsValue()).
        getIDByName();
    }

    public static void addID() {
        // key must be unique
        // same value might belong to different keys
        // there two values of "Heisenberg" in a map
        employeeMap.put((int) (Math.random() * last) + first, "Tomás Cantillo");
        employeeMap.put((int) (Math.random() * last) + first, "Jesse Pinkman");
        employeeMap.put((int) (Math.random() * last) + first, "Huell Babineaux");
        employeeMap.put((int) (Math.random() * last) + first, "Walter White");
        employeeMap.put((int) (Math.random() * last) + first, "Brock Cantillo");
        employeeMap.put((int) (Math.random() * last) + first, "Christian 'Combo' Ortega");
        employeeMap.put((int) (Math.random() * last) + first, "Walter White");
    }

    public static void displayMap() {
        System.out.println("\nDisplay the map on the screen:\n");
        int count = 0;
        for (var pair : employeeMap.entrySet()) {
            Integer ID = pair.getKey();
            String name = pair.getValue();
            count++;
            System.out.println(count + ") " + ID + " ----> " + name);
        }
    }

    public static void getNameByID() {
        System.out.println("\nPlease enter a 8 digit ID number:");
        int userKey = getKey();
        System.out.println(employeeMap.getOrDefault(userKey, "No such key present"));
        // Other method:
        /*
        if (employeeMap.containsKey(userKey)) {
            System.out.println(employeeMap.get(userKey));
        } else {
            System.out.println("No such key present");
        }
        */
        // Other method:
        // System.out.println(employeeMap.containsKey(userKey) ? employeeMap.get(userKey) : "No such key present");
    }

    public static void getIDByName() {
        System.out.println("\nPlease enter a name to look for ID in our database:");
        String name = getName();

        if (employeeMap.values().stream().filter(x -> x.equals(name)).toList().isEmpty()) {
            System.out.println("No such name in our database");
        } else {
            for (var pair : employeeMap.entrySet()) {
                if (pair.getValue().equals(name)) {
                    System.out.println("Entered name matches with next ID: " + pair.getKey());
                }
            }
        }
    }

    public static int getKey() {
        int key = 0;
        while (key == 0 || Integer.toString(key).length() != 8) {
            try {
                key = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                key = 0; //might be empty
            }
            if (Integer.toString(key).length() != 8) {
                System.out.println("You input not 8 digit integer. Please input exactly 8 digit integer");
            }
        }
        return key;
    }

    public static String getName() {
        return scanner.nextLine();
    }
}


