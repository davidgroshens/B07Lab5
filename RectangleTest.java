package lab4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    Point A_1, A_2, A_3;
    Point B_1, B_2, B_3;
    Point C_1, C_2, C_3;
    Point D_1, D_2, D_3;

    Rectangle rectangle_1, rectangle_2, rectangle_3;

    @BeforeEach
    void setUp() {
        A_1 = new Point(0, 0);
        B_1 = new Point(0, 2);
        C_1 = new Point(2, 2);
        D_1 = new Point(2, 0);

        rectangle_1 = new Rectangle(A_1, B_1, C_1, D_1);

        A_2 = new Point(0, 0);
        B_2 = new Point(0, 3);
        C_2 = new Point(2, 3);
        D_2 = new Point(2, 0);

        rectangle_2 = new Rectangle(A_2, B_2, C_2, D_2);

        A_3 = new Point(1, 1);
        B_3 = new Point(2, 3);
        C_3 = new Point(4, 2);
        D_3 = new Point(3, 0);

        rectangle_3 = new Rectangle(A_3, B_3, C_3, D_3);
    }

    @Test
    void perimeter() {
        assertEquals(8, rectangle_1.perimeter());
        assertEquals(10, rectangle_2.perimeter());
        assertEquals(8.9442719099991592202059110, rectangle_3.perimeter());
    }

    @Test
    void isEquilateral() {
        assertTrue(rectangle_1.isEquilateral());
        assertFalse(rectangle_2.isEquilateral());
        assertTrue(rectangle_3.isEquilateral());
    }
}