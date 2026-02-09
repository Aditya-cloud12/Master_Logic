package Master_Logic;

import java.util.Scanner;

public class SumGreaterThanProduct {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number (1-9999): ");
		int num = sc.nextInt();
		int d1, d2, d3, d4;
		int sum, product;

		if (num >= 1 && num <= 9) {
			d1 = num;

			sum = d1;
			product = d1;
		} else if (num <= 99) { 
			d1 = num / 10;
			d2 = num % 10;

			sum = d1 + d2;
			product = d1 * d2;
		} else if (num <= 999) { 
			d1 = num / 100;
			d2 = (num / 10) % 10;
			d3 = num % 10;

			sum = d1 + d2 + d3;
			product = d1 * d2 * d3;
		} else if (num <= 9999) { 
			d1 = num / 1000;
			d2 = (num / 100) % 10;
			d3 = (num / 10) % 10;
			d4 = num % 10;

			sum = d1 + d2 + d3 + d4;
			product = d1 * d2 * d3 * d4;
		} else {
			System.out.println("Invalid number!");
			return;
		}

		if (sum > product)
			System.out.println("Sum is greater than Product");
		else
			System.out.println("Sum is NOT greater than Product");
	}
}
