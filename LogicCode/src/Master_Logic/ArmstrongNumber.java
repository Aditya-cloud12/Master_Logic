package Master_Logic;

import java.util.Scanner;

public class ArmstrongNumber {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Number");
			int num = sc.nextInt();
			int temp = num;
			int sum = 0;
			
			while(num != 0) {
				int r=num%10;
				sum+=r*r*r;
				num/=10;
			}
			if(sum == temp)
			    System.out.println("Armstrong Number");
			else
			    System.out.println("Not Armstrong Number");
		}
}
