package com.softserve.edu10.homework.task2;

import java.util.*;

public class Application {
    private static final Map<String, String> personMap = new HashMap<>(10);

    /*All good*/
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        // Create map personMap and add to it ten persons of type <String, String> (lastName, firstName).
        addElementsToMap(personMap);
        // Output the entities of the map on the screen.
        printMap(personMap);
        // There are at less two persons with the same firstName among these 10 people?
        isSimilarValues(personMap); // 2 hours spent to code this method. You may check it replacing values in map
        // Remove from the map person whose firstName is "Orest" (or other).
        removePerson(personMap, "Abraham");
        // Print result.
        printMap(personMap);
    }

    public static void addElementsToMap(Map<String, String> map) {
        map.put("Washington", "George");
        map.put("Jefferson", /*"John"*/ "Thomas");
        map.put("Lincoln", "Abraham");
        map.put("Arthur", "Chester");
        map.put("Roosevelt", "Theodore");
        map.put("Truman", /*"John"*/ "Harry");
        map.put("Eisenhower", "Dwight");
        map.put("Kennedy", "John");
        map.put("Reagan", "Ronald");
        map.put("Obama", /*"George"*/ "Barack");
    }

    public static void printMap(Map<String, String> map) {
        System.out.println("\nDisplay a map on the screen:\n");
        for (var element : map.entrySet()) {
            System.out.println("Last name: " + element.getKey() + ", First name: " + element.getValue());
        }
       // map.forEach((key, value) -> System.out.println("Last name: " + key + ", First name: " + value));
    }

    public static void isSimilarValues(Map<String, String> map) {
        ArrayList<String> list = new ArrayList<>(map.values());
        ArrayList<String> similarInfo = new ArrayList<>();
        for (int i = 0; i < list.size(); ) {
            int frequency = Collections.frequency(list, list.get(i));
            if (frequency == 1) {
                i++;
            } else {
                String element = list.get(i);
                String text = "***\nElement (value): " + element + ". Was found " + frequency + " times as a value in a Map\n" +
                        "Keys for this value are: " + keys(personMap, element);
                similarInfo.add(text);
                for (int j = 0; j < list.size(); j++) {
                    list.remove(element);
                }
            }
        }
        if (!similarInfo.isEmpty()) {
            System.out.println("\nThere is (are) " + similarInfo.size() + " similar element(s) in a map:");
            similarInfo.forEach(System.out::println);
        } else {
            System.out.println("\nThere are no similar values in a map!");
        }
    }

    public static Set<String> keys(Map<String, String> map, String value) {
        Set<String> set = new HashSet<>();
        for (var element : map.entrySet()) {
            if (element.getValue().equals(value)) {
                String key = element.getKey();
                set.add(key);
            }
        }
        return set;
    }

    public static void removePerson(Map<String, String> map, String firstName) {
        map.entrySet().removeIf(element -> element.getValue().equalsIgnoreCase(firstName));
    }
}



