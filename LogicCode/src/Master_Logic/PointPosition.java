package Master_Logic;

import java.util.Scanner;

public class PointPosition {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter X Coordinate");
		int x = sc.nextInt();

		System.out.println("Enter Y Coordinate");
		int y = sc.nextInt();

		if (x == 0 && y == 0) {
			System.out.println("Point is at Origin");
		} else if (x == 0) {
			System.out.println("Point lies on Y-axis");
		} else if (y == 0) {
			System.out.println("Point lies on x-axis");
		} else {
			System.out.println("Point lies in neither axis");
		}

	}
}
