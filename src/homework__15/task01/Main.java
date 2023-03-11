package homework__15.task01;

public class Main {

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("First thread: " + i);
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Second thread " + i);
            }
        });

        Thread t3 = new Thread(() -> {
            try {
                t1.join();
                t2.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for (int i = 0; i < 5; i++) {
                System.out.println("Third thread " + i);
            }
        });

        t1.start();
        t2.start();
        t3.start();
    }
}

