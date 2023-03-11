package homework__15.task03;

public class Main {
    public static void main(String[] args) {
        Thread one = new Thread(() -> {
            System.out.println("Thread one started");
            Thread two = new Thread(() -> {
                for (int i = 1; i <= 3; i++) {
                    System.out.println("Thread number two");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                Thread three = new Thread(() -> {
                    for (int i = 1; i <= 5; i++) {
                        System.out.println("Thread number three");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                });
                three.start();
            });
            two.start();
        });
        one.start();

    }
}
