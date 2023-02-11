package homework__06;

public class Task__01 {
    public static void main(String[] args) {

        Bird[] bird = {new Eagle("Long", "Eagle", 25),
                new Kiwi("Short", "Kiwi", 30),
                new Penguin("Short", "Penguin", 33),
                new Swallow("Middle", "Swallow", 40)};

        for (Bird a : bird) {
            System.out.println(a);
            a.fly();
        }
    }
}
