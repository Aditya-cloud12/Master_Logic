package Master_Logic;

import java.util.Scanner;

public class SumOfDigits {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num = sc.nextInt();

		int sum = 0;

		if (num < 0)
			num = -num;

		while (num != 0) {
			sum = sum + (num % 10);
			num = num / 10;
		}

		System.out.println("Sum of digits = " + sum);
	}
}
