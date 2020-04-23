package demo;

import org.junit.Test;

import static org.junit.Assert.*;

public class BookTest {

    @Test
    public void สร้างหนังสือเล่มที่1_ราคา_8_EUR() {
        // Arrange
        // Act
        Book harryPart1 = new Book("Harry Potter Part 1", EUR(8));
        // Assertion
        assertEquals("Harry Potter Part 1", harryPart1.getName());
        assertEquals(EUR(8), harryPart1.getPrice());
    }

    @Test
    public void สร้างหนังสือเล่มที่2_ราคา_8_EUR() {
        // Arrange
        // Act
        Book harryPart1 = new Book("Harry Potter Part 2", EUR(8));
        // Assertion
        assertEquals("Harry Potter Part 2", harryPart1.getName());
        assertEquals(EUR(8), harryPart1.getPrice());
    }

    private int EUR(int price) {
        return 8*100;
    }

}