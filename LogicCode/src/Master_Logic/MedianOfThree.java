package Master_Logic;

import java.util.Scanner;

public class MedianOfThree {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println(" Enter First Number ");
		int a = sc.nextInt();

		System.out.println("Enter Second Number");
		int b = sc.nextInt();

		System.out.println("Enter Third Number");
		int c = sc.nextInt();

		if ((a > b && a < c) || (a > c && a < b)) {
			System.out.println("Median value is: " + a);
		} else if ((b > a && b < c) || (b > c && b < a)) {
			System.out.println("Median value is: " + b);
		} else {
			System.out.println("Median value is: " + c);
		}
	}
}
