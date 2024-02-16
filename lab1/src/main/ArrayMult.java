package main;

public class ArrayMult {

	public int[] mult(int[] array1, int[] array2) {
		
		   int[] short_array = array1;
		   int[]  long_array = array2;
		 
		   if (array2.length < array1.length) {
			   long_array  = array1;
				short_array  = array2;
			}
			
			int[] outArray = new int[long_array.length];
			
			for (int i = 0; i < long_array.length; i++) {
				if (i < short_array.length) {
					outArray[i] = array1[i] * array2[i];
				} 
				else {
					outArray[i] = long_array [i];
				}
			}
			
			for(int i = 0; i <outArray.length; i++) {
	            System.out.print(outArray[i] + " "); 
	        }
			System.out.println(""); 
			return outArray;
	
	}
	
	
	public static void main (String [] args){
		
		int[] inArray1 = {4, 6, 1, 3, 5 ,6};
		int[] inArray2 = {4, 1, 1, 3};
	     ArrayMult obj = new ArrayMult ();
	     int [] outArray =  obj.mult(inArray1, inArray2);
	     
	    
	     
	}
}
