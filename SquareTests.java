package lab4;

import java.lang.Math;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class SquareTests {
	
	double root2 = Math.sqrt(2);

	@Test
	void testEqualPerimConstruct1() {
		Point p1 = new Point(0,0);
		Point p2 = new Point(5,0);
		Point p3 = new Point(0,5);
		Point p4 = new Point(5,5);
		
		Square s = new Square(p1, p2, p3, p4);
		
		assertEquals(s.perimeter, 20);
	}
	
	@Test
	void testEqualPerimConstruct2() {
		Point p1 = new Point(0,0);
		Point p2 = new Point(5,0);
		
		Square s = new Square(p1, p2);
		
		assertEquals(s.perimeter, 20);
	}
	
	@Test
	void testEqualDiagConstruct1() {
		Point p1 = new Point(0,0);
		Point p2 = new Point(root2,0);
		Point p3 = new Point(0, root2);
		Point p4 = new Point(root2, root2);
		
		Square s = new Square(p1, p2, p3, p4);
		
		assertEquals(s.getDiagonal, 2);
	}
	
	@Test
	void testEqualDiagConstruct2() {
		Point p1 = new Point(0,0);
		Point p2 = new Point(root2,0);
		
		Square s = new Square(p1, p2);
		
		assertEquals(s.getDiagonal, 2);
	}

}
