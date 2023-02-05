package com.softserve.edu01.Practical_task;

import java.io.Console;
import java.util.Scanner;

public class Define_integer_variables_a_and_b {
    public static void main(String[] args) {

            Scanner console = new Scanner(System.in);
                System.out.println("Write number 'a'");
                int a = console.nextInt();
                System.out.println("Write number 'b'");
                int b = console.nextInt();
                System.out.println("a+b="+(a+b));
                System.out.println("a-b="+(a-b));
                System.out.println("a*b="+(a*b));
                System.out.println("a/b="+(a/b));
    }
}
