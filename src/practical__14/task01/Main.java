package practical__14.task01;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        run();
    }

    public static void run() {

        List<String> list = Arrays.asList("bla", "", "simp", "", "second", "third", "third", "sec", "blablabla");

        System.out.println("Original list " + list);
        //Task 1

        int filtered = (int) list.stream().filter(string -> string.length() == 0).count();

        System.out.println("(Task 1) In this arrays there are " + filtered + " empty strings.");

        //Task 2

        List<String> emptyString = list.stream().filter(string -> !(string.length() == 0)).collect(Collectors.toList());

        System.out.println("(Task 2) List without empty strings " + emptyString);

        //Task 3

        String upperCase = list.stream()
                .filter(string -> !string.isEmpty())
                .map(String::toUpperCase)
                .collect(Collectors.joining(", "));

        System.out.println("(Task 3) List with uppercase: " + upperCase);


    }
}
