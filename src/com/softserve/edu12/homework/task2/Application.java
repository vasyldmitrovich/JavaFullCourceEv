package com.softserve.edu12.homework.task2;

import java.util.*;

public class Application {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        run();
    }
    public static void run() {
        System.out.println("Task 1:");
        System.out.println("Your number is - " + readNumber(1,9) + ". It is in range limits");
        System.out.println("Task 2:");
        main();
    }
    public static int readNumber (int a, int b) {
        int number;
        try {
            System.out.println("Enter next integer:");
            number = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException exception) {
            System.out.println("Input is not integer");
            throw new NumberFormatException();
        }
        if (number >= a && number <= b) {
            return number;
        } else {
            throw new OutOfRangeException("Number is out of Range");
        }
    }

    public static void main(){
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            try {
                int number = readNumber(1,100);
                list.add(number);
            }
            catch (OutOfRangeException | NumberFormatException exception){
                System.out.println(exception.getMessage());
            }
        }
        Collections.sort(list);
        System.out.print("1");
        for (var element : list) {
            System.out.print("<" + element);
        }
        System.out.print("<100");
    }
}
