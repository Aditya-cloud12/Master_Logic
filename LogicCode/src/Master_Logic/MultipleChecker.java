package Master_Logic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultipleChecker {
	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("First Number");
		String str = br.readLine();
		int first = Integer.parseInt(str);

		InputStreamReader isr1 = new InputStreamReader(System.in);
		BufferedReader br1 = new BufferedReader(isr1);
		System.out.println("Second Number");
		String str1 = br1.readLine();
		int second = Integer.parseInt(str1);

		if (first == 0 || second == 0) {
			System.out.println("Zero is a special case in math");
		} else if (first % second == 0) {
			System.out.println(first + " is a multiple of " + second);
		} else if (second % first == 0) {
			System.out.println(second + " is a multiple of " + first);
		} else {
			System.out.println("Neither number is a multiple of the other.");
		}
	}
}
