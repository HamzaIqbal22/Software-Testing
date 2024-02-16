package main;

public class fibonacci {

	public static int fibonacci_iterative(int n)
    {
        if (n <= 1){
        	return 1;
        }
        return fibonacci_iterative(n - 1) + fibonacci_iterative(n - 2);
    }
	
	
	public static void main(String args[])
    {
        int n = 9;
        System.out.println(fibonacci_iterative(n));
    }
	
}
