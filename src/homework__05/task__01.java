package homework__05;

import java.util.Scanner;

public class task__01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dayInMonth[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.println("Enter number of month: ");
        int a = scan.nextInt() - 1;
        System.out.println("Days in this month = " + dayInMonth[a] + ".");
    }
}
