import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TriangleTest {
	Triangle t1,t2,t3,t4;
	long a[];
	@Before
	public void setUp() throws Exception {
		t1 = new Triangle(2,2,2);
		t2 = new Triangle(1,1,3);
		t3 = new Triangle(1,2,2);
		t4 = new Triangle(2,3,4);
		a = t1.getBorders();
	}

	@Test
	public void test() {
		assertEquals(t1.getType(t1),"Regular");
		assertEquals(t2.getType(t2),"Illegal");
		assertEquals(t3.getType(t3),"Isosceles");
		assertEquals(t4.getType(t4),"Scalene");
		assertTrue(a[1] ==1);
		
	}

}

