package Master_Logic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class MiddleDigitCheck {
	public static void main(String[] args) throws IOException {

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter a 3-digit number: ");
		String str = br.readLine();
		int num = Integer.parseInt(str);

		int first = num / 100;
		int middle = (num / 10) % 10;
		int last = num % 10;

		if (middle > first && middle > last) {
			System.out.println("Middle digit is the largest");
		} else if (middle < first && middle < last) {
			System.out.println("Middle digit is the smallest");
		} else {
			System.out.println("Middle digit is neither largest nor smallest");
		}
	}
}
