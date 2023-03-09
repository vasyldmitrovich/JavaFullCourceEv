package homework__14.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        run();

    }

    public static Optional<String> mostPopularName(Stream<Employee> employees) {
        Map<String, Long> counter = (Map<String, Long>) employees
                .map(Employee::getName)
                .collect(Collectors.groupingBy(name -> name, Collectors.counting()));


        Optional<String> result = counter.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey);
        ;

        if (result.isPresent()) {
            System.out.println("Most popular name: " + result.get());
        } else {
            System.out.println("No employees found.");
        }


        return null;
    }

    public static void run() {
        List<Employee> list = new ArrayList<>();

        list.add(new Employee("Ivan"));
        list.add(new Employee("Ivan"));
        list.add(new Employee("Igor"));
        list.add(new Employee("Nazar"));


        System.out.println(mostPopularName(list.stream()));

       /* Stream<Employee> employyers = Stream.of(first, second, third, fourth);

        Optional<String> result = mostPopularName(employyers);

        if (result.isPresent()) {
            System.out.println("Most popular name: " + result.get());
        } else {
            System.out.println("No employees found.");
        }*/
    }
}
