package Master_Logic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberChecker {
	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter Number");
		String str = br.readLine();
		int num = Integer.parseInt(str);

		if (num > 0) {
			System.out.println("It is Positive Number");
		} else if (num < 0) {
			System.out.println("It is negative Number");
		} else {
			System.out.println("It is zero");
		}

	}
}
