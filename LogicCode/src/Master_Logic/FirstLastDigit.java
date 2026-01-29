package Master_Logic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FirstLastDigit {
	public static void main(String[] args) throws IOException {

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter a 4-digit number: ");
		String str = br.readLine();
		int num = Integer.parseInt(str);

		int first = num / 1000;
		int last = num % 10;

		if (first == last) {
			System.out.println("First and last digits are equal");
		} else {
			System.out.println("First and last digits are not equal");
		}
	}
}
