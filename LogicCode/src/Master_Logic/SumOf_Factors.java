package Master_Logic;

import java.util.Scanner;

public class SumOf_Factors {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number: ");
		int n = sc.nextInt();

		int sum = 0;

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				sum += i;
			}
		}

		System.out.println("Sum of factors = " + sum);
	}
}
