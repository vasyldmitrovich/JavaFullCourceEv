package com.softserve.edu04.Homework.Task_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float[] floatNums = new float[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the fractional number: ");
            floatNums[i] = scan.nextFloat();
        }

        boolean numsInRenge = true;

        for (int i = 0; i < 3; i++) {
            if (floatNums[i] < -5 || 5 < floatNums[i]) {
                numsInRenge = false;
                break;
            }
        }

        if (numsInRenge)
            System.out.println("These numbers are in the range [-5; 5] \n");
        else
            System.out.println("These numbers are not in the range [-5; 5] \n");

        // The second task

        int[] nums = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the number: ");
            nums[i] = scan.nextInt();
        }

        int min = nums[0];
        int max = nums[0];

        for (int i = 1; i < 3; i++) {
            if (nums[i] < min)
                min = nums[i];
            if (nums[i] > max)
                max = nums[i];
        }

        System.out.println("\nMax number: " + max);
        System.out.println("Min number: " + min);

        // The third task

        System.out.print("\nEnter the number of HTTP error: ");
        int error = scan.nextInt();

        HTTPError httpError;

        switch (error) {
            case 400 -> httpError = HTTPError.BAD_REQUEST;
            case 401 -> httpError = HTTPError.UNAUTHORIZED;
            case 402 -> httpError = HTTPError.PAYMENT_REQUIRED;
            case 403 -> httpError = HTTPError.FORBIDDEN;
            case 404 -> httpError = HTTPError.NOT_FOUND;
            default -> httpError = HTTPError.MISTAKE;
        }

        httpError.outputError(httpError);
    }
}
