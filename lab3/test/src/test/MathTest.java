package test;

import static org.junit.Assert.*;
import main.Math;

import org.junit.Before;
import org.junit.Test;

public class MathTest {

		
	@Test
	public void t1Test() {
		int result1 = Math.func(2, 3);
		assertEquals ( 1 ,result1);		
	}
	
	@Test
	public void t2Test() {
		int result2 = Math.func(3, 2);
		assertEquals ( 1 ,result2);		
	}
	
	@Test
	public void t3test() {
		int result3 = Math.func(3, 3);
		assertEquals ( 0 ,result3);	
	}

}
