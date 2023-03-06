package homework__13.task01;

public class Main {
    public static void main(String[] args) {


        run();


    }


    public static void run() {
        String a = "abc";

        System.out.println("You created string: " + a);

        int n = 4;

        System.out.println("Encrypt massage: " + encrypt(a, n));

        System.out.println("Decrypt massage: " + decrypt(encrypt(a, n), n));


    }


    public static String encrypt(String s, int n) {
        StringBuilder f = new StringBuilder();
        for (char str : s.toCharArray()) {

            f.append((char) (str + n));

        }

        return f.toString();
    }


    public static String decrypt(String s, int n) {


        return encrypt(s, -n);

    }

}
