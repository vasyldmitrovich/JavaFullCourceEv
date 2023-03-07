package homework__13.task03;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {


        run();
    }


    public static void run() {
        LocalDate date = LocalDate.now();

        year(date);

    }


    public static void year(LocalDate date) {


        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy");

        System.out.println("Your year: " + date.format(dateFormat));

        Integer yearLeap = Integer.parseInt(date.format(dateFormat));


        if (yearLeap % 4 == 0 && yearLeap != 100 || yearLeap % 400 == 0) {

            System.out.println("This year is leap");

        } else {

            System.out.println("This year is not leap");
        }
        
    }
}
