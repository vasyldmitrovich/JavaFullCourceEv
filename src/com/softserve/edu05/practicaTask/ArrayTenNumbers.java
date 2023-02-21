package com.softserve.edu05.practicaTask;

public class ArrayTenNumbers {
    public static void main(String[] args) {
        int[] numbers = {54, -543, 43, 56, 87, -99, 32, 48, -23, 100};
        int max = 0;
        int sumPositive = 0;
        int negative = 0;
        int positive = 0;

        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        System.out.println("Max number = " + max);

        for (int number : numbers) {
            if (number > 0) {
                sumPositive = number + sumPositive;
            }
        }
        System.out.println("The sum of positive numbers  = " + sumPositive);

        for (int number : numbers) {
            if (number < 0) {
                negative++;
            }
        }
        System.out.println("The amount of negative numbers i  = " + negative);

        for (int number : numbers) {
            if (number > 0) {
                positive++;
            }
        }
        if (negative > positive) {
            System.out.println("More negative values");
        } else
            System.out.println("More positive values");

    }
}


/*


        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Max number = " + max);

        for (int j = 0; j < numbers.length; j++) {
            if (numbers[j] > 0) {
                sumPositive = numbers[j] + sumPositive;
            }
        }
        System.out.println("The sum of positive numbers  = " + sumPositive);

        for (int l = 0; l < numbers.length; l++) {
            if (numbers[l] < 0) {
                negative++;
            }
        }
        System.out.println("The amount of negative numbers i  = " + negative);

        for (int k = 0; k < numbers.length; k++) {
            if (numbers[k] > 0) {
                positive++;
            }
        }
        if (negative > positive) {
            System.out.println("More negative values");
        } else
            System.out.println("More positive values");

    }
}
*/
