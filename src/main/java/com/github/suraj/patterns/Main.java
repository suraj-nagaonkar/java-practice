class Main {
	public static void main(String[] args) {
		// Printing stars in the upper first half
		int n = 5;

		// rows
		for (int i = 1; i <= n; i++) {
			// left starts
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			// mid spaces
			int spaces = 2 * (n - i);
			for (int j = 1; j <= spaces; j++) {
				System.out.print(" ");
			}

			// right stars
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// rows with reverse logic
		for (int i = n; i >= 1; i--) {
			// left starts
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			// mid spaces
			int spaces = 2 * (n - i);
			for (int j = 1; j <= spaces; j++) {
				System.out.print(" ");
			}

			// right stars
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}