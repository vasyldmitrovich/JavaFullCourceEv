package com.softserve.edu05.homework.task3;

public class Application {
    public static void main(String[] args) {
        Task3.fillArray();
        System.out.println("Position of the second positive number in this array is - ("
                + Task3.getIndex() + ").");
        Task3.message();
        Task3.getMinValueAndPosition();
        System.out.println("The product of all even numbers in this array is - ("
                + Task3.getProductOfEvenValues() + ").");
    }
}
