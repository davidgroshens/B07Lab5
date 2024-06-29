import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CircleTest {

	@Test
	void constructorTest() {
		Point p = new Point(0, 1);
		double radius = 5.6;
		Circle circ = new Circle(p, radius);
		assertNotNull(circ);
	}
		
	
	@Test
	void circumfrenceTest() {
		Point p = new Point(0,0);
		double radius = 3;
		Circle circ = new Circle(p, radius);
		assertEquals(circ.circumference(), 2 * 3 * Math.PI);
	}
	
	@Test
	void areaTest() {
		Point p = new Point(0,0);
		double radius = 3;
		Circle circ = new Circle(p, radius);
		assertEquals(circ.area(), Math.PI * radius * radius);
	}

}
