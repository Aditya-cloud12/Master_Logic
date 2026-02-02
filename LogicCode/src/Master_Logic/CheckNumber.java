package Master_Logic;

import java.util.Scanner;

public class CheckNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter First Digit :");
		int a = sc.nextInt();

		System.out.println("Enter Second Digit");
		int b = sc.nextInt();

		if (a > 0 && b > 0 && (a + b) < 100) {
			System.out.println("positive and their sum is less than 100");
		} else {
			System.out.println("Either it is not positive or Either their sum is More than 100");
		}
	}
}
