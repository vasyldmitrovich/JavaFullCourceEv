package com.softserve.edu11.hw.task3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String text = "Asfjaksd aslkda lksjdlka $432.14 asljhdjka askdlajsjda asdha lsdla $54.32 ashkhdasj.";
        Main.found(text);
    }

    public static void found(String str){
        Pattern pattern = Pattern.compile("\\$(\\d*)\\.(\\d{2})");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()){
            System.out.println(matcher.group() + " ");
        }
    }
}
