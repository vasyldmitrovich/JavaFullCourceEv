package com.softserve.edu04.Practical_tasks;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of the day of the week: ");
        int dayOfWeek = scan.nextInt();

        switch (dayOfWeek) {
            case 1 -> System.out.println("Понеділок, Monday");
            case 2 -> System.out.println("Вівторок, Tuesday");
            case 3 -> System.out.println("Середа, Wednesday");
            case 4 -> System.out.println("Четвер, Thursday");
            case 5 -> System.out.println("П'ятниця, Friday");
            case 6 -> System.out.println("Субота, Saturday");
            case 7 -> System.out.println("Неділя, Sunday");
            default -> System.out.println("Ви троха випили?, Have you some drunk? =)");
        }
    }
}
