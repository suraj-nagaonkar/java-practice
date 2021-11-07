// Printing even numbers from a given number using a function

import java.util.Scanner;
class Factorial {
	public static void PrintFactorial(int n){
if (n<0){
	System.out.println("Invalid number");
	return;

}
		int factorial = 1;
		for (int i=n; i>=1; i--){

		
factorial = factorial*i;

		}

		System.out.println(factorial);
	}
public static void main(String args[]){

	
Scanner sc = new Scanner(System.in);
System.out.print("Enter a number : ");
int n = sc.nextInt();
PrintFactorial(n);
}

}