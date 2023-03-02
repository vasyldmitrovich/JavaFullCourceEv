package com.softserve.edu13.hw;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Task2 {
    public static void main(String[] args) {
        run();
    }

    public static void run(){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yy");
        System.out.println("today - " + sdf.format(calendar.getTime()) + "(mm/dd/yy)");
    }
}
