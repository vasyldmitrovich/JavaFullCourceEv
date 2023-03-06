package practical__13.task01;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        LocalDateTime day = LocalDateTime.now();

        DayOfWeek day1 = day.getDayOfWeek();

        System.out.println("Today is: " + day1);
    }

}
