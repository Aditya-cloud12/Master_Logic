package Master_Logic;

import java.util.Scanner;

public class AMPMCheck {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Hours(0-24) :");
		int hr = sc.nextInt();

		System.out.println("Enter Minutes(0-59) :");
		int min = sc.nextInt();

		if (hr >= 0 && hr < 12) {
			System.out.println("AM");
		} else if (hr >= 12 && hr < 24) {
			System.out.println("PM");
		} else {
			System.out.println("Invalid Time Entry");
		}
	}
}
