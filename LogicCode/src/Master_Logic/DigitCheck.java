package Master_Logic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DigitCheck {
	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter Digit");
		String str = br.readLine();
		int num = Integer.parseInt(str);

		if (num <= 9) {
			System.out.println("Single Digit Number");
		} else if (num <= 99) {
			System.out.println("Double Digit Number");
		} else if (num <= 999) {
			System.out.println("Triple Digit Number");
		} else {
			System.out.println("Multi Digit Number");
		}
	}
}
