class SolidRhombus {
	public static void main(String[] args) {

		int n = 5; // Row = 5 given in the program

		for (int i = 1; i <= n; i++) {

			// Printing spaces
			int spaces = n - i;
			for (int j = 1; j <= n - i; j++) {

				System.out.print(" ");
			}
			for (int j = 1; j <= n; j++) {

				System.out.print("*");
			}
			System.out.println();
		}

	}
}