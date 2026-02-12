package Master_Logic;

import java.util.Scanner;

public class SumEven {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enetr n :");
	int n = sc.nextInt();
	
	int k = n / 2;
	int sum = k * (k + 1);
	System.out.println("Sum of even numbers = " + sum);
	
}
}
