package Master_Logic;

import java.util.Scanner;

public class PasswordCheck {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter password: ");
		String pwd = sc.nextLine();

		int digit = 0;

		for (int i = 0; i < pwd.length(); i++) {
			if (pwd.charAt(i) >= '0' && pwd.charAt(i) <= '9') {
				digit++;
				break;
			}
		}

		if (pwd.length() >= 8 && digit > 0)
			System.out.println("Valid Password");
		else
			System.out.println("Invalid Password");
	}

}
