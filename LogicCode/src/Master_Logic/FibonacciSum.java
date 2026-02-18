package Master_Logic;

import java.util.Scanner;

public class FibonacciSum {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of terms: ");
		int n = sc.nextInt();

		int a = 0, b = 1;
		int sum = 0;

		for (int i = 1; i <= n; i++) {
			sum += a;

			int c = a + b;
			a = b;
			b = c;
		}

		System.out.println("Sum = " + sum);
	}
}
