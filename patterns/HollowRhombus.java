class HollowRhombus {
	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= n; i++) {

			int spaces = n - i;

			if (i == 1 || i == 5) {

				for (int j = 1; j <= spaces; j++) {

					System.out.print(" ");

				}

				for (int j = 1; j <= n; j++) {

					System.out.print("*");
				}
			}

			else {
				for (int j = 1; j <= spaces; j++) {

					System.out.print(" ");
				}

				for (int j = 1; j <= n; j++) {
					if (j == 1 || j == n) {
						System.out.print("*");

					} else {
						System.out.print(" ");

					}
				}

			}
			System.out.println();
		}

	}
}