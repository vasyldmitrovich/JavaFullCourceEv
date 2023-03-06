package practical__13.task02;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class Main {
    public static void main(String[] args) {
        LocalDate day = LocalDate.now();

        LocalDate firstMonday = day.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));

        System.out.println("In current month first monday is: " + firstMonday);
    }

}
