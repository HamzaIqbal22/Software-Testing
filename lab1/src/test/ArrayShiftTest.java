package test;


import main.ArrayShift;
import static org.junit.Assert.*;
import junit.framework.TestCase;
import org.junit.Test;

public class ArrayShiftTest extends TestCase{
	
	private ArrayShift as;
	private int[] inArray = {4, 6, 0, 3, 4, 5, 4, 4, 6, 2 };
	
	public final void setUp() {
		as = new ArrayShift(); 
	}
	
	@Test
	public final void testShiftOne() {
		
		int[] outArray = as.shiftOne(inArray);
        int[] expArray = {-1,4,6,0,3,4,5,4,4,6};
		
        assertArrayEquals(expArray, outArray);
    }
    
    @Test
    public final void testShiftElements() {
    	int[] expArray = {-1,4,6,0,3,4,5,4,4,6};
        int[] outArray = as.shiftOne(inArray);
        if (expArray[0] != -1  &&  outArray[0] != -1) {
            
            fail("Index values of output array do not match with original array");    
        }
    } 
        
    @Test
    public final void testArrayLength() {
        int[] outArray = as.shiftOne(inArray);
        if (outArray.length!= inArray.length) {
            
            fail("Length of output array do not match with original array");    
        }
    } 	 
}
