package com.softserve.edu08.practical;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        Department original = new Department("Production", new Department.Address("Chernivtsi", "Freedom avenue", 1));
        System.out.println("\nPrint original department:\n" + original);
        Department cloned = null;
        try {
            cloned = (Department) original.clone();
        } catch (CloneNotSupportedException exception) {
            System.out.println("Houston we got a problem");
            exception.printStackTrace();
        }
        System.out.println("\nPrint cloned department:\n" + cloned);
    }

    public static String userInput() {
        System.out.println("Please input a city name for cloned department:");
        return new Scanner(System.in).nextLine();
    }
}
