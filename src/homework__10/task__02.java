package homework__10;

import java.util.*;

public class task__02 {
    public static void main(String[] args) {


        run();


    }

    public static void run() {


        System.out.println("Homework task 02");

        System.out.println(" ");

        Map<String, String> personMap = new HashMap<>();

        personMap.put("Putera", "Roma");
        personMap.put("Starko", "Roma");
        personMap.put("La", "Vania");
        personMap.put("And", "Ivan");
        personMap.put("Kolesko", "Sergiy");
        personMap.put("Losenko", "Taras");
        personMap.put("Iatsiv", "Kolya");
        personMap.put("Lor", "Taras");
        personMap.put("Trees", "Mops");
        personMap.put("Leaf", "Lead");

        for (Map.Entry<String, String> entry1 : personMap.entrySet()) {

            System.out.println("Key: " + entry1.getKey() + " : " + entry1.getValue());
        }
        System.out.println("");
        Iterator<String> iterator = personMap.values().iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();

            if (name.contains("Roma")) {
                iterator.remove();
            }

        }
        System.out.println("New map without person with the same name: " + personMap);

    }
}


