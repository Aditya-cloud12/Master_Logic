package Master_Logic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Greater_In_2_Digit {
//		public static void main(String[] args) {
//			
//			int a = 20;
//			int b = 55;
//			
//			if(a > b) {
//				System.out.println("A is Greater than B");
//			}else {
//				System.out.println("A is not greater than B");
//			}
//		}
	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter A digit");
		String str1 = br.readLine();
		int a = Integer.parseInt(str1);

		InputStreamReader isr1 = new InputStreamReader(System.in);
		BufferedReader br1 = new BufferedReader(isr1);
		System.out.println("Enter B digit");
		String str2 = br1.readLine();
		int b = Integer.parseInt(str2);

		if (a > b) {
			System.out.println("A is greater Than B");
		} else {
			System.out.println("B is greater than A");
		}
	}

}
