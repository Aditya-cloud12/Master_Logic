package Master_Logic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GradeChecker {
		public static void main(String[] args) throws IOException {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			System.out.println("Enter Marks");
			String str = br.readLine();
			int marks = Integer.parseInt(str);
			
			if(marks > 80) {
				System.out.println("It is pass with Grade A");
			}else if(marks > 60) {
				System.out.println("It is pass with Grade B");
			}else if(marks > 30) {
				System.out.println("It is pass with Grade C");
			}else {
				System.out.println("It is pass with Grade D");
			}
		}
}
