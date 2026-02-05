package Master_Logic;

import java.util.Scanner;

public class ValidDate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Month");
		int month = sc.nextInt();

		System.out.println("Enter Day");
		int day = sc.nextInt();

		if (month < 1 || month > 12 || day < 1) {
			System.out.println("Invalid Date or Month");
		} else if (month == 2 && day > 28) {
			System.out.println("Invalid Date or Month");
		} else if ((month == 4 || month == 6 || month == 9 || month == 11) && day > 30) {
			System.out.println("Invalid Date or Month");
		} else if (day > 31) {
			System.out.println("Invalid Date or Month");
		} else {
			System.out.println("Valid Date or Month");
		}

	}
}
