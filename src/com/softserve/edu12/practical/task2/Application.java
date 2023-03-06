package com.softserve.edu12.practical.task2;

public class Application {
    public static void main(String[] args) {
        run();
    }
    public static void run() {
        try {
            // do not comment any line to get SizeException from line 2
            // comment line 2 to get TypeException from line 4
            // comment line 2 and line 4 to get ColorException from line 5
            System.out.print("#1 - ");
            System.out.println(new Plant(5, Color.BLACK, Type.CAR)); //1
            System.out.print("#2 - ");
            System.out.println(new Plant(0, Color.WHITE, Type.BIKE)); //2
            System.out.print("#3 - ");
            System.out.println(new Plant(4, "red", "truck")); //3
            System.out.print("#4 - ");
            System.out.println(new Plant (2, "black", "skate")); //4
            System.out.print("#5 - ");
            System.out.println(new Plant(2, "pink", "boat")); //5
        } catch (SizeException  | ColorException | TypeException exception) {
            System.out.println(exception.getMessage());
            exception.printStackTrace();
        }
    }
}
