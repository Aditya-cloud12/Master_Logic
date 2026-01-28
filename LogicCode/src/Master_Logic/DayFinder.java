package Master_Logic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DayFinder {
	public static void main(String[] args) throws IOException {

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter Day Number (1-7)");
		String str = br.readLine();
		int Day = Integer.parseInt(str);

		switch (Day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesady");
			break;
		case 4:
			System.out.println("Thrusday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		}

//		if (Day == 1) {
//			System.out.println("Monday");
//		} else if (Day == 2) {
//			System.out.println("Tuesday");
//		} else if (Day == 3) {
//			System.out.println("Wednesday");
//		} else if (Day == 4) {
//			System.out.println("Thrusday");
//		} else if (Day == 5) {
//			System.out.println("Friday");
//		} else if (Day == 6) {
//			System.out.println("Saturday");
//		} else if (Day == 7) {
//			System.out.println("Sunday");
//		} else {
//			System.out.println("No Day Found");
//		}
	}
}
