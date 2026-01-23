package Master_Logic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VotingEligibility {
		public static void main(String[] args) throws IOException {
		 InputStreamReader isr  = new InputStreamReader(System.in);
		 BufferedReader br = new BufferedReader(isr);
		 System.out.println("Enter Age");
		 String str = br.readLine();
		 int age = Integer.parseInt(str);
		 
		 if(age <=20) {
			 System.out.println("It is Eligible For Vote");
		 }else {
			 System.out.println("It is Not Eligible For Vote");
		 }
		 
		}
}
