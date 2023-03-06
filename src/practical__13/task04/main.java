package practical__13.task04;


import practical__13.task04.Condition;

public class main {
    public static void main(String[] args) {

        run();

    }

    public static void run() {
        Condition cond = x -> x > 0;
        int[] arr = new int[]{12, -12, 15, -15, 54, 2, -7, 4 - 6, -7};
        count(arr, cond);

    }

    public static void count(int[] arr, Condition cond) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {

            if (cond.contidion(arr[i])) {
                sum += arr[i];
            }

            
        }
        System.out.println("Sum of elements which defines a condition: " + sum);
    }
}
