package practical__07;

public class main {
    public static void main(String[] args) {

        run();
    
    }

    public static void run() {
        Animal animals[] = new Animal[]{
                new Dog(), new Cat(), new Dog(), new Cat()
        };
        for (Animal a : animals) {
            a.voice();
            a.feed();
            System.out.println("");
        }
    }
}
