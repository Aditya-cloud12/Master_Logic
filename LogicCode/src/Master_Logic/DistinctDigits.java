package Master_Logic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DistinctDigits {
	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter a 3-digit number: ");
		String str = br.readLine();
		int num = Integer.parseInt(str);

		int digit1 = num / 100;
		int digit2 = (num / 10) % 10;
		int digit3 = num % 10;

		if (digit1 != digit2 && digit1 != digit3 && digit2 != digit3) {
			System.out.println("All digits are distinct");
		} else {
			System.out.println("Digits are not distinct");
		}
	}
}
