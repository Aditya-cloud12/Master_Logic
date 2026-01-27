package Master_Logic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GreetingSystem {
	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter the hour (0-23): ");
		String str = br.readLine();
		int hour = Integer.parseInt(str);

		if (hour >= 6 && hour < 12) {
			System.out.println("Good Morning");
		} else if (hour >= 12 && hour < 17) {
			System.out.println("Good Afternoon");
		} else if (hour >= 17 && hour < 21) {
			System.out.println("Good Evening");
		} else if ((hour >= 21 && hour <= 23) || (hour >= 0 && hour < 6)) {
			System.out.println("Good Night");
		} else {
			System.out.println("Invalid hour! Please enter a number between 0 and 23.");
		}
	}
}
