package practical__14.task02;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        run();

    }

    public static void run() {
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);

        //Task 1(count)
        long count = primes.stream().count();

        System.out.println("Count of elements in List: " + count);


        //Task 2 (sum,min,max)

        IntSummaryStatistics stat = primes.stream()
                .mapToInt((x) -> x).summaryStatistics();

        System.out.println("Sum of elements: " + stat.getSum());

        System.out.println("Max of elements: " + stat.getMax());

        System.out.println("Min of elements: " + stat.getMin());
    }
}
