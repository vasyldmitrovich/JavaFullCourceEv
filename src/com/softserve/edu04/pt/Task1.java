package com.softserve.edu04.pt;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter your number:  ");
            oddCheck(scanner.nextInt());
        }
    }
    private static void oddCheck(int nextInt) {
        if(nextInt%2 == 0){
            System.out.println("number is a multiple of two");
        } else {
            System.out.println("number is not a multiple of two");
        }
    }
}
