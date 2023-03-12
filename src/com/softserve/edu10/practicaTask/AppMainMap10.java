package com.softserve.edu10.practicaTask;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AppMainMap10 {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        int key;
        String value;
        Scanner scanner = new Scanner(System.in);
        Map<Integer, String> employeeMap = new HashMap<>();

        AppMainMap10.toFill(employeeMap);
        System.out.println(employeeMap);

        System.out.print("Enter ID: ");
        if (employeeMap.containsKey(key = scanner.nextInt())) {
            System.out.println("Key = " + key + ", Employee = " + employeeMap.get(key));
        } else {
            System.out.println("Not yet this key");
        }
        System.out.print("Enter name: ");
        if (employeeMap.containsValue(value = scanner.next())) {
            for (Map.Entry<Integer, String> temp : employeeMap.entrySet()) {
                if (value.equals(temp.getValue())) {
                    System.out.println("Key = " + temp.getKey() + ", Employee = " + temp.getValue());
                }
            }
        } else {
            System.out.println("Not yet this value");
        }
    }

    public static void toFill(Map map) {
        map.put(21, "Anna");
        map.put(22, "Olga");
        map.put(23, "Iryna");
        map.put(24, "Valya");
        map.put(25, "Toma");
        map.put(26, "Ivanka");
        map.put(27, "Bogdanka");

    }
}
