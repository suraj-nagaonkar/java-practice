// Creating a function to calculate the factorial of 2 numbers

import java.util.Scanner;

class FunctionJava {
	public static void Table(int n) {
		int table = 1;
		for (int i = 1; i<=10; i++){
			table = n*i;
			System.out.print(table + " ");
		}
	}

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		System.out.print("The table of the number is : ");
		Table(n);

	}
}
