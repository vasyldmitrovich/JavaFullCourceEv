package com.softserve.edu07.homeWork;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AppPayment {
    public static void main(String[] args) {
        run();
    }

    public static void run() {

        ContractEmployee contractEmployee = new ContractEmployee(40, 3200, "Stepan Bogdanovich", "640");
        ContractEmployee contractEmployee1 = new ContractEmployee(20, 4200, "Oleg Viktorovich", "840");
        SalariedEmployee salariedEmployee = new SalariedEmployee("103", 21, 17, "Iryna", "00067");
        SalariedEmployee salariedEmployee1 = new SalariedEmployee("102", 20, 17, "Kolya", "0087");

        List<Employee> employees = new ArrayList<>();
        employees.add(contractEmployee);
        employees.add(contractEmployee1);
        employees.add(salariedEmployee);
        employees.add(salariedEmployee1);

        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return -o1.calculatePay() + o2.calculatePay();
            }
        });
        for (Employee temp : employees) {
            System.out.println(temp.getEmployeedId() + "\t" + temp.getName() +
                    "\t salary = " + temp.calculatePay() + "USD");
        }
    }
}
