package demo;

import java.util.Random;

public class Book {
    private String id;
    private String name;
    private int price;
    private int stock;

    public Book(String id, String name, int price, int stock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public Book(String name, int price) {
        this(String.valueOf(new Random().nextInt()),
                name, price, 10);
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
