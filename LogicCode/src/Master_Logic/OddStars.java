package Master_Logic;

public class OddStars {
	public class Main {
		public static void main(String[] args) {

			for (int i = 1; i <= 9; i += 2) {
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}

				System.out.println();
			}

		}
	}
}
