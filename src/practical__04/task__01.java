package practical__04;

import java.util.Scanner;

public class task__01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //First task
       
        int a, b, c;
        System.out.println("Enter A nubmer: ");
        a = scan.nextInt();
        System.out.println("Enter B number: ");
        b = scan.nextInt();
        System.out.println("Enter C nubmer: ");
        c = scan.nextInt();
        oddNubmers(a, b, c);

    }


    static void oddNubmers(int a, int b, int c) {
        if (a % 2 == 0) {
            System.out.println("A number is odd.");
        } else {
            System.out.println("A nubmer is not odd.");
        }
        if (b % 2 == 0) {
            System.out.println("B number is odd.");
        } else {
            System.out.println("B nubmer is not odd.");
            if (c % 2 == 0) {
                System.out.println("C number is odd.");
            } else {
                System.out.println("C nubmer is not odd.");
            }
        }
    }
}