package com.softserve.edu04.pt;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("Enter number of day of the week: ");
            switch (scanner.nextInt()){
                case 1:
                    System.out.println(WeekDay.FIRST);
                    break;
                case 2:
                    System.out.println(WeekDay.SECOND);
                    break;
                case 3:
                    System.out.println(WeekDay.THIRD);
                    break;
                case 4:
                    System.out.println(WeekDay.FOURTH);
                    break;
                case 5:
                    System.out.println(WeekDay.FIFTH);
                    break;
                case 6:
                    System.out.println(WeekDay.SIXTH);
                    break;
                case 7:
                    System.out.println(WeekDay.SEVENTH);
                    break;
                default:
                    System.out.println("no such day of the week");
                    break;
            }
        }
    }
}
enum WeekDay{
    FIRST("понеділок", "mondey"), SECOND("вівторок", "tuesday"), THIRD("середа", "wednesday"),
    FOURTH("четвер","thursday"), FIFTH("п'ятниця", "friday"), SIXTH("субота", "saturday"),
    SEVENTH("неділя", "sunday");
    private final String ua;
    private final String en;

    WeekDay(String ua, String en) {
        this.ua = ua;
        this.en = en;
    }

    @Override
    public String toString() {
        return "ua ='" + ua + '\'' +
                ", en ='" + en + '\'';
    }
}
