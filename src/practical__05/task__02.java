package practical__05;

import java.util.Arrays;
import java.util.Scanner;

public class task__02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*Create method that return array Employee, and there call that method and set data from method to variable*/
        Employee em1 = new Employee("Volodymyr", 2000);
        Employee em2 = new Employee("Ivan", 4500);
        Employee em3 = new Employee("Petr", 5200);
        Employee em4 = new Employee("John", 3000);
        Employee em5 = new Employee("Pavlo", 3900);
        /*All is good, but create method, that method send message to user and return int*/
        System.out.println("Enter the number of department for first employee: ");
        int a = scan.nextInt();
        em1.setDepartmentNumber(a);
        System.out.println("Enter the number of department for second employee: ");
        int b = scan.nextInt();
        em2.setDepartmentNumber(b);
        System.out.println("Enter the number of department for third  employee: ");
        int c = scan.nextInt();
        em3.setDepartmentNumber(c);
        System.out.println("Enter the number of department for fourth employee: ");
        int d = scan.nextInt();
        em4.setDepartmentNumber(d);
        System.out.println("Enter the number of department for five employee: ");
        int e = scan.nextInt();
        em5.setDepartmentNumber(e);
        //Task №2
        int arrr[] = new int[]{em1.getSalary(), em2.getSalary(), em3.getSalary(), em4.getSalary(), em5.getSalary()};
        boolean isSorted = false;
        int temp;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < arrr.length - 1; i++) {
                if (arrr[i] < arrr[i + 1]) {
                    temp = arrr[i];
                    arrr[i] = arrr[i + 1];
                    arrr[i + 1] = temp;
                    isSorted = false;
                }
            }
        }
        int w = 1;
        for (int i = 0; i < arrr.length; i++) {
            System.out.println(w + "." + " salary is " + arrr[i] + "$.");
            w++;
        }

        //Task №1
        String numberdep = null;
        int salary[] = new int[]{em1.getSalary(), em2.getSalary(), em3.getSalary(), em4.getSalary(), em5.getSalary()};
        int arr[] = new int[]{em1.getDepartmentNumber(), em2.getDepartmentNumber(), em3.getDepartmentNumber(), em4.getDepartmentNumber(), em5.getDepartmentNumber()};
        for (int i = 0; i < arr.length; i++) {
            for (int q = i + 1; q < arr.length; q++) {
                if (arr[i] == arr[q]) {
                    numberdep = Integer.toString(arr[i]);

                }

            }


        }
        System.out.println("");
        if (numberdep == null) {
            System.out.println("First enter number of department.");
        } else {
            System.out.println("Department № " + numberdep + " has two or more employees.");
        }
    }
}
