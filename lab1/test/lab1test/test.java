package lab1test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import lab1.program;



public class test {
	program cal;
	@Before
	public void setup() {
		cal =new program();
	}
	@Test
	public void testchecktrue() {
		assertEquals(true,cal.check(73));
	}
	@Test
	public void testcheckfalse1() {
		assertEquals(false,cal.check(-20));
	}
	@Test
	public void testcheckfalse2() {
		assertEquals(false,cal.check(4));
	}
}
