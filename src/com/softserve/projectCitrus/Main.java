package com.softserve.projectCitrus;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Fruit> fruits = new ArrayList<>();
        fruits.add(new Fruit("Apple", "Green"));
        fruits.add(new Citrus("Orange", "Orange", 18.3));
        fruits.add(new Citrus("Lemon", "Yellow", 15.8));
        fruits.add(new Fruit("Banana", "Yellow"));
        fruits.add(new Citrus("Grapefruit", "Pink", 25.6));
        // fruits.add(new Fruit("Pitaya", "Red"));
        //fruits.add(new Citrus("Kumqvat", "Orange", 65.6));

        Scanner consoleTwo = new Scanner(System.in);
        System.out.print("Enter Fruit name: ");
        String enterFruit = consoleTwo.nextLine();
        System.out.print("Enter Fruit color: ");
        String enterColor = consoleTwo.nextLine();

        fruits.add(new Fruit(enterFruit, enterColor));

        System.out.print("Enter Citrus name: ");
        String enterCitrus = consoleTwo.nextLine();
        System.out.print("Enter Citrus color: ");
        String enterColorCitrus = consoleTwo.nextLine();
        System.out.print("Enter vitamine gram: ");
        Double gram = consoleTwo.nextDouble();




        System.out.println("Fruits with yellow color:");
        for (Fruit f : fruits) {
            if (f.getColor().equals("Yellow")) {
                System.out.println(f);
            }
        }

        Collections.sort(fruits, Comparator.comparing(Fruit::getName));
        try (PrintWriter writer = new PrintWriter(new File("fruits.txt"))) {
            for (Fruit f : fruits) {
                writer.println(f);
            }
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

       /* try {
            FileInputStream fis = new FileInputStream("fruits.xml");
            ObjectInputStream ois = new ObjectInputStream(fis);
            List<Fruit> fruitsXml = (List<Fruit>) ois.readObject();
            ois.close();
            fis.close();
            System.out.println("Deserialized fruits:");
            for (Fruit f : fruitsXml) {
                System.out.println(f);
            }
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + e.getMessage());
        }*/
    }
}

