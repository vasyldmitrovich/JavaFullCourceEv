package com.softserve.edu03.practical;

public class Application {
    public static void main(String[] args) {

        Employee CEO = new Employee("Sir Alex Fergusson", 50, 100);
        Employee coach = new Employee (35, 140);
        Employee goalkeeper = new Employee("David de Gea");
        Employee topGoalScorer = new Employee();

        coach.setName("Eric ten Hag");
        goalkeeper.setRate(99);
        goalkeeper.setHours(120);
        topGoalScorer.setName("Marcus Rashford");
        topGoalScorer.setRate(111);
        topGoalScorer.setHours(108);

        System.out.println("\n" + "Total staff is " + Employee.getEmployeeCount() + " persons:" + "\n");

        System.out.println(CEO);
        System.out.println(coach);
        System.out.println(goalkeeper);
        System.out.println(topGoalScorer);

        System.out.println("Total salary budget is " + Employee.getSalaryBudget() + "€");


    }
}
