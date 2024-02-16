package test;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.Test;

import main.ArrayMult;
import main.Calculation;
import static org.junit.Assert.*;
import junit.framework.TestCase;

import java.lang.Math;

import org.junit.Assert;

import static org.junit.Assert.assertArrayEquals;

public class CalculationTest extends TestCase {
	

	
	@BeforeClass
	public static void BeforeClass() {
		System.out.println ("Before Class Running");
	}
	
	@Before
	public static void BeforeTest() {
		System.out.println ("Before Test");
	}
	
	
	@Test
	public void testMax() {
		System.out.println ("Testing FindMax Method:");
		int[] testArray1 = {1, 12,25,8};
		int maxArray1 = Calculation.findMax(testArray1);
		int expMax1 = 25;
		assertEquals(expMax1, maxArray1);
	}
	
	@Test
	public void testMax2() {
		System.out.println ("Testing FindMax2 Method:");
		int[] testArray2 = {7, 0,7,3};
		int maxArray2 = Calculation.findMax(testArray2);
		int expMax2 = 7;
		assertEquals(expMax2, maxArray2);
        if (expMax2 != maxArray2) {
            fail("expected max should be the same as output max");
        }
	}
	
	@Test
	public void testMaxNeg() {
		System.out.println ("Testing FindMaxNeg Method");
		int[] testNegArray = {-12, -3,-4, -2};
		int maxArray = Calculation.findMax(testNegArray);
		int expMax1 = -2;
		assertEquals(expMax1, maxArray);
	}
	
	@Test
	public void testCube() {
		System.out.println ("Before Testing Cube Method");
		int testCube = Calculation.cube(3);
		int expVal = 3*3*3;
		assertEquals(expVal, testCube);
	}
		@Test
	public void testCube2() {
		System.out.println ("Testing testCube2 Method:");
		int testCube = Calculation.cube(2);
		int cubeValue =2;
		if (cubeValue != Math.cbrt(testCube)) {
            fail("incorrect cube value.");
	
        }
	}
	
	@AfterClass
	public static void AfterClass() {
		System.out.println ("After Class Running");
	}
	
	@After
	public static void AfterTest() {
		System.out.println ("After Test");
	}
}
