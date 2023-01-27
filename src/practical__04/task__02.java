package practical__04;

import java.util.Scanner;

public class task__02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of the day of the week: ");
        int a = scan.nextInt();
        switch (a) {
            case 1:
                System.out.print("Monday");
                System.out.print(" - Понеділок.");
                break;
            case 2:
                System.out.print("Tuesday");
                System.out.print(" - Вівторок.");
                break;
            case 3:
                System.out.print("Wednesday");
                System.out.print(" - Середа.");
                break;
            case 4:
                System.out.print("Thursday");
                System.out.print(" - Четвер.");
                break;
            case 5:
                System.out.print("Friday");
                System.out.print(" - П'ятниця.");
                break;
            case 6:
                System.out.print("Saturday");
                System.out.print(" - Субота.");
                break;
            case 7:
                System.out.print("Sunday");
                System.out.print(" - Неділя.");
                break;
        }
    }
}