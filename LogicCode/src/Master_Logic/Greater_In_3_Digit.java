package Master_Logic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Greater_In_3_Digit {
	public static void main(String[] args) throws IOException {

		InputStreamReader isr1 = new InputStreamReader(System.in);
		BufferedReader br1 = new BufferedReader(isr1);
		System.out.println("Enter A Digit");
		String str1 = br1.readLine();
		int a = Integer.parseInt(str1);

		InputStreamReader isr2 = new InputStreamReader(System.in);
		BufferedReader br2 = new BufferedReader(isr2);
		System.out.println("Enter B Digit");
		String str2 = br1.readLine();
		int b = Integer.parseInt(str2);

		InputStreamReader isr3 = new InputStreamReader(System.in);
		BufferedReader br3 = new BufferedReader(isr3);
		System.out.println("Enter C Digit");
		String str3 = br1.readLine();
		int c = Integer.parseInt(str3);

		if (a> b && a>c) {
			System.out.println("A is greater than B & C");
		} else if (b > c) {
			System.out.println("B is greater than A & C");
		} else {
			System.out.println("C is greater than A & B");
		}

	}
}
