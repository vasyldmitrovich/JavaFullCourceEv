package com.softserve.edu04;

import com.softserve.edu03.stat.Helper;

public class App {
    public static void main(String[] args) {
        int width = 13, height = 7;
        System.out.println("width = " + width + "\theight = " + height);
        swap(width, height);
        System.out.println("width = " + width + "\theight = " + height);
    }
    public static void swap(int w, int h) {
        int temp = w;
        w = h;
        h = temp;
        System.out.println("width = " + w + "\theight = " + h);
    }
}


