package practical__13.task03;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        List<String> names = Arrays.asList("Petro", "Ivan", "Dmitro", "Roman", "Nazar", "Vitaliy");

        System.out.println("Original array: " + names);

        List<String> sortedName = names.stream().sorted().toList();

        System.out.println("Sorted array" + sortedName);
    }
}
