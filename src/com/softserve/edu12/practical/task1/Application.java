package com.softserve.edu12.practical.task1;

import java.util.Scanner;

public class Application {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        Rectangle first = new Rectangle(6, 7);
        System.out.println("Area of the first rectangle is - " + first.squareRectangle() + "\n");
        Rectangle second = new Rectangle();
        try {
            System.out.println("Please input size of sideA for second rectangle");
            second.setSideA(Integer.parseInt(scanner.nextLine()));
            System.out.println("Please input size of sideB for second rectangle");
            second.setSideB(Integer.parseInt(scanner.nextLine()));
        }
        catch (NumberFormatException e)  {
            System.out.println("You input not a integer");
            throw new NumberFormatException();
        }
        catch (MyException exception) {
            System.out.println(exception.getMessage());
        }
        System.out.println("Area of the second rectangle is - " + second.squareRectangle());
    }
}
