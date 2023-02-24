package homework__10;


import java.util.HashSet;
import java.util.Set;

public class main {
    public static void main(String[] args) {

        run();

    }

    public static void run() {

        System.out.println("Homework task 01");

        System.out.println(" ");

        Set<String> set1 = new HashSet<>();

        set1.add("AAA");

        set1.add("ABB");

        set1.add("ACC");

        set1.add("BDD");

        Set<String> set2 = new HashSet<>();

        set2.add("BAA");

        set2.add("AAA");

        set2.add("ACC");

        set2.add("BDD");

        union(set1, set2);
        intersection(set1, set2);

    }

    public static Set<String> union(Set<String> set1, Set<String> set2) {
        Set<String> unionSet = new HashSet<>();

        unionSet.addAll(set1);

        unionSet.addAll(set2);

        System.out.println(unionSet);

        return unionSet;
    }

    public static Set<String> intersection(Set<String> set1, Set<String> set2) {

        Set<String> intersection = new HashSet<>();

        for (String temp : set2) {
            if (set1.contains(temp)) {

                intersection.add(temp);
            }
        }
        System.out.println(intersection);
        return null;
    }


}
