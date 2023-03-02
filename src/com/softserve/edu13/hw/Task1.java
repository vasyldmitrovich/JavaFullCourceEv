package com.softserve.edu13.hw;

public class Task1 {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        String str = "abc";
        System.out.println(str);
        System.out.println(encrypt(str, 2));
        System.out.println(decrypt(encrypt(str, 2), 2));
    }

    public static String encrypt(String s, int n){
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] += n;
        }
        return new String(chars);
    }

    public static String decrypt(String s, int n){
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] -= n;
        }
        return new String(chars);
    }

}
