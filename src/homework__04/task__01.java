package homework__04;

import java.util.Scanner;

public class task__01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float a, b, c;
        System.out.println("Enter first number: ");
        a = scan.nextFloat();
        System.out.println("Enter second number: ");
        b = scan.nextFloat();
        System.out.println("Enter third number: ");
        c = scan.nextFloat();

        if (a <= 5 && a >= -5) {
            System.out.println("First number belong to range {5;-5}");
        }
        if (b <= 5 && b >= -5) {
            System.out.println("Second number belong to range {5;-5}");
        }
        if (c <= 5 && c >= -5) {
            System.out.println("Third number belong to range {5;-5}");
        }
    }
}
