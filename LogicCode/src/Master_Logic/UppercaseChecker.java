package Master_Logic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UppercaseChecker {
	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter char ");
		String str = br.readLine();
		char ch = str.charAt(0);
		if (ch >= 'A' && ch <= 'Z') {
			System.out.println("It is Uppercase Character");
		} else {
			System.out.println("It is Not Uppercase Character");
		}
	}

}
