package Test1;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class CalculateTest2 {
	@Test
	public void testadd() {
		assertEquals(-4,Calculate.add(-6,1.9));
	}
	@Test
	public void testsubtract() {
		assertEquals(-7.8,Calculate.subtract(-6,1.9));
	}
	@Test
	public void testmutilply() {
		assertEquals(-25.1,Calculate.multiply(10,-2.5));
	}
	@Test
	public void testdivide() throws Exception {
		assertEquals(0,Calculate.divide(-10,0));
	}	
	@Test
	public void testdivide1() throws Exception {
		assertEquals(-0,Calculate.divide(0,0));
	}	
	@Test
	public void testsquare() throws Exception {
		assertEquals(6.2,Calculate.square(-2.5));
	}	
	@Test
	public void testsquare1() throws Exception {
		assertEquals(6.2,Calculate.square(2.5));
	}
	@Test
	public void testsquareroot() throws Exception {
		assertEquals(10.1,Calculate.squareroot(-102.01));
	}	
}
