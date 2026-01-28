package Master_Logic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AlphabetCheck {
		public static void main(String[] args) throws IOException { 
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			System.out.println("Enter char");
			String str = br.readLine();
			char ch = str.charAt(0);
			
			if(ch <= 'a' && ch >='m') {
				System.out.println("It lies between ‘a’ and ‘m’");
			}else if(ch <= 'n' && ch >='z') {
				System.out.println("It lies between ‘n’ and ‘z’");
			}else {
				System.out.println("It is not valid char");
			}
		}
}
