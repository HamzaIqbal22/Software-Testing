package test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import main.Triclass;

public class TriclassTest {
	
	private static int testCounter = 0;
		
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Testing started");
	}
		
	@AfterClass
	public static void afterClass() {
		System.out.println("Testing finished");
	}
		
	@Before
	public void setUp() {
	    testCounter++;
	    System.out.println("Test #" + testCounter + " - started");
	 
	}

	@After
	public void tearDown() {
	    System.out.println("Test #" + testCounter + " - finished");
	}
		
	@Test
	public final void testScalene() {
		String output = Triclass.classify(5, 7, 8);
		assertEquals(output, "scalene");
	}
		
		//Boundary Testing
	@Test
	public final void testValidLow() {
		String output = Triclass.classify(5, 5, 2);
		assertEquals(output, "isosceles");
	}
		
	@Test
	public final void testValidNormal() {
		String output = Triclass.classify(5, 5, 5);
		assertEquals(output, "equilateral");
	}
		
	@Test
	public final void testValidHigh() {
		String output = Triclass.classify(5, 5, 9);
		assertEquals(output, "isosceles");
	}
		
	@Test
	public final void testInvalidLow() {
		String output = Triclass.classify(5, 5, 0);
		assertEquals(output, "not a triangle");
	}
		
	@Test
	public final void testInvalidHigh() {
		String output = Triclass.classify(5, 5, 11);
		assertEquals(output, "not a triangle");
	}

}
