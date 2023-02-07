package homework__05;

import java.util.Scanner;

public class task__02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter length of array: ");
        int a = scan.nextInt();
        int arr[] = new int[a];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the array value: ");
            int c = scan.nextInt();
            arr[i] = c;
        }
        System.out.println("");
        System.out.println("Your array:");
        int sum = 0;
        int r = 5;
        int product = 1;
        int x;// = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("[" + arr[i] + "]");
        }
        for (x = 0; x < 5; x++) {
            if (arr[x] > 0) {
                sum += arr[x];
                count++;
            }
            if (count != 5 && r < arr.length) {
                product *= arr[r];
                r++;
            }
        }

        System.out.println("");
        if (count == 5) {
            System.out.println("Sum of first 5 elements = " + sum);
        }
        if (count != 5) {
            System.out.println("Product of last 5 elements = " + product);
        }
    }
}

