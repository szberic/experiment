import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleTest {
		 

	@Test
	public void testEquilateral() {
		Triangle t1 = new Triangle(4, 4, 4);
		assertEquals("equilateral",t1.message);
	}
	@Test
	public void testIsosceles() {
		Triangle t2 = new Triangle(2, 10, 10);
		assertEquals("isosceles",t2.message);
	}
	@Test
	public void testIScalene() {
		Triangle t3 = new Triangle(3, 4, 5);
		assertEquals("scalene",t3.message);
	}
	@Test
	public void testNotaTriangle() {
		Triangle t3 = new Triangle(1, 2, 4);
		assertEquals("Not a Triangle",t3.message);
	}
	@Test
	public void testillegal() {
		Triangle t3 = new Triangle(-1, 2, -3);
		assertEquals("illegal",t3.message);
	}

}
