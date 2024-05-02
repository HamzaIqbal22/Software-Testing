package main;

public class Triclass {
	
	public static String classify(int X, int Y, int Z) {
		
		String scalene = "scalene";
		String equilateral = "equilateral";
		String isoceles = "isosceles";
		String invalid = "not a triangle";
		
		if((X + Y) < Z || (X + Z) < Y || (Y + Z) < X) {
			return invalid;
		}		
		
		if(X <= 0 || X > 10 || Y <= 0 || Y > 10 || Z <= 0 || Z > 10) {
			return invalid;
		}
							
		if(X != Y && Y != Z && X != Z) {
			return scalene;
		}
		
		else {
			if(X == Y && Y == Z)
				return equilateral;
			else
				return isoceles;
		}
		
	}
	
		
}
