package test;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.Test;

import main.fibonacci;
import static org.junit.Assert.*;
import junit.framework.TestCase;

import java.lang.Math;

import org.junit.Assert;

import static org.junit.Assert.assertArrayEquals;


public class fibonacciTest extends TestCase {

	@Test
	public void test1() {
		int index = 9;
		int accVal = fibonacci.fibonacci_iterative(index);
		System.out.println(fibonacci.fibonacci_iterative(index));
		int expVal = 55;
		assertEquals (expVal,accVal);
	}
	
	@Test
	public void test2() {
		int index = -1;
		int accVal = fibonacci.fibonacci_iterative(index);
		System.out.println(fibonacci.fibonacci_iterative(index));
		int expVal = 1;
		assertEquals (expVal,accVal);
	}
	
	@Test
	public void test3() {
		int index = 6;
        int expVal = 13;

        assertEquals(expVal, fibonacci.fibonacci_iterative(index));
	}

	//Test case to compare the first two values of fib seqeunce returned by the function to be the same
	@Test
	public void test4() {
		
		int firstIndex = fibonacci.fibonacci_iterative(0);
		int secondIndex = fibonacci.fibonacci_iterative(1);
		 if (firstIndex != secondIndex) {
	            fail("First two values of fib seq should match (=1)");
	        }
	}
	
}
