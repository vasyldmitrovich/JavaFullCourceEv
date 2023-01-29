package practical__04;

import java.util.Objects;

public class Product {
    private String name;
    private int price;
    private int quontity;


    public String nameQuontity() {
        System.out.println("Name of product: " + this.name);
        System.out.println("Quntity of product: " + this.quontity);
        return "";
    }

    public String getName() {

        return name;
    }

    public Product() {

    }

    public Product(String name, int price, int quontity) {
        this.name = name;
        this.price = price;
        this.quontity = quontity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuonity() {
        return quontity;
    }

    public void setQuonity(int quonity) {
        this.quontity = quonity;
    }


}
