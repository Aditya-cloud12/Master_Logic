package Master_Logic;

import java.util.Scanner;

public class EligibleForTax {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Age  :");
		int age = sc.nextInt();

		System.out.println("Enter Salary  :");
		int income = sc.nextInt();

		if (age > 18 && income > 500000) {
			System.out.println("Eligible for Tax");
		} else {
			System.out.println("Not Eligible for Tax");
		}

	}
}
