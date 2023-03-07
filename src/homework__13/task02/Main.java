package homework__13.task02;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        run();

    }

    public static void run() {

        LocalDateTime date = new Date(System.currentTimeMillis()).toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();

        System.out.println("Original date: " + date);

        System.out.println("Formatted date: " + data(date));

    }

    public static String data(LocalDateTime date) {

        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MM.dd.yy");

        return date.format(dateFormat);

    }

}
