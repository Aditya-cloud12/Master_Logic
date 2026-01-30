package Master_Logic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QuadrantCheck {
    public static void main(String[] args) throws IOException {

       	InputStreamReader isr = new InputStreamReader(System.in);
       	BufferedReader br = new BufferedReader(isr);
       	System.out.println("Enter X Value");
       	String str = br.readLine();
       	int x = Integer.parseInt(str);
       	
       	InputStreamReader isr1 = new InputStreamReader(System.in);
       	BufferedReader br1 = new BufferedReader(isr1);
       	System.out.println("Enter Y Value");
       	String str1 = br1.readLine();
       	int y = Integer.parseInt(str);
       	

        if (x > 0 && y > 0) {
            System.out.println("Point lies in First Quadrant");
        } 
        else if (x < 0 && y > 0) {
            System.out.println("Point lies in Second Quadrant");
        } 
        else if (x < 0 && y < 0) {
            System.out.println("Point lies in Third Quadrant");
        } 
        else if (x > 0 && y < 0) {
            System.out.println("Point lies in Fourth Quadrant");
        } 
        else if (x == 0 && y == 0) {
            System.out.println("Point lies at Origin");
        } 
        else {
            System.out.println("Point lies on X-axis or Y-axis");
        }
    }
}
