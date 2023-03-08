package com.softserve.edu13.homework.task2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        long currentTime = System.currentTimeMillis();
        String myCurrentTime = new SimpleDateFormat("MM.dd.yyyy").format(new Date(currentTime));

        checkDate(myCurrentTime);
        checkDate("08.27.2004");
        checkDate("2000.05.05");
    }

    public static void checkDate(String time){
        System.out.println(time);

        SimpleDateFormat format = new SimpleDateFormat("MM.dd.yyyy");
        format.setLenient(false);   // not a lenient check

        try {
            format.parse(time);
            System.out.println("Correct date!");
        } catch (ParseException e) {
            System.out.println("Incorrect date...");
        }
    }
}
