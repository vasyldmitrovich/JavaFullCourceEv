package com.softserve.edu13.homework.task1;

import java.util.Scanner;

public class Solution {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        String text = "Russian warship go f*ck yourself!";
        System.out.println("Original text: - " + text);
        double cryptCode = getCryptNumber();
        String encryptedText = encrypt(text, cryptCode);
        System.out.println("Encrypted text: - " + encryptedText);
        String decryptedText = decrypt(encryptedText, cryptCode);
        System.out.println("Decrypted text: - " + decryptedText);
    }

    public static String encrypt(String input, double n) {
        StringBuilder builder = new StringBuilder();
        var list = input.chars().mapToObj(element -> (char) (element + n)).toList();
        for (var element : list) {
            builder.append(element);
        }
        return builder.toString();
    }

    public static String decrypt(String input, double n) {
        StringBuilder builder = new StringBuilder();
        var list = input.chars().mapToObj(element -> (char) (element - n)).toList();
        for (var element : list) {
            builder.append(element);
        }
        return builder.toString();
    }

    public static double getCryptNumber() {
        System.out.println("Please input crypt number:");
        double cryptNumber = 0;
        while (cryptNumber == 0) {
            try {
                cryptNumber = Math.floor(Double.parseDouble(scanner.nextLine()));
            } catch (NumberFormatException exception) {
                System.out.println("Please input integer");
            }
        }
        return cryptNumber;
    }
}
