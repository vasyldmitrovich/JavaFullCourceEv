package homework_12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = 0;
        double b = 0;
        try {
            System.out.println("Enter a value:");

            a = scan.nextDouble();

            System.out.println("Enter b value:");

            b = scan.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Enter only numbers!");

        }


        div(a, b);


    }

    public static void div(double a, double b) throws ArithmeticException {


        double res = 0;
        try {
            if (b == 0) {
                throw new ArithmeticException();
            }
            res = a / b;
            System.out.println(res);
        } catch (ArithmeticException e) {
            System.out.println("You entered second values as zero is not correct.");

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }


    }
}
