package demo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Basket {
    private List<SelectedBook> books = new ArrayList<>();
    private BigDecimal totalPrice;
    private BigDecimal discountPrice;
    private BigDecimal netPrice;

    public void add(Book selectdBook, int quantity) {
        SelectedBook book = new SelectedBook(selectdBook.getName(),
                                selectdBook.getPrice(),
                                quantity);
        books.add(book);
    }

    public int countBook() {
        return books.size();
    }

    public int getTotalPrice() {
        int sum = 0;
        for (SelectedBook book: books) {
            sum += book.getPrice() * book.getQuantity();
        }
        return sum;
    }

    public int getDiscountPrice() {
        Discount discount = new Discount(books, getTotalPrice());
        return discount.getPrice();
    }

    public int getNetPrice() {
        return getTotalPrice() - getDiscountPrice();
    }

    public List<SelectedBook> getBooks() {
        return books;
    }
}

class SelectedBook {
    private String id;
    private String name;
    private int price;
    private int stock;
    private int quantity;

    public SelectedBook(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public int getPrice() {
        return this.price;
    }

    public int getQuantity() {
        return this.quantity;
    }
}