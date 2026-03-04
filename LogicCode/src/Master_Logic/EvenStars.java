package Master_Logic;

public class EvenStars {

	public static void main(String[] args) {

		for (int i = 2; i <= 10; i += 2) { 

			for (int j = 1; j <= i; j++) { 
				System.out.print("*");
			}

			System.out.println(); 
		}
	}
}
