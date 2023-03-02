package com.softserve.edu13.pt;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class Task1 {
    public static void main(String[] args) {
        run();
        LocalDate ld = LocalDate.now();
        System.out.println(ld.getDayOfWeek());
    }
    public static void run(){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE");
        System.out.println("today - " + sdf.format(calendar.getTime()));
    }
}
