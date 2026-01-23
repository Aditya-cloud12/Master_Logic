package Master_Logic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EvenOddChecker {
	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter Number");
		String str = br.readLine();
		int num = Integer.parseInt(str);

		if (num % 2 == 0) {
			System.out.println(num + "  It is Even Number");
		} else {
			System.out.println(num + "  It is Odd Number");
		}
	}
}
