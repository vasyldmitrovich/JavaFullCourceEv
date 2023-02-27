package practical__12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = 0;
        int b = 0;

        try {

            System.out.println("Enter length of rectangle: ");

            a = scan.nextInt();

            System.out.println("Enter width of rectangle: ");

            b = scan.nextInt();

        } catch (InputMismatchException e) {

            System.out.println("You can enter only numbers.");
            return;
        }


        //

        try {
            squareRectangle(a, b);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static int squareRectangle(int a, int b) throws Exception {
        if (a < 0 | b < 0) {

            throw new Exception("You enter negative values.");
        }
        int s = a * b;

        System.out.println("Area of rectangle = " + s);
        return s;

    }
}
