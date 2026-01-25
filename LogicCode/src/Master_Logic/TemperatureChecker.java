package Master_Logic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TemperatureChecker {
	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter Temperature");
		String str = br.readLine();
		int tem = Integer.parseInt(str);

		if (tem < 15) {
			System.out.println("It is cold");
		} else if (tem < 45) {
			System.out.println("It is warm");
		} else {
			System.out.println("It is hot");

		}
	}
}
