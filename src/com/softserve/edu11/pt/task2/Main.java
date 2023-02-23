package com.softserve.edu11.pt.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter surname, name and patronymic: ");
        String snp = scanner.nextLine();
        String[] person = snp.split(" ");
        System.out.println(person[0] + " " + person[1].substring(0,1) + " " + person[2].substring(0,1));
        System.out.println(person[1]);
        System.out.println(person[1] + " " + person[2] + " " + person[0]);
    }
}
