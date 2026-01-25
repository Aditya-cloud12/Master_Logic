package Master_Logic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharacterChecker {
	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter Any Thing You Want");
		String str = br.readLine();
		char ch = str.charAt(0);

		if (ch == '0' && ch == '9') {
			System.out.println("It is digit");
		} else if (ch >= 'a' && ch <= 'z') {
			System.out.println("It is Lowercase");
		} else if (ch >= 'A' && ch <= 'Z') {
			System.out.println("It is Uppercase");
		} else {
			System.out.println("It is special Character");
		}

	}
}
