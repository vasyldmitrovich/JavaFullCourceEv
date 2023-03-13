package com.softserve.edu17teamWork;

import java.util.Scanner;

public class Task4 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        System.out.print("Please input any text and the application will calculate number of loud letter in it: ");
        String text = getUserInput();
        char[] array = text.toCharArray();
        int countLowerCaseLatin = getLowCaseLatin(array);
        int countUpperCaseLatin = getUpperCaseLatin(array);
        int countLowerCaseCyrillic = getLowerCaseCyrillic(array);
        int countUpperCaseCyrillic = getUpperCaseCyrillic(array);
        int total = countLowerCaseCyrillic + countUpperCaseCyrillic + countLowerCaseLatin + countUpperCaseLatin;
        System.out.println("Number of loud letters - is: " + total);
        System.out.println("Among them:");
        System.out.println("Number of lower case latin loud letters - is: " + countLowerCaseLatin);
        System.out.println("Number of upper case latin loud letters - is: " + countUpperCaseLatin);
        System.out.println("Number of lower case cyrillic loud letters - is: " + countLowerCaseCyrillic);
        System.out.println("Number of upper case cyrillic loud letters - is: " + countUpperCaseCyrillic);
    }

    public static String getUserInput() {
        return scanner.nextLine();
    }

    public static int getLowCaseLatin(char[] array) {
        int countLowerCaseLatin = 0;
        for (char c : array) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'y' || c == 'u') {
                countLowerCaseLatin++;
            }
        }
        return countLowerCaseLatin;
    }

    public static int getUpperCaseLatin(char[] array) {
        int countUpperCaseLatin = 0;
        for (char c : array) {
            if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'Y' || c == 'U') {
                countUpperCaseLatin++;
            }
        }
        return countUpperCaseLatin;
    }

    public static int getLowerCaseCyrillic(char[] array) {
        int countLowerCaseCyrillic = 0;
        for (char c : array) {
            if (c == 'а' || c == 'е' || c == 'у' || c == 'о' || c == 'і' || c == 'и' || c == 'ю' || c == 'є' || c == 'ї' || c == 'я') {
                countLowerCaseCyrillic++;
            }
        }
        return countLowerCaseCyrillic;
    }

    public static int getUpperCaseCyrillic(char[] array) {
        int countUpperCaseCyrillic = 0;
        for (char c : array) {
            if (c == 'А' || c == 'Е' || c == 'У' || c == 'О' || c == 'І' || c == 'И' || c == 'Ю' || c == 'Є' || c == 'Ї' || c == 'Я') {
                countUpperCaseCyrillic++;
            }
        }
        return countUpperCaseCyrillic;
    }
}
