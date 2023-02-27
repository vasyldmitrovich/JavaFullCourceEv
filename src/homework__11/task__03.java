package homework__11;

import java.util.Scanner;

import java.util.regex.Matcher;

import java.util.regex.Pattern;

public class task__03 {

    public static void main(String[] args) {


        String pattern = "\\$\\d*\\.\\d{2}";

        String task3 = "Hello$1255555.245 lorr $100.290 jor $25.555";

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(task3);

        while (m.find()) {

            System.out.println("*" + task3.substring(m.start(), m.end()) + "*");
        }
    }

}
