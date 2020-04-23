package demo;

import java.util.List;

public class Discount {
    private final List<SelectedBook> books;
    private final int totalPrice;

    public Discount(List<SelectedBook> books, int totalPrice) {
        this.books = books;
        this.totalPrice = totalPrice;
    }

    public int getPrice() {
        if(books.size() > 1) {
            return (int) (totalPrice * 0.05);
        }
        return 0;
    }
}
