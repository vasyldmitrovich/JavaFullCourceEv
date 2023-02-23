package com.softserve.edu11.pt.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String first = scanner.nextLine();

        System.out.print("Enter second string: ");
        String second = scanner.nextLine();

        boolean result = false;
        for (int i = 0; i < (second.length() - first.length()); i++) {
            result = first.regionMatches(0, second, i, first.length());
            if(result) break;
        }
        System.out.println("Is first string a substring of second? - " + result);
    }
}
