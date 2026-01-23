package Master_Logic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DivisibleBy5 {
	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter Number");
		String str = br.readLine();
		int num = Integer.parseInt(str);

		if (num % 5 == 0) {
			System.out.println("It is divisible by 5");
		} else {
			System.out.println("It is not divisible by 5");
		}
	}
}
