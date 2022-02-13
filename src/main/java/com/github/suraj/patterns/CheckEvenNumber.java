// Creating a function to calculate the factorial of 2 numbers

import java.util.Scanner;

class CheckEven {
	public static void EvenNumber(int n) {
		if (n % 2 == 0) {
			System.out.println("The number entered is even");
		} else {

			System.out.println("The number entered is not an even number");
		}
	}

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		EvenNumber(n);

	}
}
