package Master_Logic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintCondition {
		public static void main(String[] args) throws IOException {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			System.out.println("Enter Number");
			String str = br.readLine();
			int num = Integer.parseInt(str);
			
			if(num % 3 == 0 && num % 5 == 0) {
				System.out.println("It is FizzBuzz");
			}else if ( num % 5 == 0) {
				System.out.println("It is Buzz");
			}else if ( num % 3 == 0 ) {
				System.out.println("It is Fizz");
			}else {
				System.out.println("No Fizz , No Buzz");
			}
		}
}
