package demo;

import org.junit.Test;

import static org.junit.Assert.*;

public class BasketTest {

    @Test
    public void ลูกค้าเลือกหนังสือ_harry_potter_part_1_จำนวน_1_เล่ม() {
        // Arrange
        Book harryPart1 = new Book("Harry Potter Part 1", EUR(8));
        Customer somkiat = new Customer();
        // Act
        somkiat.selectToBasket(harryPart1, 1);

        // Assert
        Basket currentBasket = somkiat.getBasket();
        assertEquals("# of items in basket", 1, currentBasket.countBook());
        assertEquals("Total price", EUR(8), currentBasket.getTotalPrice());
        assertEquals("Discount price", EUR(0), currentBasket.getDiscountPrice());
        assertEquals("Net price", EUR(8), currentBasket.getNetPrice());
    }

    @Test
    public void ลด_5_percent_เมื่อลูกค้าเลือกหนังสือ_harry_potter_part_1_and_2_จำนวน_1_เล่ม() {
        // Arrange
        Book harryPart1 = new Book("Harry Potter Part 1", EUR(8));
        Book harryPart2 = new Book("Harry Potter Part 2", EUR(8));
        Customer somkiat = new Customer();
        // Act
        somkiat.selectToBasket(harryPart1, 1);
        somkiat.selectToBasket(harryPart2, 1);

        // Assert
        Basket currentBasket = somkiat.getBasket();
        assertEquals("# of items in basket", 2, currentBasket.countBook());
        assertEquals("Total price", EUR(16), currentBasket.getTotalPrice());
        assertEquals("Discount price", EUR(0.8), currentBasket.getDiscountPrice());
        assertEquals("Net price", EUR(15.2), currentBasket.getNetPrice());
    }

    @Test
    public void xxx() {
        // Arrange
        Book harryPart1 = new Book("Harry Potter Part 1", EUR(8));
        Book harryPart2 = new Book("Harry Potter Part 2", EUR(8));
        Customer somkiat = new Customer();
        // Act
        somkiat.selectToBasket(harryPart1, 2);
        somkiat.selectToBasket(harryPart2, 1);

        // Assert
        Basket currentBasket = somkiat.getBasket();
        assertEquals("# of items in basket", 2, currentBasket.countBook());
        assertEquals("Total price", EUR(24), currentBasket.getTotalPrice());
    }

    private int EUR(double i) {
        return (int)(i * 100);
    }

}

class Currency {
    private int input;
    public int EUR(int i) {
        input = i;
        return i * 100;
    }

    @Override
    public String toString() {
        return String.format("%d EUR", input);
    }
}