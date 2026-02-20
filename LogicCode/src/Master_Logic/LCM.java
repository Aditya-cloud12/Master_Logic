package Master_Logic;

import java.util.Scanner;

public class LCM {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		int x = a, y = b;

		while (y != 0) {
			int temp = y;
			y = x % y;
			x = temp;
		}

		int hcf = x;

		int lcm = (a * b) / hcf;

		System.out.println("LCM = " + lcm);
	}
}
