package Master_Logic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CurrencyCheck {
		public static void main(String[] args) throws IOException {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			System.out.println("Enter Amount");
			String str = br.readLine();
			int Rs = Integer.parseInt(str);
			
			if(Rs % 100 == 0) {
				System.out.println("Yes, the amount can be evenly divided into 2000, 500 and 100 notes");
			}else {
				System.out.println("No, the amount can be evenly divided into 2000, 500 and 100 notes");
			}
		}
}
