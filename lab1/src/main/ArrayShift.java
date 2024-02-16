package main;

public class ArrayShift {

	public int [] shiftOne (int [] inArray){
		for (int i=0; i< inArray.length; i++){
			
			//checking to see if each element is non-negative integer
			if (inArray [i] < -1){
			    System.out.println("Error. No non-negative integers allowed.");
				System.exit(0); 
			}
		}
	    
        for(int i=inArray.length-1; i>0; i--){
                inArray[i]= inArray[i-1];
        }
        inArray[0]= -1;
        
        for(int i = 0; i <inArray.length; i++) {
            System.out.print(inArray[i] + " ");
        }    
        return inArray;
    	
    }
	
	
	
	public static void main (String [] args){
		/*
		int[] inArray = {4, 6, 1, 3, 4, 5, 4, 4, 6, 2 };
	      ArrayShift obj = new ArrayShift ();
	      int [] outArray =  obj.shiftOne (inArray);

*/	      

	}
}
