import java.util.Scanner;
class CallFunctionMultiply {
public static int Multiply(int a, int b){
	  int Multiplication = a*b; // Directly we can write a*b not necessary to deifine a variable
    return Multiplication;  // returns to the part of the code from where the function was called

	}
	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the first number");
int a = sc.nextInt();
System.out.println("Enter the second number");
int b = sc.nextInt();
int Multiplication = Multiply(a,b);
System.out.println("Multiplication of 2 numbers is : "+ Multiplication);
	}
}

