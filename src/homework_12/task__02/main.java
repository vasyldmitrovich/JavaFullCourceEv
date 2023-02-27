package homework_12.task__02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int start = 0;

        int end = 0;


        try {
            System.out.println("Enter start value: ");

            start = scan.nextInt();

            System.out.println("Enter end value: ");

            end = scan.nextInt();


        } catch (InputMismatchException e) {

            System.out.println("Enter only numbers.");
        }

        try {
            readNumber(start, end);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static void readNumber(int c, int b) throws Exception {
        Scanner scan = new Scanner(System.in);

        int reslut = 0;

        try {
            System.out.println("Enter value.");
            reslut = scan.nextInt();
            if (c > reslut | reslut > b) {

                throw new Exception();
            }

        } catch (Exception e) {

            System.out.println("Number out of range.");
        }
    }
}
