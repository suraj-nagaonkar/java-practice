// Floyd's Triangle
class NumberTriangle {
	public static void main(String[] args) {
		int n = 5;
		int number = 1;

		for (int i = 1; i <= n; i++) {
			// For i = 1, j = 1, System will print only 1 as the limit set by i = 1, same
			// thing is for the other rows
			for (int j = 1; j <= i; j++) {
				System.out.print(" " + number);
				number++;
			}
			System.out.println();
		}
	}
}