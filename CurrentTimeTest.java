import static org.junit.Assert.*;

import org.junit.Test;

public class CurrentTimeTest {

	@Test
	public void testCurrentTime() {
		CurrentTime ct = new CurrentTime();
		assertNotNull(ct);
	}
	
	@Test
	public void testGetSeconds() {
		long input = 1000;
		CurrentTime ct = new CurrentTime(input);
		long actual = ct.getSeconds();
		long expected = 1;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testCurrentSeconds() {
		long input = 61 * 1000;
		CurrentTime ct = new CurrentTime(input);
		long actual = ct.getCurrentSeconds();
		long expected = 1;
		assertEquals(expected, actual);
		
		input = 60 * 1000;
		ct = new CurrentTime(input);
		actual = ct.getCurrentSeconds();
		expected = 0;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetMinutes() {
		long input = 1000 * 60;
		CurrentTime ct = new CurrentTime(input);
		long actual = ct.getMinutes();
		long expected = 1;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetCurrentMinutes() {
		long input = 1000 * 60 * 61;
		CurrentTime ct = new CurrentTime(input);
		long actual = ct.getCurrentMinutes();
		long expected = 1;
		assertEquals(expected, actual);
		
		input = 1000 * 60 * 60;
		ct = new CurrentTime(input);
		actual = ct.getCurrentMinutes();
		expected = 0;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetHours() {
		long input = 1000 * 60 * 60 * 2;
		CurrentTime ct = new CurrentTime(input);
		long actual = ct.getHours();
		long expected = 2;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetCurrentHours() {
		long input = 1000 * 60 * 60 * 61;
		CurrentTime ct = new CurrentTime(input);
		long actual = ct.getCurrentHours();
		long expected = 1;
		assertEquals(expected, actual);
		
		input = 1000 * 60 * 60 * 60;
		ct = new CurrentTime(input);
		actual = ct.getCurrentHours();
		expected = 0;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testToString() {
		
	}

}
