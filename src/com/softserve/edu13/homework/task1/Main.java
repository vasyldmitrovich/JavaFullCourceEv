package com.softserve.edu13.homework.task1;

public class Main {
    public static void main(String[] args) {
        String str = "abc";
        System.out.println("String: " + str);

        String code = encrypt(str);
        System.out.println("Coded string: " + code);

        String origin = decrypt(code);
        System.out.println("Origin string: " + origin);
    }

    public static String encrypt(String str){
        StringBuilder newStr = new StringBuilder();

        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            newStr.append((char)(c + 3));
        }

        return String.valueOf(newStr);
    }

    public static String decrypt(String str){
        StringBuilder newStr = new StringBuilder();

        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            newStr.append((char)(c - 3));
        }

        return String.valueOf(newStr);
    }
}
