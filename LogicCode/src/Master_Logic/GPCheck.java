package Master_Logic;

import java.util.Scanner;

public class GPCheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Three Number");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if (b * a == c * b) {
			System.out.println("In Geometric Progression");
		} else {
			System.out.println("Not in Geometric Progression");
		}
	}
}
