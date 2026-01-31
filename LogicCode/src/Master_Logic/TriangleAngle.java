package Master_Logic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TriangleAngle {
	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter First Angle ");
		String str = br.readLine();
		int a = Integer.parseInt(str);

		InputStreamReader isr1 = new InputStreamReader(System.in);
		BufferedReader br1 = new BufferedReader(isr);
		System.out.println("Enter Second Angle");
		String str1 = br1.readLine();
		int b = Integer.parseInt(str1);

//		int c = 180 - (a + b);
//
//		System.out.println(c);
		
		if(a > 0 && b > 0 && (a + b) < 180) {
			int c = 180-(a+b);
			System.out.println("Third Angle Value is = " + c);	
			}else {
				System.out.println("Invalid angle ! Triangle not possible");
		}
	}
}
