package homework__05;

import java.util.Scanner;

public class task__03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter length of array: ");
        int a = scan.nextInt();
        int x[] = new int[a];
        for (int i = 0; i < x.length; i++) {
            System.out.println("Enter number of array:  ");
            int b = scan.nextInt();

            x[i] = b;
        }
        //Task №1
        int min = x[0];
        int index = 0;
        for (int i = 0; i < x.length; i++) {
            if (min > x[i]) {
                min = x[i];
                index = i;
            }
        }
        System.out.println("Min of array = " + min + ".");
        System.out.println("Index of min number = " + index + ".");
        //Task №2
        int positive = x[0];
        int index2 = 0;
        int secondpositive = x[0];
        for (int i = 0; i < x.length; i++) {
            if (x[i] > 0) {
                positive = secondpositive;
                secondpositive = x[i];
                index2 = i;
                if (positive != 0 && secondpositive != 0 && positive != secondpositive) {
                    break;
                }
            }

        }
        System.out.println("First positive number = " + positive + ".");
        System.out.println("Second positive number = " + secondpositive + ".");
        System.out.println("Index of second positive number: " + index2 + ".");
        //Task №3
        int count = 1;
        for (int i = 0; i < x.length; i++) {
            if (x[i] % 2 == 0) {
                count *= x[i];
            }
        }
        System.out.println("Product of even numbers: " + count + ".");
    }
}
