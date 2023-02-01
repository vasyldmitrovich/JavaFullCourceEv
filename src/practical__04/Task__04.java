package practical__04;

import java.util.Objects;

public class Task__04 {
    public static void main(String[] args) {
        Product milk = new Product("Milk", 67, 20);
        Product apple = new Product("Apple", 25, 98);
        Product banana = new Product("Banana", 32, 8);
        Product tomato = new Product("Tomato", 52, 99);
        price(milk.getPrice(), apple.getPrice(), banana.getPrice(), tomato.getPrice(), milk.getName(), milk.getQuonity());
        price(apple.getPrice(), milk.getPrice(), banana.getPrice(), tomato.getPrice(), apple.getName(), apple.getQuonity());
        price(banana.getPrice(), milk.getPrice(), apple.getPrice(), tomato.getPrice(), banana.getName(), banana.getQuonity());
        price(tomato.getPrice(), milk.getPrice(), apple.getPrice(), banana.getPrice(), tomato.getName(), tomato.getQuonity());
        quontity(milk.getQuonity(), apple.getQuonity(), banana.getQuonity(), tomato.getQuonity(), milk.getName());
        quontity(apple.getQuonity(), milk.getQuonity(), banana.getQuonity(), tomato.getQuonity(), apple.getName());
        quontity(banana.getQuonity(), milk.getQuonity(), apple.getQuonity(), tomato.getQuonity(), banana.getName());
        quontity(tomato.getQuonity(), milk.getQuonity(), apple.getQuonity(), banana.getQuonity(), tomato.getName());

    }

    public static void price(int r, int b, int c, int d, String a, int h) {
        if (r > b && r > c && r > d) {
            System.out.println("");
            System.out.println("Name of product: " + a + ".");
            System.out.println("Quontity = " + h + ".");
        }
    }

    public static void quontity(int h, int j, int k, int l, String a) {
        if (h > j && h > k && h > l) {
            System.out.println("");
            System.out.println("Name of product with biggest quontity: " + a + ".");
        }
    }
}


