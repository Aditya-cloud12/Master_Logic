package Master_Logic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ValidTriangleCheck {
	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("First Side Value");
		String str = br.readLine();
		int a = Integer.parseInt(str);

		InputStreamReader isr1 = new InputStreamReader(System.in);
		BufferedReader br1 = new BufferedReader(isr1);
		System.out.println("Second Side Value");
		String str1 = br1.readLine();
		int b = Integer.parseInt(str1);

		InputStreamReader isr2 = new InputStreamReader(System.in);
		BufferedReader br2 = new BufferedReader(isr2);
		System.out.println("Third Side Value");
		String str2 = br.readLine();
		int c = Integer.parseInt(str2);

		if (a + b > c && a + c > b && b + c > a) {
			System.out.println("It is valid Triangle");
		} else {
			System.out.println("It is not valid Triangle");
		}

	}
}
