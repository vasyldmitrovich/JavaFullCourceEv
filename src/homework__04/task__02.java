package homework__04;

import java.util.Scanner;

public class task__02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter A number: ");
        a = scan.nextInt();
        System.out.println("Enter B number: ");
        b = scan.nextInt();
        System.out.println("Enter C number: ");
        c = scan.nextInt();

        int max = 0, min = a;

        if (a > max) {
            max = a;
        }
        if (b > max) {
            max = b;

        }
        if (c > max) {
            max = c;
        }
        System.out.println("Max number is: " + max);

        if (a < min) {
            min = a;
        }
        if (b < min) {
            min = b;

        }
        if (c < min) {
            min = c;
        }
        System.out.println("Min number is: " + min);
    }


}
