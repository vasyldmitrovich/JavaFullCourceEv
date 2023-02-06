package homework__05;

import java.lang.reflect.Array;
import java.util.Scanner;

public class task__04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Car car1 = new Car("BMW", 2.4f);
        Car car2 = new Car("Hyndai", 1.6f);
        Car car3 = new Car("Skoda", 2.0f);
        Car car4 = new Car("Audi", 1.8f);
        Car car5 = new Car("Mazda", 2.5f);
        System.out.println("Enter model year of first car: ");
        int a = scan.nextInt();
        car1.setYear(a);
        System.out.println("Enter model year of second car: ");
        int b = scan.nextInt();
        car2.setYear(b);
        System.out.println("Enter model year of third car: ");
        int c = scan.nextInt();
        car3.setYear(c);
        System.out.println("Enter model year of fourth car: ");
        int d = scan.nextInt();
        car4.setYear(d);
        System.out.println("Enter model year of fifth car: ");
        int e = scan.nextInt();
        car5.setYear(e);
        int arrOfYearModel[] = new int[]{car1.getYear(), car2.getYear(), car3.getYear(), car4.getYear(), car5.getYear()};
        boolean isSorted = false;
        int temp;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < arrOfYearModel.length - 1; i++) {
                if (arrOfYearModel[i] < arrOfYearModel[i + 1]) {
                    temp = arrOfYearModel[i];
                    arrOfYearModel[i] = arrOfYearModel[i + 1];
                    arrOfYearModel[i + 1] = temp;
                    isSorted = false;
                }
            }
        }
        System.out.println("Cars ordered by the field year: ");
        for (int i = 0; i < arrOfYearModel.length; i++) {
            System.out.println(i + " car is car which field year is " + " [" + arrOfYearModel[i] + "]");
        }
    }
}