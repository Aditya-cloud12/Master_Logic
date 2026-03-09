package Master_Logic;

public class SpacesStars {

	public static void main(String[] args) {

		int n = 5;

		for (int i = 1; i <= n; i++) {

			if (i % 2 == 1) {
				System.out.print("*");
			} else {
				System.out.print(" ");
			}

			for (int j = 1; j < n; j++) {
				System.out.print(" *");
			}

			System.out.println();
		}
	}
}
