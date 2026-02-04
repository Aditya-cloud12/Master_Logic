package Master_Logic;

import java.util.Scanner;

public class ElectricityBill {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter units consumed");
		int units = sc.nextInt();
		double bill;
		
		if (units <= 100) {
			bill = units * 1;
		} else if (units <= 200) {
			bill = 100 * 1 + (units - 100) * 2;
		} else if (units <= 300) {
			bill = 100 * 1 + 100 * 2 + (units - 200) * 3;
		} else {
			bill = 100 * 1 + 100 * 2 + 100 * 3 + (units - 300) * 5;
		}

		System.out.println("Electricity Bill = ₹" + bill);
	}
}
