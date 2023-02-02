package com.softserve.edu05.practical.task1;

public class Task1 {
    private int[] array;

    public int[] getArray() {
        return array;
    }

    public  void setArray(int[] array) {
        this.array = array;
    }

    public static int max(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int i : array) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    public static int sumPositive(int[] array) {
        int sum = 0;
        for (int i : array) {
            if (i > 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static int amountNegative(int[] array) {
        int amount = 0;
        for (int i : array) {
            if (i < 0) {
                amount++;
            }
        }
        return amount;
    }

    public static void whatValuesAreMore(int[] array) {
        int amountPositive = 0;
        int amountNegative = 0;
        int zero = 0;
        for (int i : array) {
            if (i > 0) {
                amountPositive++;
            } else if (i < 0) {
                amountNegative++;
            } else {
                zero++;
            }
        }
        System.out.println("*** \nAmount of value zero in array = " + zero);
        System.out.println("Amount of positive values in array = " + amountPositive);
        System.out.println("Amount of negative values in array = " + amountNegative);
        if (amountPositive > amountNegative) {
            System.out.println("There are more positive values than negative. " +
                    "Difference is - " + (amountPositive - amountNegative) + " value(s)");
        } else if (amountPositive < amountNegative) {
            System.out.println("There are more negative values than positive. " +
                    "Difference is - " + (amountNegative - amountPositive) + " value(s)");
        } else {
            System.out.println("There are equal number of positive and negative values in the array");
        }
    }
}

