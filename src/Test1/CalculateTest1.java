package Test1;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class CalculateTest1 {
	@Test
	public void testadd() {
		assertEquals(-4.1,Calculate.add(-6,1.9));
	}
	@Test
	public void testsubtract() {
		assertEquals(-7.9,Calculate.subtract(-6,1.9));
	}
	@Test
	public void testmutilply() {
		assertEquals(-25,Calculate.multiply(10,-2.5));
	}
	@Test
	public void testdivide() throws Exception {
		assertEquals(-4,Calculate.divide(-10,2.5));
	}	
	@Test
	public void testsquare() throws Exception {
		assertEquals(6.25,Calculate.square(-2.5));
	}	
	@Test
	public void testsquare1() throws Exception {
		assertEquals(6.25,Calculate.square(2.5));
	}
	@Test
	public void testsquareroot() throws Exception {
		assertEquals(10.1,Calculate.squareroot(102.01));
	}	
}
