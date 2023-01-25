package practical__01;

import java.util.Scanner;

public class first__task {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b, sum;
        System.out.print("Write a value: ");
        a = scan.nextInt();
        System.out.print("Write b value: ");
        b = scan.nextInt();
        sum = a + b;
        int sum1 = a - b;
        int sum2 = a * b;
        int sum3 = a / b;
        System.out.println("a = " + a + "\n" + "b = " + b + "\n" + "a + b = " + sum + "\n" + "a - b = " + sum1 + "\n" + "a * b = " + sum2 + "\n" + "a / b = " + sum3);

    }
}