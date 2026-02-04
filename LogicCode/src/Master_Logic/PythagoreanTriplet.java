package Master_Logic;

import java.util.Scanner;

public class PythagoreanTriplet {
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter first number: ");
	        int a = sc.nextInt();

	        System.out.print("Enter second number: ");
	        int b = sc.nextInt();

	        System.out.print("Enter third number: ");
	        int c = sc.nextInt();

	        if ((a*a + b*b == c*c) ||
	            (a*a + c*c == b*b) ||
	            (b*b + c*c == a*a))
	            System.out.println("Pythagorean Triplet");
	        else
	            System.out.println("Not a Pythagorean Triplet");
	    }
			
			
		}	
}
