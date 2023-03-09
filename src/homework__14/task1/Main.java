package homework__14.task1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        run();

    }

    public static void run() {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Phone", 2023, 1500));
        list.add(new Product("Phone", 2022, 1545));
        list.add(new Product("Fridge", 2010, 1400));
        list.add(new Product("Phone", 1999, 3600));
        list.add(new Product("Car", 1953, 1700));
        list.add(new Product("Phone", 2022, 1900));
        list.add(new Product("Car", 1988, 1200));
        list.add(new Product("Fridge", 1992, 13500));
        list.add(new Product("Phone", 2023, 15600));
        list.add(new Product("Fridge", 1968, 15700));
        list.add(new Product("Car", 1995, 15300));
        list.add(new Product("Phone", 2023, 15800));
        list.add(new Product("Car", 1994, 15500));
        list.add(new Product("Car", 1998, 15700));
        list.add(new Product("Fridge", 1991, 15400));
        list.add(new Product("Phone", 1991, 15200));
        list.add(new Product("Car", 1995, 15100));
        list.add(new Product("Phone", 1989, 15300));
        list.add(new Product("Fridge", 1978, 15600));
        list.add(new Product("Phone", 1978, 15900));


        List<Product> sorted = list.stream()
                .filter(s -> ((s.getManufactureCategory() == "Phone") || (s.getManufactureCategory() == "phone")))
                .filter(s -> ((s.getPrice() > 3000) && (s.getDateOfManufacture() < 2022)))
                .collect(Collectors.toList());

        System.out.println(sorted);
    }
}
