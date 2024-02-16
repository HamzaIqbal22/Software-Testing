package test;

import org.junit.Test;

import main.ArrayMult;
import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.Assert;

import static org.junit.Assert.assertArrayEquals;

public class ArrayMultTest extends TestCase{

	private ArrayMult as;
	 int[] first_array = {1, 3, 5, 4};
	 int[] second_array = {1, 4, 5, 2};
	
	public final void setUp() {
		as = new ArrayMult(); 
	}
	
	
	@Test
	public final void testMult() {
		
		int[] multArray1 = as.mult(first_array, second_array);
		int[] multArray2 = as.mult(second_array, first_array);
		int[] expArray = {1, 12,25,8};
		
		System.out.println("Test for multiplication:");
       assertArrayEquals(expArray, multArray1);
       assertArrayEquals(expArray, multArray2);
    }
	
	
	@Test
	public final void testLength() {
		int[] first_array = {1, 3, 5, 4, 6 ,8};
		int[] second_array = {1, 4, 5, 2};
		
		int[] multArray1 = as.mult(first_array, second_array);
		
		int[] multArray2 = as.mult(second_array, first_array);
		
		System.out.println("Test for Array Lengths:");
		assertEquals(first_array.length, multArray1.length);
		assertEquals(first_array.length, multArray2.length);
		
		assertEquals(first_array[first_array.length-1], multArray1[multArray1.length-1]);
		
		
    }
	
	@Test
	public final void testValues () {
		
		int[] multArray1 = as.mult(first_array, second_array);
		int[] multArray2 = as.mult(second_array, first_array);
		
		for (int i = 0;i < first_array.length; i++) {
			assertEquals(first_array[i] * second_array[i], multArray1[i]);
		}
		
		for (int i = 0; i < first_array.length; i++) {
			assertEquals(first_array[i] * second_array[i], multArray2[i]);
		}
		
	}

}
