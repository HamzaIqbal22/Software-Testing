package main;

public class Calculation {
	
	public static int findMax(int arr[]){
		int max=arr [0];
		
		for(int i = 1;i<arr.length;i++){
			if(max<arr[i]){
				max=arr[i];
			}
		 }
		System.out.println ("Max is: " + max);
		return max; 
	 }
	
	public static int cube(int n){
		System.out.println ("The cubed of " + n + " is: " + n*n*n);
		return n*n*n;
	}
}
