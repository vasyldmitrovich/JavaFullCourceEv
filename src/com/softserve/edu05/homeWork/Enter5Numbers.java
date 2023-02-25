package com.softserve.edu05.homeWork;

import java.util.Scanner;
/*
 Введіть 5 цілих чисел.
 знайти
        • положення другого додатного числа;
        • мінімум і його положення в масиві.
        Підрахуйте добуток усіх введених парних чисел.
*/

public class Enter5Numbers {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        int minPosition = 0;
        int positionMinNUmber;
        int position = 0;
        int productEvenNumbers = 1;
        int n;
        int min = Integer.MAX_VALUE;

        System.out.println("Enter 5 positive or negative integer numbers: ");

        int[] array = new int[5];
        Scanner console = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.print("Input number: ");
            // n = Integer.parseInt(console.nextLine());
            n = console.nextInt();
            array[i] = n;
        }

        for (int j = 0; j < array.length; j++) {
            if (array[j] > 0) {
                position++;
                if (position == 2)
                    System.out.println("position of second positive number = " + (j + 1));
            }
        }

        for (int k = 0; k < array.length; k++) {
            int j = 0;
            while (j < array.length) {
                if (array[k] < min) {
                    min = array[k];
                    minPosition = k;
                }
                j++;
            }
        }
        System.out.print("Minimum number =" + min);
        System.out.println(" is in " + (minPosition + 1) + " place");

        for (int i : array) {
            if (i % 2 == 0) {
                productEvenNumbers = productEvenNumbers * i;
            }
        }
        System.out.println("Product = " + productEvenNumbers);

    }
}

              /*    for (int k = 0; k < array.length; k++) {
             //  int min = Arrays.stream(array)
             int min;
             k = Arrays.stream(array)
                     .min()
                     .orElseThrow();
             System.out.println("\n Minimum number = " + k );
НЕМОЖУ визначити позицію MIN (( -- спитати!
                }
*/