package practical__04;

import java.util.Scanner;

public class task__01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //First task
        int A, B, C;
        System.out.println("Enter A nubmer: ");
        A = scan.nextInt();
        System.out.println("Enter B number: ");
        B = scan.nextInt();
        System.out.println("Enter C nubmer: ");
        C = scan.nextInt();
        oddNubmers(A, B, C);

    }

    static void oddNubmers(int A, int B, int C) {
        if (A % 2 == 0) {
            System.out.println("A number is odd.");
        } else {
            System.out.println("A nubmer is not odd.");
        }
        if (B % 2 == 0) {
            System.out.println("B number is odd.");
        } else {
            System.out.println("B nubmer is not odd.");
            if (C % 2 == 0) {
                System.out.println("C number is odd.");
            } else {
                System.out.println("C nubmer is not odd.");
            }
        }
    }
}