package com.softserve.edu10.pt;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int key;
        String value;
        Scanner scanner = new Scanner(System.in);
        Map<Integer, String> employeeMap = new HashMap<>();

        Main.toFill(employeeMap);
        System.out.println(employeeMap);

        System.out.print("Enter ID to search: ");
        if(employeeMap.containsKey(key = scanner.nextInt())){
            System.out.println("key = " + key + ", employee = " + employeeMap.get(key));
        } else {
            System.out.println("not yet this key");
        }
        System.out.print("Enter name to search: ");
        if(employeeMap.containsValue(value = scanner.next())){
            for (Map.Entry<Integer, String> temp: employeeMap.entrySet()) {
                if(value.equals(temp.getValue())){
                    System.out.println("key = " + temp.getKey() + ", employee = " + temp.getValue());
                }
            }
        } else {
            System.out.println("not yet this value");
        }
    }

    public static void toFill(Map map){
        map.put(11,"Tom");
        map.put(12,"Tim");
        map.put(13,"Red");
        map.put(14,"Sam");
        map.put(15,"Rod");
        map.put(16,"John");
        map.put(17,"Will");
    }
}
