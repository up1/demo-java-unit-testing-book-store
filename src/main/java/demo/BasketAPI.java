package demo;

public class BasketAPI {

    public void call(String JSON) {
        // Customer + Books

        Customer customer = null;
        Book book1 = null; // Get detail from DB
        Book book2 = null; // Get detail from DB
        customer.selectToBasket(book1, 1);
        customer.selectToBasket(book2, 1);
    }
}
