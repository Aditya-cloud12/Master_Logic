package Master_Logic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TriangleChecker {
	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter Value of First Side");
		String str = br.readLine();
		int a = Integer.parseInt(str);

		InputStreamReader isr1 = new InputStreamReader(System.in);
		BufferedReader br1 = new BufferedReader(isr1);
		System.out.println("Enter Value of Second Side");
		String str1 = br.readLine();
		int b = Integer.parseInt(str1);

		InputStreamReader isr2 = new InputStreamReader(System.in);
		BufferedReader br2 = new BufferedReader(isr2);
		System.out.println("Enter Value of Third Side");
		String str2 = br.readLine();
		int c = Integer.parseInt(str2);

		if (a == b && b == c) {
			System.out.println("It is Equilateral Triangle ");
		} else if (a == b || b == c || a== c) {
			System.out.println("It is Isosceles Triangle");
		} else {
			System.out.println("It is Scalene Triangle");
		}
	}
}
