package Master_Logic;

import java.util.Scanner;

public class DigitCheck2 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter a 3-digit number: ");
			int num = sc.nextInt();

			 if( num >=100 && num<999) {
				 int first = num / 100;
		            int middle = (num / 10) % 10;
		            int last = num % 10;
		            if(first + last == middle) {
		                System.out.println("YES → Sum of first and last digit equals middle digit");
		            } else {
		                System.out.println("NO → Condition not satisfied");
		            }

		        } else {
		            System.out.println("Please enter a valid 3-digit number");
		        }
			 }
		}

