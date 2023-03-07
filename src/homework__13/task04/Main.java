package homework__13.task04;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        run();

    }

    public static void run() {

        LocalDate date = LocalDate.of(1998, 11, 30);

        birthday(date);


    }

    public static void birthday(LocalDate date) {

        System.out.println("Day of the week: " + date.getDayOfWeek());

        System.out.println("Day of the week(plus 6 months): " + date.plusMonths(6).getDayOfWeek());

        System.out.println("Day of the week(plus 12 months): " + date.plusMonths(12).getDayOfWeek());

    }
}
