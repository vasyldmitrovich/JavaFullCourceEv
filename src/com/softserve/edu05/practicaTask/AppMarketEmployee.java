package com.softserve.edu05.practicaTask;

import java.util.Scanner;

public class AppMarketEmployee {
    public static void main(String[] args) {
        MarketEmployee mar0 = new MarketEmployee("Meat department", 1, 200);
        MarketEmployee mar1 = new MarketEmployee("Alcohol department", 2, 180);
        MarketEmployee mar2 = new MarketEmployee("Bakery", 3, 190);
        MarketEmployee mar3 = new MarketEmployee("Clothing department", 4, 170);
        MarketEmployee mar4 = new MarketEmployee("Department of Chemistry", 5, 185);

        Scanner number = new Scanner(System.in);
        System.out.println("Enter department number  ");
        String result;
        result = switch (number.nextInt()) {
            case 1 -> "Meat department";
            case 2 -> "Alcohol department";
            case 3 -> "Bakery";
            case 4 -> "Clothing department";
            case 5 -> "Department of Chemistry";
            default -> "Enter a number from 1 to 5";
        };
        System.out.println(result);

        int[] array = {mar0.getSalary(), mar1.getSalary(), mar2.getSalary(), mar3.getSalary(), mar4.getSalary()};
        for (int i = 0; i < array.length; i++) {
            int indexMin = i;
            int min = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > min) {
                    indexMin = j;
                    min = array[j];
                }
            }
            array[indexMin] = array[i];
            array[i] = min;

            if (array[i] == mar0.getSalary())
                System.out.println("Salary  - " + mar0.getSalary() + " " + "    in   " + mar0.getFieldsName());
            else if (array[i] == mar1.getSalary())
                System.out.println("Salary  - " + mar1.getSalary() + " " + "    in   " + mar1.getFieldsName());
            else if (array[i] == mar2.getSalary())
                System.out.println("Salary  - " + mar2.getSalary() + " " + "    in   " + mar2.getFieldsName());
            else if (array[i] == mar3.getSalary())
                System.out.println("Salary  - " + mar3.getSalary() + " " + "    in   " + mar3.getFieldsName());
            else if (array[i] == mar4.getSalary())
                System.out.println("Salary  - " + mar4.getSalary() + " " + "    in   " + mar4.getFieldsName());
        }
    }
}
