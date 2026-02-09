package Master_Logic;

import java.util.Scanner;

public class CompareDates {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter first date (day month): ");
		int d1 = sc.nextInt();
		int m1 = sc.nextInt();

		System.out.print("Enter second date (day month): ");
		int d2 = sc.nextInt();
		int m2 = sc.nextInt();

		if (m1 < m2)
			System.out.println("First date comes first in calendar");
		else if (m1 > m2)
			System.out.println("Second date comes first in calendar");
		else { 
			if (d1 < d2)
				System.out.println("First date comes first in calendar");
			else if (d1 > d2)
				System.out.println("Second date comes first in calendar");
			else
				System.out.println("Both dates are same");
		}
	}
}
