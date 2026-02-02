package Master_Logic;

import java.util.Scanner;

public class WeekdayOrWeekend {

	    public static void main(String[] args) {

	     Scanner sc = new Scanner(System.in);
	     
	     System.out.println("Enter Day Number :");
	     int day = sc.nextInt();
	     
	        if (day >= 1 && day <= 5) {
	            System.out.println("Weekday");
	        } else if (day == 6 || day == 7) {
	            System.out.println("Weekend");
	        } else {
	            System.out.println("Invalid day number");
	        }
	    }
	}


