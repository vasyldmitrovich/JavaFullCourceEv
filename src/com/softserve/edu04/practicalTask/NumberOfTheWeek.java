
package com.softserve.edu04.practicalTask;

import java.util.Scanner;


public class NumberOfTheWeek {
    private static String[] args;

    public static void main(String[] args) {
        NumberOfTheWeek.args = args;
        EnPol en = new EnPol("Polski", "English");
        EnPol pol = new EnPol("Polski", "English");

        Scanner console = new Scanner(System.in);
        System.out.print("Enter the number of the day of the week: ");
        int number = console.nextInt();
        String result = switch (number) {
            case 1 -> "MONDAY (Poniedziałek)";
            case 2 -> "TUESDAY (Wtorek)";
            case 3 -> "WEDNESDAY (Sroda)";
            case 4 -> "THURSDAY (Czwartek)";
            case 5 -> "FRIDAY (Piątek)";
            case 6 -> " SATURDAY (Sobota)";
            case 7 -> " SUNDAY (Niedziela)";
            default -> "Wrong!";
        };

        System.out.println(result);

    }
}

/*

        Scanner console = new Scanner(System.in);
        System.out.print("Podaj numer dnia tygodnia: ");
        int number = console.nextInt();
        String result;

        switch (number)

        {
            case 1:
                result = "Poniedziałek";
                break;

            case 2:
                result = "Wtorek";
                break;
            case 3:
                result = "Sroda";
                break;
            case 4:
                result = "Czwartek";
                break;
            case 5:
                result = "Piątek";
                break;
            case 6:
                result = "Sobota";
                break;
            case 7:
                result = "Niedziela";
                break;
            default:
                result = "Zło!";
        }
        System.out.println(result);

}

}
*/

/*

//_____________________________________________________________________
*/

/*
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the number of the day of the week: ");
        int number = console.nextInt();
        String result;

        switch (number){
            case 1:
                result = "MONDAY (Poniedziałek)";
                break;

            case 2:
                result = "TUESDAY (Wtorek)";
                break;
            case 3:
                result = "WEDNESDAY (Sroda)";
                break;
            case 4:
                result = "THURSDAY (Czwartek)";
                break;
            case 5:
                result = "FRIDAY (Piątek)";
                break;
            case 6:
                result = " SATURDAY (Sobota)";
                break;
            case 7:
                result = " SUNDAY (Niedziela)";
                break;
            default:
                result = "Wrong!";
        }
        System.out.println(result);

    }
}*/