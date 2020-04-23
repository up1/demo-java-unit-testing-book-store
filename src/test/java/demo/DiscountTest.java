package demo;

import org.junit.Test;

import static org.junit.Assert.*;

public class DiscountTest {

    private int EUR(double i) {
        return (int)(i * 100);
    }

    @Test
    public void xxx() {
        // Arrange
        Book harryPart1 = new Book("Harry Potter Part 1", EUR(8));
        Book harryPart2 = new Book("Harry Potter Part 2", EUR(8));
        Customer somkiat = new Customer();
        somkiat.selectToBasket(harryPart1, 2);
        somkiat.selectToBasket(harryPart2, 1);
        Basket currentBasket = somkiat.getBasket();

        // Act
        Discount discount = new Discount(currentBasket.getBooks(), currentBasket.getTotalPrice());

        // Assert
        assertEquals("Discount price", EUR(0.8), discount.getPrice());
    }

}