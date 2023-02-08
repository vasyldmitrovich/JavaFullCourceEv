package com.softserve.edu07.hw.task1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SalariedEmployee first = new SalariedEmployee("id101", "Vasyl", 15, 172, "number1");
        SalariedEmployee second = new SalariedEmployee("id109","Petro", 16, 170, "number2");
        ContractEmployee third = new ContractEmployee("id105","Misha", 2900, 123456);
        ContractEmployee fourth = new ContractEmployee("id111","Dmytro", 3100, 654321);

        List<Employee> workers = new ArrayList<>();
        workers.add(first);
        workers.add(second);
        workers.add(third);
        workers.add(fourth);

        workers.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return -o1.calculatePay() + o2.calculatePay();
            }
        });
        for (Employee temp: workers) {
            System.out.println("employee: " + temp.getEmployeeId() + "\t" + temp.getName() + "\t salary = " + temp.calculatePay() + "USD");
        }

    }
}
