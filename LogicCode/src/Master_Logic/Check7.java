package Master_Logic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Check7 {
	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter the Number");
		String str = br.readLine();
		int num = Integer.parseInt(str);

		if (num % 7 == 0 || num % 10 == 7) {
			System.out.println("Yes, the number is a multiple of 7 or ends with 7");
		} else {
			System.out.println("No, the number is not a multiple of 7 and does not end with 7");
		}
	}
}
