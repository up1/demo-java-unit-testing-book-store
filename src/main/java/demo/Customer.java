package demo;

public class Customer {
    Basket basket = new Basket();
    public void selectToBasket(Book harryPart1, int quantity) {
        basket.add(harryPart1, quantity);
    }

    public Basket getBasket() {
        return basket;
    }
}
