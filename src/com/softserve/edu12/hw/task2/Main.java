package com.softserve.edu12.hw.task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        run(1, 100);
    }

    public static void run(int start, int end){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            System.out.print("enter value №" + (i + 1) + ": ");
            int y = readNumber(start, end);
            if(y <= end && y >= start) list.add(y);
        }
        Collections.sort(list);
        System.out.println(list);
    }

    public static int readNumber(int start, int end){
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        try {
            num = scanner.nextInt();
            if(num < start | num > end) throw new Exception();
        }catch (Exception e){
            System.err.println("\nonly a number must be entered and only between " + start + " and " + end);
        }
        return num;
    }
}
