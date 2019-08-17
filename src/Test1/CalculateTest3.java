package Test1;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class CalculateTest3{
	@Test
	public void testdivide() throws Exception {
		assertEquals(0,Calculate.divide(0,0));
	}
	@Test
	public void testdivide1() throws Exception {
		assertEquals(0,Calculate.divide(0,-0.1));
	}	
	@Test
	public void testdivide2() throws Exception {
		assertEquals(0,Calculate.divide(0,0.1));
	}	
	@Test
	public void testdivide3() throws Exception {
		assertEquals(0,Calculate.divide(0.1,0));
	}
	@Test
	public void testdivide4() throws Exception {
		assertEquals(0,Calculate.divide(-0.1,0));
	}	
	@Test
	public void testsquareroot() throws Exception {
		assertEquals(0,Calculate.squareroot(0));
	}	
	@Test
	public void testsquareroot1() throws Exception {
		assertEquals(1.1,Calculate.squareroot(-1.21));
	}	
	@Test
	public void testsquareroot2() throws Exception {
		assertEquals(1.1,Calculate.squareroot(1.21));
	}	
}