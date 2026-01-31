package Master_Logic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RangeCheck {
	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter Digit");
		String str = br.readLine();
		int num = Integer.parseInt(str);

		if (num >= 100 && num <= 999) {
			System.out.println("The number lies in the range 100 to 999.");
		} else {
			System.out.println("The number does NOT lie in the range 100 to 999.");
		}
	}
}
