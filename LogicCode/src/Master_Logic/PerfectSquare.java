package Master_Logic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PerfectSquare {
	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter number");
		String str = br.readLine();
		int num = Integer.parseInt(str);
		
		int i = 1;
		boolean Perfect = false;

		while (i * i <= num) {
			if (i * i == num) {
				Perfect = true;
				break;
			}
			i++;
		}
		if (Perfect) {
			System.out.println("Perfect Square");
		} else {
			System.out.println("Not Perfect Square");
		}
	}
}
