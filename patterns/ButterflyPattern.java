class ButterflyPattern {
	public static void main(String[] args) {
		// Printing stars in the upper first half

		int n = 4;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}


		
			// Printing spaces between the upper first and second half

			int spaces = 2 * (n - i);

			for (int j = 1; j <= spaces; j++) {

				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {

				System.out.print("*");
			}
			System.out.println();
		}

		// printing complete second half like the above making few changes

	

		for (int i = n; i >= 1; i--) {

			for (int j = 1; j <= i; j++) {

				System.out.print("*");
			}

		
			// Printing spaces between the upper first and second half

			int spaces = 2 * (n - i);

			for (int j = 1; j <= spaces; j++) {

				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {

				System.out.print("*");
			}
			System.out.println();
		}

	}
}