package Master_Logic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OddEvenChecker {
	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter a Number");
		String str = br.readLine();
		int a = Integer.parseInt(str);
		
		InputStreamReader isr1 = new InputStreamReader(System.in);
		BufferedReader br1 = new BufferedReader(isr1);
		System.out.println("Enter b Number");
		String str1 = br.readLine();
		int b = Integer.parseInt(str1);
		
		if (a % 2 == 0 && b % 2 == 0) {
            System.out.println("Both are even.");
        } 
        else if (a % 2 != 0 && b % 2 != 0) {
            System.out.println("Both are odd.");
        } 
        else {
            System.out.println("One is even and one is odd.");
        }
	}
}
